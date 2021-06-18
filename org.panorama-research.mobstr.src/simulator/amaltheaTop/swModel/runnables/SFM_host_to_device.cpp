// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/SFM_host_to_device.h"	
#include "amaltheaTop/swModel/labels/IMU_data_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Image_SFM_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Image_SFM_device_type_Label.h"
#include "amaltheaTop/swModel/labels/IMU_data_device_type_Label.h"

std::shared_ptr<Runnable> SFM_host_to_device = nullptr;

std::shared_ptr<Runnable>  get_SFM_host_to_device() {

	if (SFM_host_to_device == nullptr) {
		//initialize
		SFM_host_to_device = std::make_shared<Runnable>("SFM_host_to_device");
		SFM_host_to_device->addActivityGraphItem<LabelAccess>({get_IMU_data_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		SFM_host_to_device->addActivityGraphItem<LabelAccess>({get_Image_SFM_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		SFM_host_to_device->addActivityGraphItem<LabelAccess>({get_Image_SFM_device_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		SFM_host_to_device->addActivityGraphItem<LabelAccess>({get_IMU_data_device_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return SFM_host_to_device;
}

