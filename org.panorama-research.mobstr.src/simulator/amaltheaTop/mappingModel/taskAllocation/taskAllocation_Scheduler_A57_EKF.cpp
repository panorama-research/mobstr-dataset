// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/EKF.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_EKF(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_EKF());
	get_EKF()->setPriority(1);
}
