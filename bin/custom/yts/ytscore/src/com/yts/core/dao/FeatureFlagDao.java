package com.yts.core.dao;

import com.yts.core.model.FeatureFlagModel;
import de.hybris.platform.servicelayer.internal.dao.GenericDao;

public interface FeatureFlagDao extends GenericDao<FeatureFlagModel> {

    Boolean isFeatureEnabled(String featureCode);
}
