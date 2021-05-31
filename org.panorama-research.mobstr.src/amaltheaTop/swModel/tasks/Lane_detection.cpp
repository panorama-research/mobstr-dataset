// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/Lane_detection.h"

#include "amaltheaTop/swModel/runnables/Lane_Detection_host_to_device.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_Function.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_device_to_host.h"
#include "amaltheaTop/stimuliModel/Lane_detection_stim.h"

std::shared_ptr<Task> Lane_detection = nullptr;

std::shared_ptr<Task>  get_Lane_detection() {

	if (Lane_detection == nullptr) {
		//initialize
		Lane_detection = Task::createTask("Lane_detection");
		///*---- Group: CallSequence----*/
		Lane_detection->addActivityGraphItem<RunnableCall>({get_Lane_Detection_host_to_device()});
		Lane_detection->addActivityGraphItem<RunnableCall>({get_Lane_Detection_Function()});
		Lane_detection->addActivityGraphItem<RunnableCall>({get_Lane_Detection_device_to_host()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.SetEventImpl
		
		Lane_detection->addStimulus(get_Lane_detection_stim());
	}
	return Lane_detection;
}

