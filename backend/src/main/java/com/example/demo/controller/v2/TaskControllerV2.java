package com.example.demo.controller.v2;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/tasks") // path defines version (v2)
public class TaskControllerV2 {

    @GetMapping
    public List<Map<String, Object>> getAllTasks() {
        // More complex. Objects wit ID und Status
        return List.of(
            Map.of("id", 1, "task", "Wäsche waschen", "done", false),
            Map.of("id", 2, "task", "Code refactoren", "done", true)
        );
    }
}