package com.example.vaccineManager.controller;

import com.example.vaccineManager.dto.VaccResvDto;
import com.example.vaccineManager.service.VaccResvService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
}
