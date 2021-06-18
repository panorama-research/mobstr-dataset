// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/Occupancy_grid_host_type_Label.h"

std::shared_ptr<DataLabel> Occupancy_grid_host_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_Occupancy_grid_host_type_Label() {
	if (Occupancy_grid_host_type_Label == nullptr){
		Occupancy_grid_host_type_Label = std::make_shared<DataLabel>("Occupancy_grid_host_type_Label", 500000);
	}
	return Occupancy_grid_host_type_Label;
}

