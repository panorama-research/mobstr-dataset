# CMakeList.txt: CMake project for OsModel of "WATERS-2019_FMTV-Model".
						
				
# Add sources of OsModel
target_sources (WATERS-2019_FMTV-Model  PRIVATE
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/tasks/GPU_Sched_RandomScheduler.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/tasks/Scheduler_A57_PriorityScheduler.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/tasks/Scheduler_Denver_PriorityScheduler.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/operatingSystems/GPU_Cluster.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/operatingSystems/Sched_Cluster_A57.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/operatingSystems/Scheduling_Cluster_Denver.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/osModel/osModel_.cpp")
