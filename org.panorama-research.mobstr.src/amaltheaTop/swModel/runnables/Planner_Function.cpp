// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/Planner_Function.h"	
#include "amaltheaTop/swModel/labels/Lane_boundaries_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Occupancy_grid_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Matrix_SFM_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Bounding_box_host_type_Label.h"
#include "amaltheaTop/swModel/labels/x_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/y_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/vel_car_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_rate_type_Label.h"
#include "amaltheaTop/swModel/labels/speed_objective_type_Label.h"
#include "amaltheaTop/swModel/labels/steer_objective_type_Label.h"

std::shared_ptr<Runnable> Planner_Function = nullptr;

std::shared_ptr<Runnable>  get_Planner_Function() {

	if (Planner_Function == nullptr) {
		//initialize
		Planner_Function = std::make_shared<Runnable>("Planner_Function");
		Planner_Function->addActivityGraphItem<LabelAccess>({get_Lane_boundaries_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_Occupancy_grid_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_Matrix_SFM_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_Bounding_box_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_vel_car_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_yaw_rate_type_Label(), 1, tlm::TLM_READ_COMMAND});
		Planner_Function->addActivityGraphItem<Ticks>({});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_speed_objective_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		Planner_Function->addActivityGraphItem<LabelAccess>({get_steer_objective_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return Planner_Function;
}

