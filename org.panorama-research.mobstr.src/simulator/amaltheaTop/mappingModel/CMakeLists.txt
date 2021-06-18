# CMakeList.txt: CMake project for MappingModel of "WATERS-2019_FMTV-Model".
				
		
# Add sources of MappingModel
target_sources (WATERS-2019_FMTV-Model  PRIVATE
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/memoryMapping/memoryMapping.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Detection.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Lane_detection.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_Localization.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_GPU_Sched_SFM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_CANbus_polling.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_DASM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_EKF.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_OS_Overhead.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_PRE_Detection_gpu_POST.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_PRE_Lane_detection_gpu_POST.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_A57_Planner.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_Lidar_Grabber.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_PRE_Localization_gpu_POST.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/taskAllocation/taskAllocation_Scheduler_Denver_PRE_SFM_gpu_POST.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_GPU_Sched_GP10B.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_Scheduler_A57_Core0.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/schedulerAllocation/schedulerAllocation_Scheduler_Denver_Core0.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/mappingModel/mappingModel.cpp")
