// This code was generated for simulation with app4mc.sim

#include "Common.h"
#include "amaltheaTop/osModel/tasks/Scheduler_Denver_PriorityScheduler.h"

std::shared_ptr<PriorityScheduler> Scheduler_Denver = nullptr;

std::shared_ptr<PriorityScheduler> get_Scheduler_Denver_PriorityScheduler() {
	if (Scheduler_Denver == nullptr) {
		//initialize
		Scheduler_Denver = std::make_shared<PriorityScheduler>("Scheduler_Denver");
	}
	return Scheduler_Denver;
}
