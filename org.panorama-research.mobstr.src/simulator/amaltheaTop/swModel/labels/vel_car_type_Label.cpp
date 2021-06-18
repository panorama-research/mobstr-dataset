// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/vel_car_type_Label.h"

std::shared_ptr<DataLabel> vel_car_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_vel_car_type_Label() {
	if (vel_car_type_Label == nullptr){
		vel_car_type_Label = std::make_shared<DataLabel>("vel_car_type_Label", 1000);
	}
	return vel_car_type_Label;
}

