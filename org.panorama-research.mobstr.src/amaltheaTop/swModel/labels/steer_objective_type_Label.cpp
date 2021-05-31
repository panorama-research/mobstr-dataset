// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/steer_objective_type_Label.h"

std::shared_ptr<DataLabel> steer_objective_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_steer_objective_type_Label() {
	if (steer_objective_type_Label == nullptr){
		steer_objective_type_Label = std::make_shared<DataLabel>("steer_objective_type_Label", 1000);
	}
	return steer_objective_type_Label;
}

