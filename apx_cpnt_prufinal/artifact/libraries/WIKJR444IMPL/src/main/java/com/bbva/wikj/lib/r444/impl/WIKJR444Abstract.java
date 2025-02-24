package com.bbva.wikj.lib.r444.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r444.WIKJR444;
import com.bbva.wikj.lib.r449.WIKJR449;

public abstract class WIKJR444Abstract extends AbstractLibrary implements WIKJR444 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR449 wikjR449;

	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

		public void setWikjR449(WIKJR449 wikjR449) {
		this.wikjR449 = wikjR449;
	}

}
