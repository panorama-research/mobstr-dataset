// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/PRE_Detection_gpu_POST.h"

#include "amaltheaTop/swModel/runnables/Detection_Preprocessing.h"
#include "amaltheaTop/stimuliModel/detection_stim.h"
#include "amaltheaTop/swModel/runnables/AsyncOffloadingCosts.h"
#include "amaltheaTop/swModel/runnables/Detection_Postprocessing.h"
#include "amaltheaTop/stimuliModel/periodic_200ms.h"

std::shared_ptr<Task> PRE_Detection_gpu_POST = nullptr;

std::shared_ptr<Task>  get_PRE_Detection_gpu_POST() {

	if (PRE_Detection_gpu_POST == nullptr) {
		//initialize
		PRE_Detection_gpu_POST = Task::createTask("PRE_Detection_gpu_POST");
		///*---- Group: CallSequence----*/
		PRE_Detection_gpu_POST->addActivityGraphItem<RunnableCall>({get_Detection_Preprocessing()});
		PRE_Detection_gpu_POST->addActivityGraphItem<InterProcessTrigger>({get_detection_stim()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl
		PRE_Detection_gpu_POST->addActivityGraphItem<RunnableCall>({get_AsyncOffloadingCosts()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl
		PRE_Detection_gpu_POST->addActivityGraphItem<RunnableCall>({get_Detection_Postprocessing()});
		
		PRE_Detection_gpu_POST->addStimulus(get_periodic_200ms());
	}
	return PRE_Detection_gpu_POST;
}

