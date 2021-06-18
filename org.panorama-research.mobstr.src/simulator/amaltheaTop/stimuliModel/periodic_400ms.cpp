// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_400ms.h"

std::shared_ptr<PeriodicStimulus> periodic_400ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_400ms() {

	if (periodic_400ms == nullptr) {
		//initialize
		periodic_400ms = std::make_shared<PeriodicStimulus>("periodic_400ms",
																	 TimeParameter<std::milli>(400),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_400ms;
}

