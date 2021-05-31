// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_Preprocessing.h"	
#include "amaltheaTop/swModel/labels/Image_lane_lines_host_type_Label.h"

std::shared_ptr<Runnable> Lane_Detection_Preprocessing = nullptr;

std::shared_ptr<Runnable>  get_Lane_Detection_Preprocessing() {

	if (Lane_Detection_Preprocessing == nullptr) {
		//initialize
		Lane_Detection_Preprocessing = std::make_shared<Runnable>("Lane_Detection_Preprocessing");
		Lane_Detection_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_lane_lines_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Lane_Detection_Preprocessing->addActivityGraphItem<Ticks>({});
		Lane_Detection_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_lane_lines_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Lane_Detection_Preprocessing;
}

