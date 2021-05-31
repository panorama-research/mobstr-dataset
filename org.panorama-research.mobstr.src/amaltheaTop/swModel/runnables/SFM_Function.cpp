// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/SFM_Function.h"	

std::shared_ptr<Runnable> SFM_Function = nullptr;

std::shared_ptr<Runnable>  get_SFM_Function() {

	if (SFM_Function == nullptr) {
		//initialize
		SFM_Function = std::make_shared<Runnable>("SFM_Function");
		SFM_Function->addActivityGraphItem<Ticks>({});
	}
	return SFM_Function;
}

