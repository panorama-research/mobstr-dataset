// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/Localization.h"

#include "amaltheaTop/swModel/runnables/Localization_host_to_device.h"
#include "amaltheaTop/swModel/runnables/Localization_Function.h"
#include "amaltheaTop/swModel/runnables/Localization_device_to_host.h"
#include "amaltheaTop/stimuliModel/Localization_stim.h"

std::shared_ptr<Task> Localization = nullptr;

std::shared_ptr<Task>  get_Localization() {

	if (Localization == nullptr) {
		//initialize
		Localization = Task::createTask("Localization");
		///*---- Group: CallSequence----*/
		Localization->addActivityGraphItem<RunnableCall>({get_Localization_host_to_device()});
		Localization->addActivityGraphItem<RunnableCall>({get_Localization_Function()});
		Localization->addActivityGraphItem<RunnableCall>({get_Localization_device_to_host()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.SetEventImpl
		
		Localization->addStimulus(get_Localization_stim());
	}
	return Localization;
}

