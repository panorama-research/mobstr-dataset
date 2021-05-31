// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Cloud_map_device_type_Label.h"

std::shared_ptr<DataLabel> Cloud_map_device_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Cloud_map_device_type_Label() {
	if (Cloud_map_device_type_Label == nullptr){
		Cloud_map_device_type_Label = std::make_shared<DataLabel>("Cloud_map_device_type_Label", 1500000);
	}
	return Cloud_map_device_type_Label;
}

