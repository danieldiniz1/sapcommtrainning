package com.yts.core.service;

import com.yts.core.model.BandModel;

import java.util.List;

public interface BandService {

    List<BandModel> findAllBands();
    BandModel findBandByName(String name);
}
