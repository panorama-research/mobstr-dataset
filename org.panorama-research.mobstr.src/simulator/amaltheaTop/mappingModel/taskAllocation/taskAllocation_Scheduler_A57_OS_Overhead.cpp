// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/OS_Overhead.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_OS_Overhead(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_OS_Overhead());
	get_OS_Overhead()->setPriority(1);
}
