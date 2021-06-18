// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Detection_host_to_device.h"	
#include "amaltheaTop/swModel/labels/Image_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Image_device_type_Label.h"

std::shared_ptr<Runnable> Detection_host_to_device = nullptr;

std::shared_ptr<Runnable>  get_Detection_host_to_device() {

	if (Detection_host_to_device == nullptr) {
		//initialize
		Detection_host_to_device = std::make_shared<Runnable>("Detection_host_to_device");
		Detection_host_to_device->addActivityGraphItem<LabelAccess>({get_Image_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Detection_host_to_device->addActivityGraphItem<LabelAccess>({get_Image_device_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Detection_host_to_device;
}

