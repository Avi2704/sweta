package com.lams.asset.dto.request;

import com.lams.asset.entity.AssetStatus;
import jakarta.validation.constraints.NotNull;

public record AssetTransitionRequest(@NotNull AssetStatus targetState, String reason) {}
