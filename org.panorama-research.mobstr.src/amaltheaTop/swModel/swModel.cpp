// This code was generated for simulation with app4mc.sim

#include "APP4MCsim.h"
#include "amaltheaTop/swModel/swModel.h"
#include "amaltheaTop/swModel/tasks/CANbus_polling.h"
#include "amaltheaTop/swModel/tasks/DASM.h"
#include "amaltheaTop/swModel/tasks/Detection.h"
#include "amaltheaTop/swModel/tasks/EKF.h"
#include "amaltheaTop/swModel/tasks/Lane_detection.h"
#include "amaltheaTop/swModel/tasks/Lidar_Grabber.h"
#include "amaltheaTop/swModel/tasks/Localization.h"
#include "amaltheaTop/swModel/tasks/OS_Overhead.h"
#include "amaltheaTop/swModel/tasks/PRE_Detection_gpu_POST.h"
#include "amaltheaTop/swModel/tasks/PRE_Lane_detection_gpu_POST.h"
#include "amaltheaTop/swModel/tasks/PRE_Localization_gpu_POST.h"
#include "amaltheaTop/swModel/tasks/PRE_SFM_gpu_POST.h"
#include "amaltheaTop/swModel/tasks/Planner.h"
#include "amaltheaTop/swModel/tasks/SFM.h"

/* Software */
void init_swModel(){		
	get_CANbus_polling();
	get_DASM();
	get_Detection();
	get_EKF();
	get_Lane_detection();
	get_Lidar_Grabber();
	get_Localization();
	get_OS_Overhead();
	get_PRE_Detection_gpu_POST();
	get_PRE_Lane_detection_gpu_POST();
	get_PRE_Localization_gpu_POST();
	get_PRE_SFM_gpu_POST();
	get_Planner();
	get_SFM();
}
