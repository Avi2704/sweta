package com.lams.asset.service;

import com.lams.asset.entity.AssetStatus;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class AssetStateMachineServiceTest {
    private final AssetStateMachineService service = new AssetStateMachineService();

    @Test
    void shouldThrowConflictOnInvalidStateTransition() {
        assertThrows(ResponseStatusException.class, () -> service.transition(AssetStatus.AVAILABLE, AssetStatus.RETURNED));
    }

    @Test
    void shouldAllowValidTransition() {
        assertEquals(AssetStatus.REQUESTED, service.transition(AssetStatus.AVAILABLE, AssetStatus.REQUESTED));
    }
}
