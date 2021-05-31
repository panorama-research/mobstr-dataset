// This code is auto-generated

#include "tasks.h"
#include <pthread.h>
void OS_Overhead(){
	run_OS_Ops_Function("default");
}

void *OS_Overhead_entry(){
	OS_Overhead();
}
void Lidar_Grabber(){
	run_Lidar_Function("Denver");
}

void *Lidar_Grabber_entry(){
	Lidar_Grabber();
}
void DASM(){
	run_DASM_Function("default");
}

void *DASM_entry(){
	DASM();
}
void CANbus_polling(){
	run_CAN_Function("default");
}

void *CANbus_polling_entry(){
	CANbus_polling();
}
void EKF(){
	run_EKF_Function("A57");
}

void *EKF_entry(){
	EKF();
}
void Planner(){
	run_Planner_Function("A57");
}

void *Planner_entry(){
	Planner();
}
void PRE_SFM_gpu_POST(){
	run_SFM_Preprocessing("Denver");
	//interprocess trigger
	pthread_t SFM_;
		
		pthread_create(&SFM_, NULL, *SFM_entry, NULL);
		//pthread_join(SFM_, NULL);
		
	run_SFM_Postprocessing("Denver");
}

void *PRE_SFM_gpu_POST_entry(){
	PRE_SFM_gpu_POST();
}
void PRE_Localization_gpu_POST(){
	run_Localization_Preprocessing("Denver");
	//interprocess trigger
	pthread_t Localization_;
		
		pthread_create(&Localization_, NULL, *Localization_entry, NULL);
		//pthread_join(Localization_, NULL);
		
	run_Localization_Postprocessing("Denver");
}

void *PRE_Localization_gpu_POST_entry(){
	PRE_Localization_gpu_POST();
}
void PRE_Lane_detection_gpu_POST(){
	run_Lane_Detection_Preprocessing("A57");
	//interprocess trigger
	pthread_t Lane_detection_;
		
		pthread_create(&Lane_detection_, NULL, *Lane_detection_entry, NULL);
		//pthread_join(Lane_detection_, NULL);
		
	run_Lane_Detection_Postprocessing("A57");
}

void *PRE_Lane_detection_gpu_POST_entry(){
	PRE_Lane_detection_gpu_POST();
}
void PRE_Detection_gpu_POST(){
	run_Detection_Preprocessing("A57");
	//interprocess trigger
	pthread_t Detection_;
		
		pthread_create(&Detection_, NULL, *Detection_entry, NULL);
		//pthread_join(Detection_, NULL);
		
	run_AsyncOffloadingCosts("A57");
	run_Detection_Postprocessing("A57");
}

void *PRE_Detection_gpu_POST_entry(){
	PRE_Detection_gpu_POST();
}
void SFM(){
	run_SFM_host_to_device("GPU_def");
	run_SFM_Function("GPU_def");
	run_SFM_device_to_host("GPU_def");
}

void *SFM_entry(){
	SFM();
}
void Localization(){
	run_Localization_host_to_device("GPU_def");
	run_Localization_Function("GPU_def");
	run_Localization_device_to_host("GPU_def");
}

void *Localization_entry(){
	Localization();
}
void Lane_detection(){
	run_Lane_Detection_host_to_device("GPU_def");
	run_Lane_Detection_Function("GPU_def");
	run_Lane_Detection_device_to_host("GPU_def");
}

void *Lane_detection_entry(){
	Lane_detection();
}
void Detection(){
	run_Detection_host_to_device("GPU_def");
	run_Detection_Function("GPU_def");
	run_Detection_device_to_host("GPU_def");
}

void *Detection_entry(){
	Detection();
}
