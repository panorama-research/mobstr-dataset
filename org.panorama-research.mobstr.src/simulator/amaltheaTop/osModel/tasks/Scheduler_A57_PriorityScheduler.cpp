// This code was generated for simulation with app4mc.sim

#include "Common.h"
#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"

std::shared_ptr<PriorityScheduler> Scheduler_A57 = nullptr;

std::shared_ptr<PriorityScheduler> get_Scheduler_A57_PriorityScheduler() {
	if (Scheduler_A57 == nullptr) {
		//initialize
		Scheduler_A57 = std::make_shared<PriorityScheduler>("Scheduler_A57");
	}
	return Scheduler_A57;
}
