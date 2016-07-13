package com.irasov.factorymethod.creator;

import com.irasov.factorymethod.entity.DigitalWatch;
import com.irasov.factorymethod.entity.Watch;

public class CreateDigitalWatch implements Factory{

	@Override
	public Watch CrateWatch() {
		return new DigitalWatch();
	}

}
