// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/Lidar_Grabber.h"

#include "amaltheaTop/swModel/runnables/Lidar_Function.h"
#include "amaltheaTop/stimuliModel/periodic_33ms.h"

std::shared_ptr<Task> Lidar_Grabber = nullptr;

std::shared_ptr<Task>  get_Lidar_Grabber() {

	if (Lidar_Grabber == nullptr) {
		//initialize
		Lidar_Grabber = Task::createTask("Lidar_Grabber");
		///*---- Group: CallSequence----*/
		Lidar_Grabber->addActivityGraphItem<RunnableCall>({get_Lidar_Function()});
		
		Lidar_Grabber->addStimulus(get_periodic_33ms());
	}
	return Lidar_Grabber;
}

