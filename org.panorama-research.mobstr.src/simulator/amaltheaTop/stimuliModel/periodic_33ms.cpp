// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
	
#include "amaltheaTop/stimuliModel/periodic_33ms.h"

std::shared_ptr<PeriodicStimulus> periodic_33ms = nullptr;

std::shared_ptr<PeriodicStimulus>  get_periodic_33ms() {

	if (periodic_33ms == nullptr) {
		//initialize
		periodic_33ms = std::make_shared<PeriodicStimulus>("periodic_33ms",
																	 TimeParameter<std::milli>(33),
																	 TimeParameter<std::pico>(0),
																	 TimeConstant(TimeParameter<std::pico>(0)),
																	 TimeParameter<std::pico>(0));
	}
	return periodic_33ms;
}

