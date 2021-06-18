// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/y_car_device_type_Label.h"

std::shared_ptr<DataLabel> y_car_device_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_y_car_device_type_Label() {
	if (y_car_device_type_Label == nullptr){
		y_car_device_type_Label = std::make_shared<DataLabel>("y_car_device_type_Label", 1000);
	}
	return y_car_device_type_Label;
}

