// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_Function.h"	

std::shared_ptr<Runnable> Lane_Detection_Function = nullptr;

std::shared_ptr<Runnable>  get_Lane_Detection_Function() {

	if (Lane_Detection_Function == nullptr) {
		//initialize
		Lane_Detection_Function = std::make_shared<Runnable>("Lane_Detection_Function");
		Lane_Detection_Function->addActivityGraphItem<Ticks>({});
	}
	return Lane_Detection_Function;
}

