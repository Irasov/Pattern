package com.irasov.factorymethod.creator;

public class FactoryMethod {
	public static final String ROME_WATCH = "rome";
	public static final String DIGIATL_WATCH = "digital";
	public static Factory CreateWatch(String type){
		if (type.equals(DIGIATL_WATCH)){
			return new CreateDigitalWatch();
		}
		else if(type.equals(ROME_WATCH)){
			 return new CreateRomeWatch();
		}	
		throw new RuntimeException("нет таких часов");
	}
}
