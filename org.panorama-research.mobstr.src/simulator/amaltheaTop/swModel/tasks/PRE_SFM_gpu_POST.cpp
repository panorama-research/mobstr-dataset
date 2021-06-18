// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/PRE_SFM_gpu_POST.h"

#include "amaltheaTop/swModel/runnables/SFM_Preprocessing.h"
#include "amaltheaTop/stimuliModel/SFM_stim.h"
#include "amaltheaTop/swModel/runnables/SFM_Postprocessing.h"
#include "amaltheaTop/stimuliModel/periodic_33ms.h"

std::shared_ptr<Task> PRE_SFM_gpu_POST = nullptr;

std::shared_ptr<Task>  get_PRE_SFM_gpu_POST() {

	if (PRE_SFM_gpu_POST == nullptr) {
		//initialize
		PRE_SFM_gpu_POST = Task::createTask("PRE_SFM_gpu_POST");
		///*---- Group: CallSequence----*/
		PRE_SFM_gpu_POST->addActivityGraphItem<RunnableCall>({get_SFM_Preprocessing()});
		PRE_SFM_gpu_POST->addActivityGraphItem<InterProcessTrigger>({get_SFM_stim()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl
		PRE_SFM_gpu_POST->addActivityGraphItem<RunnableCall>({get_SFM_Postprocessing()});
		
		PRE_SFM_gpu_POST->addStimulus(get_periodic_33ms());
	}
	return PRE_SFM_gpu_POST;
}

