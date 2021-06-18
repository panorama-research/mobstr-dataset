// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/DASM_Function.h"	
#include "amaltheaTop/swModel/labels/speed_objective_type_Label.h"
#include "amaltheaTop/swModel/labels/steer_objective_type_Label.h"

std::shared_ptr<Runnable> DASM_Function = nullptr;

std::shared_ptr<Runnable>  get_DASM_Function() {

	if (DASM_Function == nullptr) {
		//initialize
		DASM_Function = std::make_shared<Runnable>("DASM_Function");
		DASM_Function->addActivityGraphItem<LabelAccess>({get_speed_objective_type_Label(), 1, tlm::TLM_READ_COMMAND});
		DASM_Function->addActivityGraphItem<LabelAccess>({get_steer_objective_type_Label(), 1, tlm::TLM_READ_COMMAND});
		DASM_Function->addActivityGraphItem<Ticks>({});
		DASM_Function->addActivityGraphItem<LabelAccess>({get_speed_objective_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		DASM_Function->addActivityGraphItem<LabelAccess>({get_steer_objective_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return DASM_Function;
}

