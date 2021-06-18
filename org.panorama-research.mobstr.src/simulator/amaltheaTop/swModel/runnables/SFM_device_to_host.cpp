// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/SFM_device_to_host.h"	
#include "amaltheaTop/swModel/labels/Matrix_SFM_device_type_Label.h"
#include "amaltheaTop/swModel/labels/Matrix_SFM_host_type_Label.h"

std::shared_ptr<Runnable> SFM_device_to_host = nullptr;

std::shared_ptr<Runnable>  get_SFM_device_to_host() {

	if (SFM_device_to_host == nullptr) {
		//initialize
		SFM_device_to_host = std::make_shared<Runnable>("SFM_device_to_host");
		SFM_device_to_host->addActivityGraphItem<LabelAccess>({get_Matrix_SFM_device_type_Label(), 1, tlm::TLM_READ_COMMAND});
		SFM_device_to_host->addActivityGraphItem<LabelAccess>({get_Matrix_SFM_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return SFM_device_to_host;
}

