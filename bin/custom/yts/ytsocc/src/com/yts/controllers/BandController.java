package com.yts.controllers;

import com.yts.facades.band.BandFacade;
import de.hybris.platform.b2bocc.v2.controllers.BaseController;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

@Controller
@ApiVersion("v2")
@RequestMapping(value = "/{baseSiteId}")
public class BandController extends BaseController {

    @Resource(name = "bandFacade")
    private BandFacade bandFacade;

}
