// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_device_to_host.h"	
#include "amaltheaTop/swModel/labels/Lane_boundaries_device_type_Label.h"
#include "amaltheaTop/swModel/labels/Lane_boundaries_host_type_Label.h"

std::shared_ptr<Runnable> Lane_Detection_device_to_host = nullptr;

std::shared_ptr<Runnable>  get_Lane_Detection_device_to_host() {

	if (Lane_Detection_device_to_host == nullptr) {
		//initialize
		Lane_Detection_device_to_host = std::make_shared<Runnable>("Lane_Detection_device_to_host");
		Lane_Detection_device_to_host->addActivityGraphItem<LabelAccess>({get_Lane_boundaries_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Lane_Detection_device_to_host->addActivityGraphItem<LabelAccess>({get_Lane_boundaries_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Lane_Detection_device_to_host;
}

