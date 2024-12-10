package com.example.taskmanager.controller;

import com.example.taskmanager.service.MathService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping
    public ResponseEntity<Double> calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam String operation) {
        return ResponseEntity.ok(mathService.calculate(a, b, operation));
    }
}
