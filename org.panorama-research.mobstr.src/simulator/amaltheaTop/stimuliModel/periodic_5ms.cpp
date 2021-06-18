// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_5ms.h"

std::shared_ptr<PeriodicStimulus> periodic_5ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_5ms() {

	if (periodic_5ms == nullptr) {
		//initialize
		periodic_5ms = std::make_shared<PeriodicStimulus>("periodic_5ms",
																	 TimeParameter<std::milli>(5),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_5ms;
}

