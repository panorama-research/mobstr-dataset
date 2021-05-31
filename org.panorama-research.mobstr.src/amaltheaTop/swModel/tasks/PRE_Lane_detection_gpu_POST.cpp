// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/tasks/PRE_Lane_detection_gpu_POST.h"

#include "amaltheaTop/swModel/runnables/Lane_Detection_Preprocessing.h"
#include "amaltheaTop/stimuliModel/Lane_detection_stim.h"
#include "amaltheaTop/swModel/runnables/Lane_Detection_Postprocessing.h"
#include "amaltheaTop/stimuliModel/periodic_66ms.h"

std::shared_ptr<Task> PRE_Lane_detection_gpu_POST = nullptr;

std::shared_ptr<Task>  get_PRE_Lane_detection_gpu_POST() {

	if (PRE_Lane_detection_gpu_POST == nullptr) {
		//initialize
		PRE_Lane_detection_gpu_POST = Task::createTask("PRE_Lane_detection_gpu_POST");
		///*---- Group: CallSequence----*/
		PRE_Lane_detection_gpu_POST->addActivityGraphItem<RunnableCall>({get_Lane_Detection_Preprocessing()});
		PRE_Lane_detection_gpu_POST->addActivityGraphItem<InterProcessTrigger>({get_Lane_detection_stim()});
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl
		////WARNING: no transformation for activity item class org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl
		PRE_Lane_detection_gpu_POST->addActivityGraphItem<RunnableCall>({get_Lane_Detection_Postprocessing()});
		
		PRE_Lane_detection_gpu_POST->addStimulus(get_periodic_66ms());
	}
	return PRE_Lane_detection_gpu_POST;
}

