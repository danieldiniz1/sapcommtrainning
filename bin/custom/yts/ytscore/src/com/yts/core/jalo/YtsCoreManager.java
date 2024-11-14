/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.yts.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.yts.core.constants.YtsCoreConstants;
import com.yts.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class YtsCoreManager extends GeneratedYtsCoreManager
{
	public static final YtsCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (YtsCoreManager) em.getExtension(YtsCoreConstants.EXTENSIONNAME);
	}
}
