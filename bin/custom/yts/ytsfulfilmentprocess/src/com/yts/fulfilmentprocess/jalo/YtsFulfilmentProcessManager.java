/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.yts.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.yts.fulfilmentprocess.constants.YtsFulfilmentProcessConstants;

public class YtsFulfilmentProcessManager extends GeneratedYtsFulfilmentProcessManager
{
	public static final YtsFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (YtsFulfilmentProcessManager) em.getExtension(YtsFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
