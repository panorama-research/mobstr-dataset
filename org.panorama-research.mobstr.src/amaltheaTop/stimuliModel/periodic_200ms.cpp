// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_200ms.h"

std::shared_ptr<PeriodicStimulus> periodic_200ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_200ms() {

	if (periodic_200ms == nullptr) {
		//initialize
		periodic_200ms = std::make_shared<PeriodicStimulus>("periodic_200ms",
																	 TimeParameter<std::milli>(200),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_200ms;
}

