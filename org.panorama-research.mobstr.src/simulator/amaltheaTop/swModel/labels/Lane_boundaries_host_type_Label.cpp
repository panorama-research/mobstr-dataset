// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Lane_boundaries_host_type_Label.h"

std::shared_ptr<DataLabel> Lane_boundaries_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Lane_boundaries_host_type_Label() {
	if (Lane_boundaries_host_type_Label == nullptr){
		Lane_boundaries_host_type_Label = std::make_shared<DataLabel>("Lane_boundaries_host_type_Label", 256);
	}
	return Lane_boundaries_host_type_Label;
}

