// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/CANbus_polling.h"

#include "amaltheaTop/swModel/runnables/CAN_Function.h"
#include "amaltheaTop/stimuliModel/periodic_10ms.h"

std::shared_ptr<Task> CANbus_polling = nullptr;

std::shared_ptr<Task>  get_CANbus_polling() {

	if (CANbus_polling == nullptr) {
		//initialize
		CANbus_polling = Task::createTask("CANbus_polling");
		///*---- Group: CallSequence----*/
		CANbus_polling->addActivityGraphItem<RunnableCall>({get_CAN_Function()});
		
		CANbus_polling->addStimulus(get_periodic_10ms());
	}
	return CANbus_polling;
}

