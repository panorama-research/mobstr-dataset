// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.h"
#include "amaltheaTop/swModel/tasks/CANbus_polling.h"

void init_TaskAllocation_Scheduler_A57_PriorityScheduler_CANbus_polling(){
	get_Scheduler_A57_PriorityScheduler()->addTaskMapping(get_CANbus_polling());
	get_CANbus_polling()->setPriority(1);
}
