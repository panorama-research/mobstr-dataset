// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/yaw_car_host_type_Label.h"

std::shared_ptr<DataLabel> yaw_car_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_yaw_car_host_type_Label() {
	if (yaw_car_host_type_Label == nullptr){
		yaw_car_host_type_Label = std::make_shared<DataLabel>("yaw_car_host_type_Label", 1000);
	}
	return yaw_car_host_type_Label;
}

