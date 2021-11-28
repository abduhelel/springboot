package com.example.emsthyneleaf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    public static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("name","Aaron");
        log.debug("demo ok");
        return "demo";
    }
}
