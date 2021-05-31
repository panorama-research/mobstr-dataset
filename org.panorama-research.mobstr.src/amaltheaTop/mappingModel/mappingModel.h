// This code was generated for simulation with app4mc.sim

#pragma once

#include <systemc>
#include <memory>
#include "APP4MCsim.h"


//include model elements
#include "amaltheaTop/mappingModel/memoryMapping/memoryMapping.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Detection.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Lane_detection.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Localization.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_SFM.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_CANbus_polling.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_DASM.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_EKF.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_OS_Overhead.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_PRE_Detection_gpu_POST.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_PRE_Lane_detection_gpu_POST.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_Planner.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_Lidar_Grabber.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_PRE_Localization_gpu_POST.h"
#include "amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_PRE_SFM_gpu_POST.h"
#include "amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_GPU_Sched_GP10B.h"
#include "amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_Scheduler_A57_Core0.h"
#include "amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_Scheduler_Denver_Core0.h"
void init_mappingModel();		
