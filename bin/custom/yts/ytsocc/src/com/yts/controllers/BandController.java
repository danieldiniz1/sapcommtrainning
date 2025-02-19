package com.yts.controllers;

import com.yts.facades.band.BandFacade;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@ApiVersion("v2")
@Api(tags = "YoursTanmay Controller")
@Api

@RequestMapping(value = "/{baseSiteId}")
public class BandController {

    @Resource(name = "bandFacade")
    private BandFacade bandFacade;
}
