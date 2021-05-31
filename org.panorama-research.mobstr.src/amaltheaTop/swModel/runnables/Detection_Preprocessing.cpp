// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Detection_Preprocessing.h"	
#include "amaltheaTop/swModel/labels/Image_host_type_Label.h"

std::shared_ptr<Runnable> Detection_Preprocessing = nullptr;

std::shared_ptr<Runnable>  get_Detection_Preprocessing() {

	if (Detection_Preprocessing == nullptr) {
		//initialize
		Detection_Preprocessing = std::make_shared<Runnable>("Detection_Preprocessing");
		Detection_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Detection_Preprocessing->addActivityGraphItem<Ticks>({});
		Detection_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Detection_Preprocessing;
}

