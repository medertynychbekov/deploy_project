package com.example.deploy_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/get")
    public String helloWorld(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("")
    public String secondMethod() {
        return "second endpoint!";
    }
}