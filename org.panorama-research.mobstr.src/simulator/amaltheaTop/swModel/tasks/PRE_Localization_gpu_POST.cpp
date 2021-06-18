// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/PRE_Localization_gpu_POST.h"

#include "amaltheaTop/swModel/runnables/Localization_Preprocessing.h"
#include "amaltheaTop/stimuliModel/Localization_stim.h"
#include "amaltheaTop/swModel/runnables/Localization_Postprocessing.h"
#include "amaltheaTop/stimuliModel/periodic_400ms.h"

std::shared_ptr<Task> PRE_Localization_gpu_POST = nullptr;

std::shared_ptr<Task>  get_PRE_Localization_gpu_POST() {

	if (PRE_Localization_gpu_POST == nullptr) {
		//initialize
		PRE_Localization_gpu_POST = Task::createTask("PRE_Localization_gpu_POST");
		///*---- Group: CallSequence----*/
		PRE_Localization_gpu_POST->addActivityGraphItem<RunnableCall>({get_Localization_Preprocessing()});
		PRE_Localization_gpu_POST->addActivityGraphItem<InterProcessTrigger>({get_Localization_stim()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl
		PRE_Localization_gpu_POST->addActivityGraphItem<RunnableCall>({get_Localization_Postprocessing()});
		
		PRE_Localization_gpu_POST->addStimulus(get_periodic_400ms());
	}
	return PRE_Localization_gpu_POST;
}

