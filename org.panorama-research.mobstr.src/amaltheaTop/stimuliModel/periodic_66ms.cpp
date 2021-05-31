// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_66ms.h"

std::shared_ptr<PeriodicStimulus> periodic_66ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_66ms() {

	if (periodic_66ms == nullptr) {
		//initialize
		periodic_66ms = std::make_shared<PeriodicStimulus>("periodic_66ms",
																	 TimeParameter<std::milli>(66),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_66ms;
}

