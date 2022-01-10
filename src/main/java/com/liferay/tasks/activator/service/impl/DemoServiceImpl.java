package com.liferay.tasks.activator.service.impl;

import com.liferay.tasks.activator.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String displayMessage() {
		
		return "this is my osgi service";
		
	}

}
