// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/AsyncOffloadingCosts.h"	

std::shared_ptr<Runnable> AsyncOffloadingCosts = nullptr;

std::shared_ptr<Runnable>  get_AsyncOffloadingCosts() {

	if (AsyncOffloadingCosts == nullptr) {
		//initialize
		AsyncOffloadingCosts = std::make_shared<Runnable>("AsyncOffloadingCosts");
		AsyncOffloadingCosts->addActivityGraphItem<Ticks>({});
	}
	return AsyncOffloadingCosts;
}

