package com.example.simple_web_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.simple_web_service.services.SchoolService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SchoolController {

    public SchoolService schoolService;

    @Autowired
    SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping(value="/classes")
    public List<String> getClasses() {
        return this.schoolService.getClasses();
    }
}
