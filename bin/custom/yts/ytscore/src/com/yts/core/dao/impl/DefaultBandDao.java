package com.yts.core.dao.impl;

import com.yts.core.dao.BandDao;
import com.yts.core.model.BandModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.internal.dao.SortParameters;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DefaultBandDao extends AbstractItemDao implements BandDao {

    private static final Log LOG = LogFactory.getLog(DefaultBandDao.class);

    private static final StringBuilder BASE_QUERIE = new StringBuilder("SELECT ");
    private static final StringBuilder FIND_ALL_DATA_FOR_BANDS = BASE_QUERIE.append("* FROM {Band as b} ");
    private static final StringBuilder FIND_BAND_BY_NAME = FIND_ALL_DATA_FOR_BANDS.append("WHERE {b.name} = ?name");


    @Override
    public List<BandModel> find() {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_ALL_DATA_FOR_BANDS.toString());
        SearchResult<BandModel> bands = getFlexibleSearchService().search(query);
        if (bands.getResult().isEmpty()) {
            LOG.info("No bands found");
            return List.of();
        }
        return bands.getResult();
    }

    @Override
    public Optional<BandModel> findByName(String name) {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_BAND_BY_NAME.toString());
        query.addQueryParameter("name", name);
        SearchResult<BandModel> bands = getFlexibleSearchService().search(query);

        return bands.getResult().isEmpty() ? Optional.empty() : Optional.of(bands.getResult().get(0));
    }

    @Override
    public List<BandModel> find(Map<String, ?> map) {
        return List.of();
    }

    @Override
    public List<BandModel> find(SortParameters sortParameters) {
        return List.of();
    }

    @Override
    public List<BandModel> find(Map<String, ?> map, SortParameters sortParameters) {
        return List.of();
    }

    @Override
    public List<BandModel> find(Map<String, ?> map, SortParameters sortParameters, int i) {
        return List.of();
    }


}
