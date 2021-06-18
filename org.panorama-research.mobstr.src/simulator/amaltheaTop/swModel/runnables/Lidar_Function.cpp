// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Lidar_Function.h"	
#include "amaltheaTop/swModel/labels/Cloud_map_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Occupancy_grid_host_type_Label.h"

std::shared_ptr<Runnable> Lidar_Function = nullptr;

std::shared_ptr<Runnable>  get_Lidar_Function() {

	if (Lidar_Function == nullptr) {
		//initialize
		Lidar_Function = std::make_shared<Runnable>("Lidar_Function");
		Lidar_Function->addActivityGraphItem<LabelAccess>({get_Cloud_map_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Lidar_Function->addActivityGraphItem<Ticks>({});
		Lidar_Function->addActivityGraphItem<LabelAccess>({get_Cloud_map_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Lidar_Function->addActivityGraphItem<LabelAccess>({get_Occupancy_grid_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Lidar_Function;
}

