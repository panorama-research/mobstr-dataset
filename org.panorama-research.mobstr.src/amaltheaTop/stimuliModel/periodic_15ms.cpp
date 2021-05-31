// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_15ms.h"

std::shared_ptr<PeriodicStimulus> periodic_15ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_15ms() {

	if (periodic_15ms == nullptr) {
		//initialize
		periodic_15ms = std::make_shared<PeriodicStimulus>("periodic_15ms",
																	 TimeParameter<std::milli>(15),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_15ms;
}

