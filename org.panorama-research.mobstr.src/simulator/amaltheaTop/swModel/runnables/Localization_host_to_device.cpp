// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Localization_host_to_device.h"	
#include "amaltheaTop/swModel/labels/Cloud_map_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Cloud_map_device_type_Label.h"
#include "amaltheaTop/swModel/labels/Vehicle_status_device_type_Label.h"

std::shared_ptr<Runnable> Localization_host_to_device = nullptr;

std::shared_ptr<Runnable>  get_Localization_host_to_device() {

	if (Localization_host_to_device == nullptr) {
		//initialize
		Localization_host_to_device = std::make_shared<Runnable>("Localization_host_to_device");
		Localization_host_to_device->addActivityGraphItem<LabelAccess>({get_Cloud_map_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_host_to_device->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_host_to_device->addActivityGraphItem<LabelAccess>({get_Cloud_map_device_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_host_to_device->addActivityGraphItem<LabelAccess>({get_Vehicle_status_device_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Localization_host_to_device;
}

