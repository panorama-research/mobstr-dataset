// This code is auto-generated

#include "runnables.h"
#include "ticksUtils.h"

//Runnable OS_Ops_Function----
void run_OS_Ops_Function(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(1.0E8, 100000000, 100000000);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(1.0E8, 100000000, 100000000);
	}
}


//Runnable Lidar_Function----
void run_Lidar_Function(char* coreName){
	read_Cloud_map_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(2.352E7, 20320000, 27320000);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(2.034807E7, 19588000, 21736000);
	}
	write_Cloud_map_host(1);
	write_Occupancy_grid_host(1);
}


//Runnable CAN_Function----
void run_CAN_Function(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(999360.0, 799360, 1199360);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(999744.0, 799744, 1199744);
	}
	write_Vehicle_status_host(1);
}


//Runnable EKF_Function----
void run_EKF_Function(char* coreName){
	read_Vehicle_status_host(1);
	read_x_car_host(1);
	read_y_car_host(1);
	read_yaw_car_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(8799340.0, 7959340, 9519340);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(8398959.0, 8179736, 8858959);
	}
	write_x_car_host(1);
	write_y_car_host(1);
	write_yaw_car_host(1);
	write_vel_car(1);
	write_yaw_rate(1);
}


//Runnable Planner_Function----
void run_Planner_Function(char* coreName){
	read_Lane_boundaries_host(1);
	read_Occupancy_grid_host(1);
	read_Vehicle_status_host(1);
	read_Matrix_SFM_host(1);
	read_Bounding_box_host(1);
	read_x_car_host(1);
	read_y_car_host(1);
	read_yaw_car_host(1);
	read_vel_car(1);
	read_yaw_rate(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(2.2743822E7, 19243822, 26483822);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(2.0273529E7, 19073529, 24873529);
	}
	write_speed_objective(1);
	write_steer_objective(1);
}


//Runnable DASM_Function----
void run_DASM_Function(char* coreName){
	read_speed_objective(1);
	read_steer_objective(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(3219990.0, 2599990, 3719990);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(2399996.0, 2099996, 2599996);
	}
	write_speed_objective(1);
	write_steer_objective(1);
}


//Runnable Detection_Preprocessing----
void run_Detection_Preprocessing(char* coreName){
	read_Image_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(6921260.0, 6378560, 7379120);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(5853824.0, 4755924, 6354526);
	}
	write_Image_host(1);
}


//Runnable Detection_Postprocessing----
void run_Detection_Postprocessing(char* coreName){
	read_Bounding_box_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(1840000.0, 1640000, 2040000);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(1416000.0, 1246000, 1816000);
	}
	write_Bounding_box_host(1);
}


//Runnable Localization_Function----
void run_Localization_Function(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(7.54439355E8, 733039355, 774839355);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(5.62615742E8, 553415742, 589615742);
	}
	else if(strcmp(coreName,"GPU_def")==0){
	executeTicks_DiscreteValueStatistics(1.8E8, 175500000, 186000000);
	}
}


//Runnable Lane_Detection_Function----
void run_Lane_Detection_Function(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(9.868912E7, 95689120, 102089120);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(8.0075648E7, 76875648, 84475648);
	}
	else if(strcmp(coreName,"GPU_def")==0){
	executeTicks_DiscreteValueStatistics(3.975E7, 36750000, 41000000);
	}
}


//Runnable Lane_Detection_Preprocessing----
void run_Lane_Detection_Preprocessing(char* coreName){
	read_Image_lane_lines_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(7178560.0, 6573410, 7951921);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(6551424.0, 6151472, 7051367);
	}
	write_Image_lane_lines_host(1);
}


//Runnable Lane_Detection_Postprocessing----
void run_Lane_Detection_Postprocessing(char* coreName){
	read_Lane_boundaries_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(7561630.0, 6999284, 8513680);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(7399142.0, 5999632, 8199496);
	}
	write_Lane_boundaries_host(1);
}


