// This code was generated for simulation with app4mc.sim

// This code was generated for simulation with app4mc.sim
#include "amaltheaTop/stimuliModel/Lane_detection_stim.h"

std::shared_ptr<InterProcessStimulus> Lane_detection_stim = nullptr;

std::shared_ptr<InterProcessStimulus>  get_Lane_detection_stim() {

	if (Lane_detection_stim == nullptr) {
		//initialize
		Lane_detection_stim = std::make_shared<InterProcessStimulus>("Lane_detection_stim");
	}
	return Lane_detection_stim;
}

