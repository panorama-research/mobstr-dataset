// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/Detection.h"

#include "amaltheaTop/swModel/runnables/Detection_host_to_device.h"
#include "amaltheaTop/swModel/runnables/Detection_Function.h"
#include "amaltheaTop/swModel/runnables/Detection_device_to_host.h"
#include "amaltheaTop/stimuliModel/detection_stim.h"

std::shared_ptr<Task> Detection = nullptr;

std::shared_ptr<Task>  get_Detection() {

	if (Detection == nullptr) {
		//initialize
		Detection = Task::createTask("Detection");
		///*---- Group: CallSequence----*/
		Detection->addActivityGraphItem<RunnableCall>({get_Detection_host_to_device()});
		Detection->addActivityGraphItem<RunnableCall>({get_Detection_Function()});
		Detection->addActivityGraphItem<RunnableCall>({get_Detection_device_to_host()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.SetEventImpl
		
		Detection->addStimulus(get_detection_stim());
	}
	return Detection;
}

