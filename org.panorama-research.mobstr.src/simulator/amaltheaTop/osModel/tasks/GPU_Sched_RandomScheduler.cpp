// This code was generated for simulation with app4mc.sim

#include "Common.h"
#include "amaltheaTop/osModel/tasks/GPU_Sched_RandomScheduler.h"

std::shared_ptr<RandomScheduler> GPU_Sched = nullptr;

std::shared_ptr<RandomScheduler> get_GPU_Sched_RandomScheduler() {
	if (GPU_Sched == nullptr) {
		//initialize
		GPU_Sched = std::make_shared<RandomScheduler>("GPU_Sched");
	}
	return GPU_Sched;
}
