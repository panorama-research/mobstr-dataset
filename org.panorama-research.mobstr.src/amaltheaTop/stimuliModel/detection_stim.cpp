// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
#include "amaltheaTop/stimuliModel/detection_stim.h"

std::shared_ptr<InterProcessStimulus> detection_stim = nullptr;

std::shared_ptr<InterProcessStimulus>  get_detection_stim() {

	if (detection_stim == nullptr) {
		//initialize
		detection_stim = std::make_shared<InterProcessStimulus>("detection_stim");
	}
	return detection_stim;
}

