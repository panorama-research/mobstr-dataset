// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/Planner.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_Planner(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_Planner());
	get_Planner()->setPriority(1);
}
