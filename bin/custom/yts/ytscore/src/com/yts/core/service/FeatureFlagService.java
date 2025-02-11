package com.yts.core.service;

public interface FeatureFlagService {

    Boolean isFeatureEnabled(String featureCode);
}
