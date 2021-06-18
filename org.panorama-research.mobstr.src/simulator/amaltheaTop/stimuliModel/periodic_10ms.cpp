// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_10ms.h"

std::shared_ptr<PeriodicStimulus> periodic_10ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_10ms() {

	if (periodic_10ms == nullptr) {
		//initialize
		periodic_10ms = std::make_shared<PeriodicStimulus>("periodic_10ms",
																	 TimeParameter<std::milli>(10),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_10ms;
}

