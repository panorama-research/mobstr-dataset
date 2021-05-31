// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/speed_objective_type_Label.h"

std::shared_ptr<DataLabel> speed_objective_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_speed_objective_type_Label() {
	if (speed_objective_type_Label == nullptr){
		speed_objective_type_Label = std::make_shared<DataLabel>("speed_objective_type_Label", 1000);
	}
	return speed_objective_type_Label;
}

