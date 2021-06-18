// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_100ms.h"

std::shared_ptr<PeriodicStimulus> periodic_100ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_100ms() {

	if (periodic_100ms == nullptr) {
		//initialize
		periodic_100ms = std::make_shared<PeriodicStimulus>("periodic_100ms",
																	 TimeParameter<std::milli>(100),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_100ms;
}

