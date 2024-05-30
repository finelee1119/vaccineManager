package com.example.vaccineManager.controller;

import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.entity.VaccResv;
import com.example.vaccineManager.service.VaccResvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VaccResvController {

    @Autowired
    VaccResvService vaccResvService;

    //메인화면
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //백신예약(등록)
    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String saveVaccResv(VaccResvDto vaccResvDto) {
        System.out.println("vaccResvDto : " + vaccResvDto.toString());
        vaccResvService.save(vaccResvDto);
        return "redirect:/list";
    }


}
