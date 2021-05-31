// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_Postprocessing.h"	
#include "amaltheaTop/swModel/labels/Lane_boundaries_host_type_Label.h"

std::shared_ptr<Runnable> Lane_Detection_Postprocessing = nullptr;

std::shared_ptr<Runnable>  get_Lane_Detection_Postprocessing() {

	if (Lane_Detection_Postprocessing == nullptr) {
		//initialize
		Lane_Detection_Postprocessing = std::make_shared<Runnable>("Lane_Detection_Postprocessing");
		Lane_Detection_Postprocessing->addActivityGraphItem<LabelAccess>({get_Lane_boundaries_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Lane_Detection_Postprocessing->addActivityGraphItem<Ticks>({});
		Lane_Detection_Postprocessing->addActivityGraphItem<LabelAccess>({get_Lane_boundaries_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Lane_Detection_Postprocessing;
}

