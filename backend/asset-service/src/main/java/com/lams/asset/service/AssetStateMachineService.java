package com.lams.asset.service;

import com.lams.asset.entity.AssetStatus;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.Set;

@Service
public class AssetStateMachineService {
    private static final Map<AssetStatus, Set<AssetStatus>> VALID = Map.of(
            AssetStatus.AVAILABLE, Set.of(AssetStatus.REQUESTED),
            AssetStatus.REQUESTED, Set.of(AssetStatus.APPROVED, AssetStatus.AVAILABLE),
            AssetStatus.APPROVED, Set.of(AssetStatus.ASSIGNED),
            AssetStatus.ASSIGNED, Set.of(AssetStatus.IN_USE),
            AssetStatus.IN_USE, Set.of(AssetStatus.UNDER_MAINTENANCE, AssetStatus.RETURNED),
            AssetStatus.UNDER_MAINTENANCE, Set.of(AssetStatus.IN_USE),
            AssetStatus.RETURNED, Set.of(AssetStatus.AVAILABLE)
    );

    public AssetStatus transition(AssetStatus current, AssetStatus target) {
        if (!VALID.getOrDefault(current, Set.of()).contains(target)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "Invalid transition: " + current + " -> " + target);
        }
        return target;
    }
}
