package com.bbva.wikj;

import com.bbva.wikj.dto.user.DtoOut;
import com.bbva.wikj.lib.r444.WIKJR444;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WIKJT44401MXTransaction extends AbstractWIKJT44401MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT44401MXTransaction.class);

	@Override
	public void execute() {
		WIKJR444 wikjR444 = this.getServiceLibrary(WIKJR444.class);
		DtoOut dtoOut = wikjR444.execute(this.getDtoin());
this.setDtoout(dtoOut);
	}

}
