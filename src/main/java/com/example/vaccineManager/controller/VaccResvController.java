package com.example.vaccineManager.controller;

import com.example.vaccineManager.dto.HospitalDto;
import com.example.vaccineManager.dto.JuminDto;
import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.dto.VaccResvStatusDto;
import com.example.vaccineManager.service.HospitalService;
import com.example.vaccineManager.service.JuminService;
import com.example.vaccineManager.service.VaccResvService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class VaccResvController {

    @Autowired JuminService juminService;
    @Autowired HospitalService hospitalService;
    @Autowired VaccResvService vaccResvService;

    //메인화면 표시
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //백신예약 등록
    @GetMapping("/save")
    public String save(Model model) {
        model.addAttribute("vaccResvDto", new VaccResvDto());
        return "save";
    }

    @PostMapping("/save")
    public String saveVaccResv(@Valid @ModelAttribute("vaccResvDto")
                               VaccResvDto vaccResvDto,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "save";
        }
        vaccResvService.save(vaccResvDto);
        return "redirect:/";
    }

    //백신예약 조회(조건부)
    @GetMapping("/list")
    public String list() {
        return "list";
    }

    //백신예약 조회 결과(조건부)
    @GetMapping("/list/detail")
    public String listDetail(@RequestParam(value = "searchKeyword", required = false) String searchKeyword, Model model) {
        if (searchKeyword != null && !searchKeyword.isEmpty()) {
            VaccResvDto vaccResv = vaccResvService.searchByKeyword(searchKeyword);
            if (vaccResv != null) {
                JuminDto jumin = juminService.findByJumin(vaccResv.getJumin());
                HospitalDto hospital = hospitalService.findByHospCode(vaccResv.getHospCode());

                model.addAttribute("vaccResv", vaccResv);
                model.addAttribute("jumin", jumin);
                model.addAttribute("hospital", hospital);

                String gender = getGender(vaccResv.getJumin());
                model.addAttribute("gender", gender);

                String formattedDate = vaccResv.getResvDate().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
                model.addAttribute("formattedDate", formattedDate);

                String formattedTime = getFormattedTime(vaccResv.getResvTime());
                model.addAttribute("formattedTime", formattedTime);

                String hospitalRegion = getHospitalRegion(hospital.getHospAddr());
                model.addAttribute("hospitalRegion", hospitalRegion);

                String vaccineName = getVaccineName(vaccResv.getVCode());
                model.addAttribute("vaccineName", vaccineName);
            } else {
                model.addAttribute("noResults", true);
            }
        } else {
            model.addAttribute("noResults", true);
        }
        return "listdetail";
    }

    private String getGender(String jumin) {
        char genderCode = jumin.split("-")[1].charAt(0);
        if (genderCode == '1' || genderCode == '3') {
            return "남";
        } else if (genderCode == '2' || genderCode == '4') {
            return "여";
        }
        return "";
    }

    public String getFormattedTime(String time) {
        if (time == null || time.length() != 4) {
            return "Invalid Time";
        }
        String hour = time.substring(0, 2);
        String minute = time.substring(2, 4);
        return hour + ":" + minute;
    }

    private String getHospitalRegion(String hostAddr) {
        switch (hostAddr) {
            case "10":
                return "서울";
            case "20":
                return "대전";
            case "30":
                return "대구";
            case "40":
                return "광주";
            default:
                return "알 수 없음";
        }
    }

    private String getVaccineName(String vCode) {
        switch (vCode) {
            case "V001":
                return "A백신";
            case "V002":
                return "B백신";
            case "V003":
                return "C백신";
            default:
                return "알 수 없음";
        }
    }


    //백신예약 현황 조회(지역별)
    @GetMapping("/status")
    public String reservationStatus(Model model) {
        List<VaccResvStatusDto> statusList = vaccResvService.getReservationStatus();

        // 미리 정의된 병원 지역과 이름
        String[][] regions = {
                {"10", "서울"},
                {"20", "대전"},
                {"30", "대구"},
                {"40", "광주"}
        };

        List<VaccResvStatusDto> completeStatusList = new ArrayList<>();
        int totalReservationCount = 0;

        for (String[] region : regions) {
            String regionCode = region[0];
            String regionName = region[1];
            int reservationCount = 0;

            // 예약 현황 데이터를 반영하여 예약 건수를 업데이트합니다.
            for (VaccResvStatusDto status : statusList) {
                if (status.getHospitalRegion().equals(regionCode)) {
                    reservationCount = status.getReservationCount();
                    break;
                }
            }

            completeStatusList.add(new VaccResvStatusDto(regionCode, regionName, reservationCount));
            totalReservationCount += reservationCount;
        }

        model.addAttribute("statusList", completeStatusList);
        model.addAttribute("totalReservationCount", totalReservationCount);
        return "status";
    }
}
