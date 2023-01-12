package com.Bridgelabz.HelloMessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloMessagingAppController {
    @GetMapping("")
    public String hello(){
        return "Hello from Bridgelabz";
    }
}
