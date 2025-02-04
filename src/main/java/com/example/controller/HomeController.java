package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Returns "home" which will be resolved to /WEB-INF/jsp/home.jsp
        return "home";
    }
}