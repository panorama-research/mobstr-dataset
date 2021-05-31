// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/OS_Ops_Function.h"	

std::shared_ptr<Runnable> OS_Ops_Function = nullptr;

std::shared_ptr<Runnable>  get_OS_Ops_Function() {

	if (OS_Ops_Function == nullptr) {
		//initialize
		OS_Ops_Function = std::make_shared<Runnable>("OS_Ops_Function");
		OS_Ops_Function->addActivityGraphItem<Ticks>({});
	}
	return OS_Ops_Function;
}

