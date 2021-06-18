// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Detection_device_to_host.h"	
#include "amaltheaTop/swModel/labels/Bounding_box_device_type_Label.h"
#include "amaltheaTop/swModel/labels/Bounding_box_host_type_Label.h"

std::shared_ptr<Runnable> Detection_device_to_host = nullptr;

std::shared_ptr<Runnable>  get_Detection_device_to_host() {

	if (Detection_device_to_host == nullptr) {
		//initialize
		Detection_device_to_host = std::make_shared<Runnable>("Detection_device_to_host");
		Detection_device_to_host->addActivityGraphItem<LabelAccess>({get_Bounding_box_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Detection_device_to_host->addActivityGraphItem<LabelAccess>({get_Bounding_box_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Detection_device_to_host;
}

