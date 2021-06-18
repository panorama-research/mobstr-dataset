// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/CAN_Function.h"	
#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"

std::shared_ptr<Runnable> CAN_Function = nullptr;

std::shared_ptr<Runnable>  get_CAN_Function() {

	if (CAN_Function == nullptr) {
		//initialize
		CAN_Function = std::make_shared<Runnable>("CAN_Function");
		CAN_Function->addActivityGraphItem<Ticks>({});
		CAN_Function->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return CAN_Function;
}

