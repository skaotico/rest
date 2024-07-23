package com.moveapps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    @Operation(summary = "Test endpoint")
    public String testEndpoint() {
        return "Test endpoint";
    }
}
