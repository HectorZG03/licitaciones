package com.example.licitaciones.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello(){
        return ("HOLA DESDE SPRING BOOT HELLOCONTROLLER :) BACKEND");
    }
}
