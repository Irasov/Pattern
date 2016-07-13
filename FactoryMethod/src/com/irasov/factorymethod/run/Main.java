package com.irasov.factorymethod.run;

import com.irasov.factorymethod.creator.Factory;
import com.irasov.factorymethod.creator.FactoryMethod;
import com.irasov.factorymethod.entity.Watch;

public class Main {
	public static void main(String[] args){
		Factory factory = FactoryMethod.CreateWatch(FactoryMethod.ROME_WATCH);
		Watch watch  = factory.CrateWatch();
		watch.showTime();
		
		
	}

}
