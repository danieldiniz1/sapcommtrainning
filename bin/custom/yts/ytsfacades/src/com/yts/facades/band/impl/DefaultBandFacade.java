package com.yts.facades.band.impl;

import com.yts.core.model.BandModel;
import com.yts.core.service.BandService;
import com.yts.facades.band.BandFacade;
import com.yts.facades.concerttours.data.BandData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class DefaultBandFacade implements BandFacade {

    private BandService bandService;
    private Converter<BandModel, BandData> bandDataConverter;


    @Override
    public BandData getBand(String name) {
        return bandDataConverter.convert(bandService.findBandByName(name));
    }

    @Override
    public List<BandData> getBands() {
        List<BandData> listOfBands = bandService.findAllBands().stream()
                .map(bandDataConverter::convert).toList();
        return listOfBands.isEmpty() ? List.of() : listOfBands;
    }

    public void setBandService(BandService bandService) {
        this.bandService = bandService;
    }

    public void setBandDataConverter(Converter<BandModel, BandData> bandDataConverter) {
        this.bandDataConverter = bandDataConverter;
    }
}
