package com.example.taskmanager.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public double calculate(double a, double b, String operation) {
        return switch (operation.toLowerCase()) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> throw new IllegalArgumentException("Invalid operation");
        };
    }
}
