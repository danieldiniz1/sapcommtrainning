package com.yts.controllers;

import com.yts.constants.YtsoccConstants;
import com.yts.facades.band.BandFacade;
import com.yts.facades.concerttours.data.BandData;
import com.yts.occ.concerttours.dto.BandWsDto;
import de.hybris.platform.b2bocc.v2.controllers.BaseController;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
@ApiVersion("v2")
@Tag(name = "Bands")
@RequestMapping(value = "/{baseSiteId}")
public class BandController extends BaseController {

    @Resource(name = "bandFacade")
    private BandFacade bandFacade;
    @Secured({ YtsoccConstants.ROLE_CUSTOMERGROUP, YtsoccConstants.ROLE_GUEST,
            YtsoccConstants.ROLE_CUSTOMERMANAGERGROUP, YtsoccConstants.ROLE_TRUSTED_CLIENT })
    @Operation(operationId = "Get all bands", summary = "Get all bands",
                description = "Get all bands")
    @GetMapping(value = "/bands")
    public ResponseEntity<List<BandWsDto>> getAllBands() {
        List<BandData> bands = bandFacade.getBands();
        return ResponseEntity.ok(getDataMapper().mapAsList(bands, BandWsDto.class, null));
    }

}
