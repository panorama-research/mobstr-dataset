// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
#include "amaltheaTop/stimuliModel/SFM_stim.h"

std::shared_ptr<InterProcessStimulus> SFM_stim = nullptr;

std::shared_ptr<InterProcessStimulus>  get_SFM_stim() {

	if (SFM_stim == nullptr) {
		//initialize
		SFM_stim = std::make_shared<InterProcessStimulus>("SFM_stim");
	}
	return SFM_stim;
}

