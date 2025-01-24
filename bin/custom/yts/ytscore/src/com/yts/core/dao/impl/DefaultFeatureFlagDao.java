package com.yts.core.dao.impl;

import com.yts.core.dao.FeatureFlagDao;
import com.yts.core.model.FeatureFlagModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;

public class DefaultFeatureFlagDao extends AbstractItemDao implements FeatureFlagDao {

    private static final Log LOG = LogFactory.getLog(DefaultFeatureFlagDao.class);

    private static final StringBuilder BASE_QUERIE = new StringBuilder("SELECT ");

    private static final StringBuilder FIND_ALL_DATA_FOR_FEATURE_FLAG = BASE_QUERIE.append("* FROM {FeatureFlag as ff} WHERE {ff.code} = ?code");
    private static final StringBuilder FIND_ENABLE_FEATURE_FLAG_BY_CODE = BASE_QUERIE.append("{ff.enabled} FROM {FeatureFlag as ff} WHERE {ff.code} = ?code");


    @Override
    public Boolean isFeatureEnabled(String code) {
        LOG.info("Checking if feature is enabled for code: " + code);
        final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_ENABLE_FEATURE_FLAG_BY_CODE.toString());
        query.addQueryParameter("code", code);

        SearchResult<Boolean> result = getFlexibleSearchService().search(query);
        return result.getResult().isEmpty() ? Boolean.FALSE : result.getResult().get(0);
    }


    @Override
    public List<FeatureFlagModel> find() {
        return List.of();
    }

    @Override
    public List<FeatureFlagModel> find(Map<String, ?> map) {
        return List.of();
    }

    @Override
    public List<FeatureFlagModel> find(SortParameters sortParameters) {
        return List.of();
    }

    @Override
    public List<FeatureFlagModel> find(Map<String, ?> map, SortParameters sortParameters) {
        return List.of();
    }

    @Override
    public List<FeatureFlagModel> find(Map<String, ?> map, SortParameters sortParameters, int i) {
        return List.of();
    }
}
