// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/EKF_Function.h"	
#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"
#include "amaltheaTop/swModel/labels/x_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/y_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_car_host_type_Label.h"
#include "amaltheaTop/swModel/labels/vel_car_type_Label.h"
#include "amaltheaTop/swModel/labels/yaw_rate_type_Label.h"

std::shared_ptr<Runnable> EKF_Function = nullptr;

std::shared_ptr<Runnable>  get_EKF_Function() {

	if (EKF_Function == nullptr) {
		//initialize
		EKF_Function = std::make_shared<Runnable>("EKF_Function");
		EKF_Function->addActivityGraphItem<LabelAccess>({get_Vehicle_status_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		EKF_Function->addActivityGraphItem<Ticks>({});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_x_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_y_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_yaw_car_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_vel_car_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
		EKF_Function->addActivityGraphItem<LabelAccess>({get_yaw_rate_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return EKF_Function;
}

