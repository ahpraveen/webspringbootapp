package com.example.webspringbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "Praveen") String name){
        return String.format("Hello %s", name);
    }
}
