package com.yts.core.dao;

import com.yts.core.model.BandModel;
import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.Optional;

public interface BandDao extends GenericDao<BandModel> {
    Optional<BandModel> findByName(String name);
}
