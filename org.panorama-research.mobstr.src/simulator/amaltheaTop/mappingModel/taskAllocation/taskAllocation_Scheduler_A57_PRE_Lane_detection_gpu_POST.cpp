// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/PRE_Lane_detection_gpu_POST.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_PRE_Lane_detection_gpu_POST(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_PRE_Lane_detection_gpu_POST());
	get_PRE_Lane_detection_gpu_POST()->setPriority(1);
}
