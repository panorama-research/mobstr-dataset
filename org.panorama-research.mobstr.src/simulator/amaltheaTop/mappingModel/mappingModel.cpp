// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/mappingModel/mappingModel.h"

void init_mappingModel(){
	init_MemoryMapping_Bounding_box_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Bounding_box_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Cloud_map_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Cloud_map_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_IMU_data_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_IMU_data_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_SFM_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_SFM_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_lane_lines_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Image_lane_lines_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Lane_boundaries_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Lane_boundaries_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Matrix_SFM_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Matrix_SFM_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Occupancy_grid_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Vehicle_status_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_Vehicle_status_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_speed_objective_to_SYSTEM_DRAM(); 
	init_MemoryMapping_steer_objective_to_SYSTEM_DRAM(); 
	init_MemoryMapping_vel_car_to_SYSTEM_DRAM(); 
	init_MemoryMapping_x_car_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_x_car_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_y_car_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_y_car_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_yaw_car_device_to_SYSTEM_DRAM(); 
	init_MemoryMapping_yaw_car_host_to_SYSTEM_DRAM(); 
	init_MemoryMapping_yaw_rate_to_SYSTEM_DRAM(); 
	init_TaskAllocation_GPU_Sched_RandomScheduler_Detection(); 
	init_TaskAllocation_GPU_Sched_RandomScheduler_Lane_detection(); 
	init_TaskAllocation_GPU_Sched_RandomScheduler_Localization(); 
	init_TaskAllocation_GPU_Sched_RandomScheduler_SFM(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_CANbus_polling(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_DASM(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_EKF(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_OS_Overhead(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_PRE_Detection_gpu_POST(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_PRE_Lane_detection_gpu_POST(); 
	init_TaskAllocation_Scheduler_A57_PriorityScheduler_Planner(); 
	init_TaskAllocation_Scheduler_Denver_PriorityScheduler_Lidar_Grabber(); 
	init_TaskAllocation_Scheduler_Denver_PriorityScheduler_PRE_Localization_gpu_POST(); 
	init_TaskAllocation_Scheduler_Denver_PriorityScheduler_PRE_SFM_gpu_POST(); 
	init_SchedulerAllocation_GPU_Sched_RandomScheduler_GP10B(); 
	init_SchedulerAllocation_Scheduler_A57_PriorityScheduler_Core0(); 
	init_SchedulerAllocation_Scheduler_Denver_PriorityScheduler_Core0(); 
}
