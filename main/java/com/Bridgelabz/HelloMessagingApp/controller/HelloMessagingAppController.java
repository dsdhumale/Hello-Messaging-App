package com.Bridgelabz.HelloMessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Bridgelabz.HelloMessagingApp.controller.dto.User;

@RestController
@RequestMapping("/hello")

//Url : http://localhost:8080/hello
public class HelloMessagingAppController {
    @GetMapping("")
    public String hello(){
        return "Hello from Bridgelabz";
    }

//Url : http://localhost:8080/hello/query?name=Devendra
    @GetMapping("/query")
    public String queryParam(@RequestParam String name){
        return "Hello " + name + " from Bridgelabz" ;
    }

//Url : http://localhost:8080/hello/path/Devendra
    @GetMapping("/path/{name}")
    public String nameParam(@PathVariable String name){
        return "Hello " + name + " !!!!" ;
    }

//Url : http://localhost:8080/hello/post    
    @PostMapping("/post")
    public String userName(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() +"!";
    }

//Url : http://localhost:8080/hello/put/Devendra/?lastName=Dhumale    
    @PutMapping("/put/{firstName}/")
    public String updateName(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + "!!";
    }

}

