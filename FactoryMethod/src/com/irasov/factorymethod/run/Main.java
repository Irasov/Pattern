package com.irasov.factorymethod.run;

import com.irasov.factorymethod.creator.FactoryMethod;
import com.irasov.factorymethod.entity.Watch;

public class Main {
	public static void main(String[] args){
		Watch watch;
		FactoryMethod factory = new FactoryMethod();
		watch = factory.CreateWatch(FactoryMethod.ROME_WATTCH);
		watch.showTime();
	}

}
