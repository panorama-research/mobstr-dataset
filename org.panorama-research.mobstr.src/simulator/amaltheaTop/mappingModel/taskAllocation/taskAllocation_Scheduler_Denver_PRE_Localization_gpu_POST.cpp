// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_Denver_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/PRE_Localization_gpu_POST.h"

void init_TaskAllocation_Scheduler_Denver_PriorityScheduler_PRE_Localization_gpu_POST(){
	get_Scheduler_Denver_PriorityScheduler()->addTaskMapping(get_PRE_Localization_gpu_POST());
	get_PRE_Localization_gpu_POST()->setPriority(1);
}
