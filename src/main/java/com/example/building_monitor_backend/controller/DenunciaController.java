package com.example.building_monitor_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/denuncia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DenunciaController {

    @GetMapping
    public String olaMundo() {
        return "Hello World Spring!";
    }
}
