package com.yts.core.service.impl;

import com.yts.core.dao.BandDao;
import com.yts.core.dao.impl.DefaultBandDao;
import com.yts.core.model.BandModel;
import com.yts.core.service.BandService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class DefaultBandService implements BandService {

    private static final Log LOG = LogFactory.getLog(DefaultBandService.class);

    private BandDao bandDao;

    @Override
    public List<BandModel> findAllBands() {
        return bandDao.find();
    }

    public void setBandDao(BandDao bandDao) {
        this.bandDao = bandDao;
    }

}
