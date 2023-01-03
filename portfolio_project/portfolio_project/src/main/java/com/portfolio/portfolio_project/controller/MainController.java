package com.portfolio.portfolio_project.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {
    @RequestMapping("/")
    private String Main_page() {
        return "도착하셨구먼그려";
    }

}