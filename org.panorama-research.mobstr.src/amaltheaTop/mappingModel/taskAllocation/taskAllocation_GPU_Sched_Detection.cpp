// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/GPU_Sched_RandomScheduler.h"
#include "amaltheaTop/swModel/tasks/Detection.h"

void init_TaskAllocation_GPU_Sched_RandomScheduler_Detection(){
	get_GPU_Sched_RandomScheduler()->addTaskMapping(get_Detection());
}
