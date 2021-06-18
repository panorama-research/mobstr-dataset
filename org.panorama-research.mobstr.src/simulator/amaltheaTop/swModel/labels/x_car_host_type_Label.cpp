// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/x_car_host_type_Label.h"

std::shared_ptr<DataLabel> x_car_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_x_car_host_type_Label() {
	if (x_car_host_type_Label == nullptr){
		x_car_host_type_Label = std::make_shared<DataLabel>("x_car_host_type_Label", 1000);
	}
	return x_car_host_type_Label;
}

