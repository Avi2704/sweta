package com.lams.audit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/audit")
public class HealthController {
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("service", "audit-service", "status", "ok");
    }
}
