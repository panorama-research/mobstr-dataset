// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Localization_Function.h"	

std::shared_ptr<Runnable> Localization_Function = nullptr;

std::shared_ptr<Runnable>  get_Localization_Function() {

	if (Localization_Function == nullptr) {
		//initialize
		Localization_Function = std::make_shared<Runnable>("Localization_Function");
		Localization_Function->addActivityGraphItem<Ticks>({});
	}
	return Localization_Function;
}

