package com.irasov.factorymethod.creator;

import com.irasov.factorymethod.entity.RomeWatch;
import com.irasov.factorymethod.entity.Watch;

public class CreateRomeWatch implements Factory{
	@Override
	public Watch CrateWatch() {
		return new RomeWatch();	
	}
}
