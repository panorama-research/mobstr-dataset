// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Localization_Preprocessing.h"	
#include "amaltheaTop/swModel/labels/Cloud_map_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"

std::shared_ptr<Runnable> Localization_Preprocessing = nullptr;

std::shared_ptr<Runnable>  get_Localization_Preprocessing() {

	if (Localization_Preprocessing == nullptr) {
		//initialize
		Localization_Preprocessing = std::make_shared<Runnable>("Localization_Preprocessing");
		Localization_Preprocessing->addActivityGraphItem<LabelAccess>({get_Cloud_map_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_Preprocessing->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_Preprocessing->addActivityGraphItem<Ticks>({});
		Localization_Preprocessing->addActivityGraphItem<LabelAccess>({get_Cloud_map_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_Preprocessing->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Localization_Preprocessing;
}

