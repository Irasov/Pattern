package com.irasov.factorymethod.creator;

import com.irasov.factorymethod.entity.Watch;

public interface Factory {
	Watch CrateWatch();
}
