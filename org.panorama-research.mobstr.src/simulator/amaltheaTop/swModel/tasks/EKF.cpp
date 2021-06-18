// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/EKF.h"

#include "amaltheaTop/swModel/runnables/EKF_Function.h"
#include "amaltheaTop/stimuliModel/periodic_15ms.h"

std::shared_ptr<Task> EKF = nullptr;

std::shared_ptr<Task>  get_EKF() {

	if (EKF == nullptr) {
		//initialize
		EKF = Task::createTask("EKF");
		///*---- Group: CallSequence----*/
		EKF->addActivityGraphItem<RunnableCall>({get_EKF_Function()});
		
		EKF->addStimulus(get_periodic_15ms());
	}
	return EKF;
}

