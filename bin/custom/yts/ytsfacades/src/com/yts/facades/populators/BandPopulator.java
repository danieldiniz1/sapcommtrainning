package com.yts.facades.populators;

import com.yts.core.model.BandModel;
import com.yts.facades.concerttours.data.BandData;
import de.hybris.platform.converters.Populator;

public class BandPopulator implements Populator<BandModel, BandData> {

    @Override
    public void populate(BandModel source, BandData target) {
        target.setId(source.getCode());
        target.setName(source.getName());
        target.setDescription(source.getHistory());
        target.setAlbumsSold(source.getAlbumSales());
    }
}
