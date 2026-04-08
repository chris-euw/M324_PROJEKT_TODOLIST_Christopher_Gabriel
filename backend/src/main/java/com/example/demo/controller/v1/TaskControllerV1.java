package com.example.demo.controller.v1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tasks") // Path defines version 
public class TaskControllerV1 {

    @GetMapping
    public List<String> getAllTasks() {
        // Only strings, no IDs or status
        return List.of("Wäsche waschen", "Code refactoren");
    }
}