// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/Planner.h"

#include "amaltheaTop/swModel/runnables/Planner_Function.h"
#include "amaltheaTop/stimuliModel/periodic_15ms.h"

std::shared_ptr<Task> Planner = nullptr;

std::shared_ptr<Task>  get_Planner() {

	if (Planner == nullptr) {
		//initialize
		Planner = Task::createTask("Planner");
		///*---- Group: CallSequence----*/
		Planner->addActivityGraphItem<RunnableCall>({get_Planner_Function()});
		
		Planner->addStimulus(get_periodic_15ms());
	}
	return Planner;
}

