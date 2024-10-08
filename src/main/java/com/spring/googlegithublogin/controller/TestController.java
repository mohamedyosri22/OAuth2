package com.spring.googlegithublogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class TestController {
    @GetMapping
    public String sayHello(){
        return "Hello mf !!";
    }
}
