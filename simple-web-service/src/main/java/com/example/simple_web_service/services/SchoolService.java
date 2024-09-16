package com.example.simple_web_service.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SchoolService {

    public List<String> getClasses() {
        return Arrays.asList("capstone", "CS 4400", "CS 4150", "Math 2210");
    }
}