//Runnable SFM_Function----
void run_SFM_Function(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(5.377531E7, 48274300, 59003000);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(4.953413E7, 44363022, 55623380);
	}
	else if(strcmp(coreName,"GPU_def")==0){
	executeTicks_DiscreteValueStatistics(1.08E7, 10575000, 11850000);
	}
}


//Runnable SFM_Preprocessing----
void run_SFM_Preprocessing(char* coreName){
	read_Image_SFM_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(6977531.0, 5878560, 7459318);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(5751424.0, 5151424, 6355142);
	}
	write_Image_SFM_host(1);
}


//Runnable SFM_Postprocessing----
void run_SFM_Postprocessing(char* coreName){
	read_Matrix_SFM_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(7213436.0, 6773920, 8347392);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(6363125.0, 5669568, 7064516);
	}
	write_Image_SFM_host(1);
}


//Runnable Localization_Preprocessing----
void run_Localization_Preprocessing(char* coreName){
	read_Cloud_map_host(1);
	read_Vehicle_status_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(1.107872E7, 6278720, 17878720);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(9231488.0, 6031488, 16431488);
	}
	write_Cloud_map_host(1);
	write_Vehicle_status_host(1);
}


//Runnable Localization_Postprocessing----
void run_Localization_Postprocessing(char* coreName){
	read_x_car_host(1);
	read_y_car_host(1);
	read_yaw_car_host(1);
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueStatistics(1.0599985E7, 8399985, 17399985);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueStatistics(8399994.0, 6199994, 12599994);
	}
	write_x_car_host(1);
	write_y_car_host(1);
	write_yaw_car_host(1);
}


//Runnable Detection_host_to_device----
void run_Detection_host_to_device(char* coreName){
	read_Image_host(1);
	write_Image_device(1);
}


//Runnable Detection_device_to_host----
void run_Detection_device_to_host(char* coreName){
	read_Bounding_box_device(1);
	write_Bounding_box_host(1);
}


//Runnable Lane_Detection_host_to_device----
void run_Lane_Detection_host_to_device(char* coreName){
	read_Image_lane_lines_host(1);
	write_Image_lane_lines_device(1);
}


//Runnable Lane_Detection_device_to_host----
void run_Lane_Detection_device_to_host(char* coreName){
	read_Lane_boundaries_device(1);
	write_Lane_boundaries_host(1);
}


//Runnable SFM_host_to_device----
void run_SFM_host_to_device(char* coreName){
	read_IMU_data_host(1);
	read_Image_SFM_host(1);
	write_Image_SFM_device(1);
	write_IMU_data_device(1);
}


//Runnable SFM_device_to_host----
void run_SFM_device_to_host(char* coreName){
	read_Matrix_SFM_device(1);
	write_Matrix_SFM_host(1);
}


//Runnable Localization_host_to_device----
void run_Localization_host_to_device(char* coreName){
	read_Cloud_map_host(1);
	read_Vehicle_status_host(1);
	write_Cloud_map_device(1);
	write_Vehicle_status_device(1);
}


//Runnable Localization_device_to_host----
void run_Localization_device_to_host(char* coreName){
	read_x_car_device(1);
	read_y_car_device(1);
	read_yaw_car_device(1);
	write_x_car_host(1);
	write_y_car_host(1);
	write_yaw_car_host(1);
}


//Runnable Detection_Function----
void run_Detection_Function(char* coreName){
	 if(strcmp(coreName,"GPU_def")==0){
	executeTicks_DiscreteValueStatistics(1.65E8, 162000000, 174000000);
	}
}


//Runnable AsyncOffloadingCosts----
void run_AsyncOffloadingCosts(char* coreName){
	 if(strcmp(coreName,"A57")==0){
	executeTicks_DiscreteValueConstant(5000);
	}
	else if(strcmp(coreName,"Denver")==0){
	executeTicks_DiscreteValueConstant(5000);
	}
}

