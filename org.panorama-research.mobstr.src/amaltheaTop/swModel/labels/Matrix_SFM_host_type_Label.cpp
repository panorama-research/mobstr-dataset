// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Matrix_SFM_host_type_Label.h"

std::shared_ptr<DataLabel> Matrix_SFM_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Matrix_SFM_host_type_Label() {
	if (Matrix_SFM_host_type_Label == nullptr){
		Matrix_SFM_host_type_Label = std::make_shared<DataLabel>("Matrix_SFM_host_type_Label", 24000);
	}
	return Matrix_SFM_host_type_Label;
}

