// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/GPU_Sched_RandomScheduler.h"
#include "amaltheaTop/hwModel/modules/GP10B.h"

void init_SchedulerAllocation_GPU_Sched_RandomScheduler_GP10B(){
	get_GPU_Sched_RandomScheduler()->setExecutionCore(get_GP10B());
}
