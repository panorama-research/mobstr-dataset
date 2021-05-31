// This code is auto-generated

#include "tasks.h"
#include <pthread.h>
#include <unistd.h>
void *periodic_5msEntry(){
	DASM();
}
void *periodic_10msEntry(){
	CANbus_polling();
}
void *periodic_15msEntry(){
	EKF();
	Planner();
}
void *periodic_33msEntry(){
	Lidar_Grabber();
	PRE_SFM_gpu_POST();
}
void *periodic_66msEntry(){
	PRE_Lane_detection_gpu_POST();
}
void *periodic_100msEntry(){
	OS_Overhead();
}
void *periodic_200msEntry(){
	PRE_Detection_gpu_POST();
}
void *periodic_400msEntry(){
	PRE_Localization_gpu_POST();
}
void *periodic_5msLoop(){
	pthread_t periodic_5ms;
	for(;;){
		pthread_create(&periodic_5ms, NULL, periodic_5msEntry, NULL);
		
		usleep(5000);
			}
		}
void *periodic_10msLoop(){
	pthread_t periodic_10ms;
	for(;;){
		pthread_create(&periodic_10ms, NULL, periodic_10msEntry, NULL);
		
		usleep(10000);
			}
		}
void *periodic_15msLoop(){
	pthread_t periodic_15ms;
	for(;;){
		pthread_create(&periodic_15ms, NULL, periodic_15msEntry, NULL);
		
		usleep(15000);
			}
		}
void *periodic_33msLoop(){
	pthread_t periodic_33ms;
	for(;;){
		pthread_create(&periodic_33ms, NULL, periodic_33msEntry, NULL);
		
		usleep(33000);
			}
		}
void *periodic_66msLoop(){
	pthread_t periodic_66ms;
	for(;;){
		pthread_create(&periodic_66ms, NULL, periodic_66msEntry, NULL);
		
		usleep(66000);
			}
		}
void *periodic_100msLoop(){
	pthread_t periodic_100ms;
	for(;;){
		pthread_create(&periodic_100ms, NULL, periodic_100msEntry, NULL);
		
		usleep(100000);
			}
		}
void *periodic_200msLoop(){
	pthread_t periodic_200ms;
	for(;;){
		pthread_create(&periodic_200ms, NULL, periodic_200msEntry, NULL);
		
		usleep(200000);
			}
		}
void *periodic_400msLoop(){
	pthread_t periodic_400ms;
	for(;;){
		pthread_create(&periodic_400ms, NULL, periodic_400msEntry, NULL);
		
		usleep(400000);
			}
		}
	int main(int argc, char **argv){
		pthread_t periodic_5ms_;
		pthread_create(&periodic_5ms_, NULL, periodic_5msLoop, NULL);
		pthread_t periodic_10ms_;
		pthread_create(&periodic_10ms_, NULL, periodic_10msLoop, NULL);
		pthread_t periodic_15ms_;
		pthread_create(&periodic_15ms_, NULL, periodic_15msLoop, NULL);
		pthread_t periodic_33ms_;
		pthread_create(&periodic_33ms_, NULL, periodic_33msLoop, NULL);
		pthread_t periodic_66ms_;
		pthread_create(&periodic_66ms_, NULL, periodic_66msLoop, NULL);
		pthread_t periodic_100ms_;
		pthread_create(&periodic_100ms_, NULL, periodic_100msLoop, NULL);
		pthread_t periodic_200ms_;
		pthread_create(&periodic_200ms_, NULL, periodic_200msLoop, NULL);
		pthread_t periodic_400ms_;
		pthread_create(&periodic_400ms_, NULL, periodic_400msLoop, NULL);
		pthread_join(periodic_400ms_, NULL);
	}
