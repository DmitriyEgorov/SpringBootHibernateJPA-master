package com.covid.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController {
    @RequestMapping(value = {"/", "/home"})
    public String  getHomePage(){
        return "home";
    }
}
