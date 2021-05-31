// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Localization_Postprocessing.h"	
#include "amaltheaTop/swModel/labels/x_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/y_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_car_host_type_Label.h"

std::shared_ptr<Runnable> Localization_Postprocessing = nullptr;

std::shared_ptr<Runnable>  get_Localization_Postprocessing() {

	if (Localization_Postprocessing == nullptr) {
		//initialize
		Localization_Postprocessing = std::make_shared<Runnable>("Localization_Postprocessing");
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Localization_Postprocessing->addActivityGraphItem<Ticks>({});
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Localization_Postprocessing->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Localization_Postprocessing;
}

