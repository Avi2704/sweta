package com.lams.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class HealthController {
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("service", "auth-service", "status", "ok");
    }
}
