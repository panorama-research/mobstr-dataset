// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_Denver_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/Lidar_Grabber.h"

void init_TaskAllocation_Scheduler_Denver_PriorityScheduler_Lidar_Grabber(){
	get_Scheduler_Denver_PriorityScheduler()->addTaskMapping(get_Lidar_Grabber());
	get_Lidar_Grabber()->setPriority(1);
}
