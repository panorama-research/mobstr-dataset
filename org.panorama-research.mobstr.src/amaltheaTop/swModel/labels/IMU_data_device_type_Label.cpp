// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/swModel/labels/IMU_data_device_type_Label.h"

std::shared_ptr<DataLabel> IMU_data_device_type_Label = nullptr;

std::shared_ptr<DataLabel>  get_IMU_data_device_type_Label() {
	if (IMU_data_device_type_Label == nullptr){
		IMU_data_device_type_Label = std::make_shared<DataLabel>("IMU_data_device_type_Label", 256);
	}
	return IMU_data_device_type_Label;
}

