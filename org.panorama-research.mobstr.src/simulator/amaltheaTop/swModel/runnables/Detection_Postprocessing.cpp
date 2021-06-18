// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Detection_Postprocessing.h"	
#include "amaltheaTop/swModel/labels/Bounding_box_host_type_Label.h"

std::shared_ptr<Runnable> Detection_Postprocessing = nullptr;

std::shared_ptr<Runnable>  get_Detection_Postprocessing() {

	if (Detection_Postprocessing == nullptr) {
		//initialize
		Detection_Postprocessing = std::make_shared<Runnable>("Detection_Postprocessing");
		Detection_Postprocessing->addActivityGraphItem<LabelAccess>({get_Bounding_box_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Detection_Postprocessing->addActivityGraphItem<Ticks>({});
		Detection_Postprocessing->addActivityGraphItem<LabelAccess>({get_Bounding_box_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Detection_Postprocessing;
}

