package com.yts.core.service.impl;

import com.yts.core.dao.FeatureFlagDao;
import com.yts.core.service.FeatureFlagService;
import org.apache.log4j.Logger;

public class DefaultFeatureFlagService implements FeatureFlagService {

    private static final Logger LOG = Logger.getLogger(DefaultFeatureFlagService.class);
    private FeatureFlagDao featureFlagDao;

    @Override
    public Boolean isFeatureEnabled(String featureCode) {
        return featureFlagDao.isFeatureEnabled(featureCode);
    }

    public void setFeatureFlagDao(FeatureFlagDao featureFlagDao) {
        this.featureFlagDao = featureFlagDao;
    }
}
