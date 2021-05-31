// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Detection_Function.h"	

std::shared_ptr<Runnable> Detection_Function = nullptr;

std::shared_ptr<Runnable>  get_Detection_Function() {

	if (Detection_Function == nullptr) {
		//initialize
		Detection_Function = std::make_shared<Runnable>("Detection_Function");
		Detection_Function->addActivityGraphItem<Ticks>({});
	}
	return Detection_Function;
}

