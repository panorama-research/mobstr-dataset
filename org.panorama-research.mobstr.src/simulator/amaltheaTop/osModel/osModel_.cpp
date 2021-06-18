// This code was generated for simulation with app4mc.sim

	#include "amaltheaTop/osModel/osModel_.h"	
	
	#include "amaltheaTop/osModel/operatingSystems/GPU_Cluster.h"
	#include "amaltheaTop/osModel/operatingSystems/Sched_Cluster_A57.h"
	#include "amaltheaTop/osModel/operatingSystems/Scheduling_Cluster_Denver.h"

	
	/* OS */
	void init_osModel(){
		get_OperatingSystem_GPU_Cluster();
		get_OperatingSystem_Sched_Cluster_A57();
		get_OperatingSystem_Scheduling_Cluster_Denver();
	}
