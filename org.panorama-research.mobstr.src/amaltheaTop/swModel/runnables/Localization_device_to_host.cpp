// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Localization_device_to_host.h"	
#include "amaltheaTop/swModel/labels/x_car_device_type_Label.h"
#include "amaltheaTop/swModel/labels/y_car_device_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_car_device_type_Label.h"
#include "amaltheaTop/swModel/labels/x_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/y_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_car_host_type_Label.h"

std::shared_ptr<Runnable> Localization_device_to_host = nullptr;

std::shared_ptr<Runnable>  get_Localization_device_to_host() {

	if (Localization_device_to_host == nullptr) {
		//initialize
		Localization_device_to_host = std::make_shared<Runnable>("Localization_device_to_host");
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_x_car_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_y_car_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_yaw_car_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_device_to_host->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Localization_device_to_host;
}

