// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/DASM.h"

#include "amaltheaTop/swModel/runnables/DASM_Function.h"
#include "amaltheaTop/stimuliModel/periodic_5ms.h"

std::shared_ptr<Task> DASM = nullptr;

std::shared_ptr<Task>  get_DASM() {

	if (DASM == nullptr) {
		//initialize
		DASM = Task::createTask("DASM");
		///*---- Group: CallSequence----*/
		DASM->addActivityGraphItem<RunnableCall>({get_DASM_Function()});
		
		DASM->addStimulus(get_periodic_5ms());
	}
	return DASM;
}

