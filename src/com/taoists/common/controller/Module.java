package com.taoists.common.controller;

/**
 * @author lv_jiafa@hoperun.com
 * @since 2012-8-9
 */
public enum Module {

	example("example");

	String name;

	Module(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
