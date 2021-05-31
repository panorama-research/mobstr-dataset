// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Image_host_type_Label.h"

std::shared_ptr<DataLabel> Image_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Image_host_type_Label() {
	if (Image_host_type_Label == nullptr){
		Image_host_type_Label = std::make_shared<DataLabel>("Image_host_type_Label", 2000000);
	}
	return Image_host_type_Label;
}

