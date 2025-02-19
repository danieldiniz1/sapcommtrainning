package com.yts.facades.band;


import com.yts.facades.concerttours.data.BandData;

import java.util.List;

public interface BandFacade {

    BandData getBand(final String name);
    List<BandData> getBands();
}
