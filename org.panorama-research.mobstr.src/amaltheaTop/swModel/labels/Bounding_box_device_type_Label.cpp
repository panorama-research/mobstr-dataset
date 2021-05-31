// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Bounding_box_device_type_Label.h"

std::shared_ptr<DataLabel> Bounding_box_device_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Bounding_box_device_type_Label() {
	if (Bounding_box_device_type_Label == nullptr){
		Bounding_box_device_type_Label = std::make_shared<DataLabel>("Bounding_box_device_type_Label", 750000);
	}
	return Bounding_box_device_type_Label;
}

