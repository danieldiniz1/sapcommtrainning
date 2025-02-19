package com.yts.facades.band;


import com.yts.facades.concerttours.data.TourData;

public interface TourFacade {

    TourData getTourDetails(final String tourId);
}
