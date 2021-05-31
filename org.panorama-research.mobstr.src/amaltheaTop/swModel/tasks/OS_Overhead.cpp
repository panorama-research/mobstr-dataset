// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/OS_Overhead.h"

#include "amaltheaTop/swModel/runnables/OS_Ops_Function.h"
#include "amaltheaTop/stimuliModel/periodic_100ms.h"

std::shared_ptr<Task> OS_Overhead = nullptr;

std::shared_ptr<Task>  get_OS_Overhead() {

	if (OS_Overhead == nullptr) {
		//initialize
		OS_Overhead = Task::createTask("OS_Overhead");
		///*---- Group: CallSequence----*/
		OS_Overhead->addActivityGraphItem<RunnableCall>({get_OS_Ops_Function()});
		
		OS_Overhead->addStimulus(get_periodic_100ms());
	}
	return OS_Overhead;
}

