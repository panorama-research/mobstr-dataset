// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Vehicle_status_host_type_Label.h"

std::shared_ptr<DataLabel> Vehicle_status_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Vehicle_status_host_type_Label() {
	if (Vehicle_status_host_type_Label == nullptr){
		Vehicle_status_host_type_Label = std::make_shared<DataLabel>("Vehicle_status_host_type_Label", 1000);
	}
	return Vehicle_status_host_type_Label;
}

