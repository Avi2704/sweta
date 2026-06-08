package com.lams.asset.controller;

import com.lams.asset.dto.request.AssetTransitionRequest;
import com.lams.asset.entity.AssetStatus;
import com.lams.asset.service.AssetStateMachineService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/assets")
public class AssetController {
    private final AssetStateMachineService stateMachineService;

    public AssetController(AssetStateMachineService stateMachineService) {
        this.stateMachineService = stateMachineService;
    }

    @GetMapping
    public Map<String, Object> list() {
        return Map.of("success", true, "data", java.util.List.of(), "message", "ok", "timestamp", java.time.Instant.now().toString(), "correlationId", "local");
    }

    @PostMapping("/{id}/transition")
    public Map<String, Object> transition(@PathVariable Long id,
                                          @RequestParam AssetStatus current,
                                          @RequestBody @Valid AssetTransitionRequest request) {
        AssetStatus newState = stateMachineService.transition(current, request.targetState());
        return Map.of("success", true, "data", Map.of("assetId", id, "status", newState), "message", "state updated", "timestamp", java.time.Instant.now().toString(), "correlationId", "local");
    }

    @GetMapping("/{id}/qr")
    public Map<String, Object> qr(@PathVariable Long id) {
        return Map.of("success", true, "data", Map.of("assetId", id, "qrCodeUrl", "/qr/ASSET-" + id), "message", "ok", "timestamp", java.time.Instant.now().toString(), "correlationId", "local");
    }

    @GetMapping("/public/qr/{assetTag}")
    public Map<String, Object> publicQr(@PathVariable String assetTag) {
        return Map.of("assetTag", assetTag, "status", "AVAILABLE", "openTicketCount", 0);
    }
}
