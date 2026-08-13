package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SaludoControllerV1 {
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde la versión 1.0.0 de la API";
    }
        @PostMapping
    public String despedida(){
        return "despedida de la verision actual (1.1.0)";
    }
    
}
