// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/SFM.h"

#include "amaltheaTop/swModel/runnables/SFM_host_to_device.h"
#include "amaltheaTop/swModel/runnables/SFM_Function.h"
#include "amaltheaTop/swModel/runnables/SFM_device_to_host.h"
#include "amaltheaTop/stimuliModel/SFM_stim.h"

std::shared_ptr<Task> SFM = nullptr;

std::shared_ptr<Task>  get_SFM() {

	if (SFM == nullptr) {
		//initialize
		SFM = Task::createTask("SFM");
		///*---- Group: CallSequence----*/
		SFM->addActivityGraphItem<RunnableCall>({get_SFM_host_to_device()});
		SFM->addActivityGraphItem<RunnableCall>({get_SFM_Function()});
		SFM->addActivityGraphItem<RunnableCall>({get_SFM_device_to_host()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.SetEventImpl
		
		SFM->addStimulus(get_SFM_stim());
	}
	return SFM;
}

