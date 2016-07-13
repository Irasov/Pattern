package com.irasov.factorymethod.creator;

import com.irasov.factorymethod.entity.DigitalWatch;
import com.irasov.factorymethod.entity.RomeWatch;
import com.irasov.factorymethod.entity.Watch;

public class FactoryMethod {
	public static final String ROME_WATTCH = "rome";
	public static final String DIGIATL_WATTCH = "digital";
	public Watch CreateWatch(String type){
		if (type.equals(DIGIATL_WATTCH)){
			return new DigitalWatch();
		}
		else if(type.equals(ROME_WATTCH)){
			 return new RomeWatch();
		}	
		throw new RuntimeException("нет таких часов");
	}
}
