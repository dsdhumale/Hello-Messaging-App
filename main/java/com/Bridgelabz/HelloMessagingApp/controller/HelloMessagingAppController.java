package com.Bridgelabz.HelloMessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Bridgelabz.HelloMessagingApp.controller.dto.User;

@RestController
@RequestMapping("/hello")

public class HelloMessagingAppController {
    @GetMapping("")
    public String hello(){
        return "Hello from Bridgelabz";
    }

    @GetMapping("/query")
    public String queryParam(@RequestParam String name){
        return "Hello " + name + " from Bridgelabz" ;
    }

    @GetMapping("/path/{name}")
    public String nameParam(@PathVariable String name){
        return "Hello " + name + " !!!!" ;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() +"!";
    }

}

