// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/DASM.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_DASM(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_DASM());
	get_DASM()->setPriority(1);
}
