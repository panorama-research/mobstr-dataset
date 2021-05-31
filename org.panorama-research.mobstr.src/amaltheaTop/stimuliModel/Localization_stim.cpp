// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
#include "amaltheaTop/stimuliModel/Localization_stim.h"

std::shared_ptr<InterProcessStimulus> Localization_stim = nullptr;

std::shared_ptr<InterProcessStimulus>  get_Localization_stim() {

	if (Localization_stim == nullptr) {
		//initialize
		Localization_stim = std::make_shared<InterProcessStimulus>("Localization_stim");
	}
	return Localization_stim;
}

