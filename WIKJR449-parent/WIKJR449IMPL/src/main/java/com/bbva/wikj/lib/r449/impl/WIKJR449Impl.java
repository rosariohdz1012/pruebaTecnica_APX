package com.bbva.wikj.lib.r449.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


public class WIKJR449Impl extends WIKJR449Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR449Impl.class);

	@Override
	public Map<String, Object> executeSelect(String nuip) {
		try {
			return this.jdbcUtils.queryForMap("query.query2", nuip);
		} catch (Exception ex) {

			throw new RuntimeException("En la consulta ah ocurrido un ERROR", ex);
		}
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		try {
			return this.jdbcUtils.update("query.query1",args);
		} catch (Exception ex) {
			throw new RuntimeException("En la insercion ah ocurrido un ERROR ",ex);
		}


	}
}
