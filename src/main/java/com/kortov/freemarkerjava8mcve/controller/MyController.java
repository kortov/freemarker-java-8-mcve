package com.kortov.freemarkerjava8mcve.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MyController {

    private Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping
    public String getPage(Model model) {
        LocalDateTime localDateTime = LocalDateTime.now();
        model.addAttribute("myDate", localDateTime);
        logger.error("localDateTime: {}", localDateTime);
        return "template";
    }
}
