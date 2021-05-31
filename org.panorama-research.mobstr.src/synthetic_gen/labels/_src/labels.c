// This code is auto-generated

#include "labels.h"

int Cloud_map_host[375000];	

static bool isIinitialized_Cloud_map_host = false;
void initialize_Cloud_map_host() {
	if (!isIinitialized_Cloud_map_host){
		for (int i=0; i < 375000; i++){
			Cloud_map_host[i] = i+1;
		}
		isIinitialized_Cloud_map_host = true;
	}
}


void read_Cloud_map_host(int labelAccessStatistics) {
	int numberOfBytes = 1500000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Cloud_map_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Cloud_map_host[i];
			a = Cloud_map_host[i+1];
			a = Cloud_map_host[i+2];
			a = Cloud_map_host[i+3];
			a = Cloud_map_host[i+4];
			a = Cloud_map_host[i+5];
			a = Cloud_map_host[i+6];
			a = Cloud_map_host[i+7];
			a = Cloud_map_host[i+8];
			a = Cloud_map_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Cloud_map_host[i];
		}
	}
}

void write_Cloud_map_host(int labelAccessStatistics) {
	int numberOfBytes = 1500000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Cloud_map_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Cloud_map_host[i]   = 0xAFFE;
			Cloud_map_host[i+1] = 0xAFFE;
			Cloud_map_host[i+2] = 0xAFFE;
			Cloud_map_host[i+3] = 0xAFFE;
			Cloud_map_host[i+4] = 0xAFFE;
			Cloud_map_host[i+5] = 0xAFFE;
			Cloud_map_host[i+6] = 0xAFFE;
			Cloud_map_host[i+7] = 0xAFFE;
			Cloud_map_host[i+8] = 0xAFFE;
			Cloud_map_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Cloud_map_host[i]=0xAFFE;
		}
	}
}

int Occupancy_grid_host[125000];	

static bool isIinitialized_Occupancy_grid_host = false;
void initialize_Occupancy_grid_host() {
	if (!isIinitialized_Occupancy_grid_host){
		for (int i=0; i < 125000; i++){
			Occupancy_grid_host[i] = i+1;
		}
		isIinitialized_Occupancy_grid_host = true;
	}
}


void read_Occupancy_grid_host(int labelAccessStatistics) {
	int numberOfBytes = 500000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Occupancy_grid_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Occupancy_grid_host[i];
			a = Occupancy_grid_host[i+1];
			a = Occupancy_grid_host[i+2];
			a = Occupancy_grid_host[i+3];
			a = Occupancy_grid_host[i+4];
			a = Occupancy_grid_host[i+5];
			a = Occupancy_grid_host[i+6];
			a = Occupancy_grid_host[i+7];
			a = Occupancy_grid_host[i+8];
			a = Occupancy_grid_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Occupancy_grid_host[i];
		}
	}
}

void write_Occupancy_grid_host(int labelAccessStatistics) {
	int numberOfBytes = 500000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Occupancy_grid_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Occupancy_grid_host[i]   = 0xAFFE;
			Occupancy_grid_host[i+1] = 0xAFFE;
			Occupancy_grid_host[i+2] = 0xAFFE;
			Occupancy_grid_host[i+3] = 0xAFFE;
			Occupancy_grid_host[i+4] = 0xAFFE;
			Occupancy_grid_host[i+5] = 0xAFFE;
			Occupancy_grid_host[i+6] = 0xAFFE;
			Occupancy_grid_host[i+7] = 0xAFFE;
			Occupancy_grid_host[i+8] = 0xAFFE;
			Occupancy_grid_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Occupancy_grid_host[i]=0xAFFE;
		}
	}
}

int Vehicle_status_host[250];	

static bool isIinitialized_Vehicle_status_host = false;
void initialize_Vehicle_status_host() {
	if (!isIinitialized_Vehicle_status_host){
		for (int i=0; i < 250; i++){
			Vehicle_status_host[i] = i+1;
		}
		isIinitialized_Vehicle_status_host = true;
	}
}


void read_Vehicle_status_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Vehicle_status_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Vehicle_status_host[i];
			a = Vehicle_status_host[i+1];
			a = Vehicle_status_host[i+2];
			a = Vehicle_status_host[i+3];
			a = Vehicle_status_host[i+4];
			a = Vehicle_status_host[i+5];
			a = Vehicle_status_host[i+6];
			a = Vehicle_status_host[i+7];
			a = Vehicle_status_host[i+8];
			a = Vehicle_status_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Vehicle_status_host[i];
		}
	}
}

void write_Vehicle_status_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Vehicle_status_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Vehicle_status_host[i]   = 0xAFFE;
			Vehicle_status_host[i+1] = 0xAFFE;
			Vehicle_status_host[i+2] = 0xAFFE;
			Vehicle_status_host[i+3] = 0xAFFE;
			Vehicle_status_host[i+4] = 0xAFFE;
			Vehicle_status_host[i+5] = 0xAFFE;
			Vehicle_status_host[i+6] = 0xAFFE;
			Vehicle_status_host[i+7] = 0xAFFE;
			Vehicle_status_host[i+8] = 0xAFFE;
			Vehicle_status_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Vehicle_status_host[i]=0xAFFE;
		}
	}
}

int x_car_host[250];	

static bool isIinitialized_x_car_host = false;
void initialize_x_car_host() {
	if (!isIinitialized_x_car_host){
		for (int i=0; i < 250; i++){
			x_car_host[i] = i+1;
		}
		isIinitialized_x_car_host = true;
	}
}


void read_x_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(x_car_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = x_car_host[i];
			a = x_car_host[i+1];
			a = x_car_host[i+2];
			a = x_car_host[i+3];
			a = x_car_host[i+4];
			a = x_car_host[i+5];
			a = x_car_host[i+6];
			a = x_car_host[i+7];
			a = x_car_host[i+8];
			a = x_car_host[i+9];
		}
		for(;i<arraysize;i++){
			a = x_car_host[i];
		}
	}
}

void write_x_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(x_car_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			x_car_host[i]   = 0xAFFE;
			x_car_host[i+1] = 0xAFFE;
			x_car_host[i+2] = 0xAFFE;
			x_car_host[i+3] = 0xAFFE;
			x_car_host[i+4] = 0xAFFE;
			x_car_host[i+5] = 0xAFFE;
			x_car_host[i+6] = 0xAFFE;
			x_car_host[i+7] = 0xAFFE;
			x_car_host[i+8] = 0xAFFE;
			x_car_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				x_car_host[i]=0xAFFE;
		}
	}
}

int y_car_host[250];	

static bool isIinitialized_y_car_host = false;
void initialize_y_car_host() {
	if (!isIinitialized_y_car_host){
		for (int i=0; i < 250; i++){
			y_car_host[i] = i+1;
		}
		isIinitialized_y_car_host = true;
	}
}


void read_y_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(y_car_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = y_car_host[i];
			a = y_car_host[i+1];
			a = y_car_host[i+2];
			a = y_car_host[i+3];
			a = y_car_host[i+4];
			a = y_car_host[i+5];
			a = y_car_host[i+6];
			a = y_car_host[i+7];
			a = y_car_host[i+8];
			a = y_car_host[i+9];
		}
		for(;i<arraysize;i++){
			a = y_car_host[i];
		}
	}
}

void write_y_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(y_car_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			y_car_host[i]   = 0xAFFE;
			y_car_host[i+1] = 0xAFFE;
			y_car_host[i+2] = 0xAFFE;
			y_car_host[i+3] = 0xAFFE;
			y_car_host[i+4] = 0xAFFE;
			y_car_host[i+5] = 0xAFFE;
			y_car_host[i+6] = 0xAFFE;
			y_car_host[i+7] = 0xAFFE;
			y_car_host[i+8] = 0xAFFE;
			y_car_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				y_car_host[i]=0xAFFE;
		}
	}
}

int yaw_car_host[250];	

static bool isIinitialized_yaw_car_host = false;
void initialize_yaw_car_host() {
	if (!isIinitialized_yaw_car_host){
		for (int i=0; i < 250; i++){
			yaw_car_host[i] = i+1;
		}
		isIinitialized_yaw_car_host = true;
	}
}


void read_yaw_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_car_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = yaw_car_host[i];
			a = yaw_car_host[i+1];
			a = yaw_car_host[i+2];
			a = yaw_car_host[i+3];
			a = yaw_car_host[i+4];
			a = yaw_car_host[i+5];
			a = yaw_car_host[i+6];
			a = yaw_car_host[i+7];
			a = yaw_car_host[i+8];
			a = yaw_car_host[i+9];
		}
		for(;i<arraysize;i++){
			a = yaw_car_host[i];
		}
	}
}

void write_yaw_car_host(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_car_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			yaw_car_host[i]   = 0xAFFE;
			yaw_car_host[i+1] = 0xAFFE;
			yaw_car_host[i+2] = 0xAFFE;
			yaw_car_host[i+3] = 0xAFFE;
			yaw_car_host[i+4] = 0xAFFE;
			yaw_car_host[i+5] = 0xAFFE;
			yaw_car_host[i+6] = 0xAFFE;
			yaw_car_host[i+7] = 0xAFFE;
			yaw_car_host[i+8] = 0xAFFE;
			yaw_car_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				yaw_car_host[i]=0xAFFE;
		}
	}
}

int vel_car[250];	

static bool isIinitialized_vel_car = false;
void initialize_vel_car() {
	if (!isIinitialized_vel_car){
		for (int i=0; i < 250; i++){
			vel_car[i] = i+1;
		}
		isIinitialized_vel_car = true;
	}
}


void read_vel_car(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(vel_car) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = vel_car[i];
			a = vel_car[i+1];
			a = vel_car[i+2];
			a = vel_car[i+3];
			a = vel_car[i+4];
			a = vel_car[i+5];
			a = vel_car[i+6];
			a = vel_car[i+7];
			a = vel_car[i+8];
			a = vel_car[i+9];
		}
		for(;i<arraysize;i++){
			a = vel_car[i];
		}
	}
}

void write_vel_car(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(vel_car) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			vel_car[i]   = 0xAFFE;
			vel_car[i+1] = 0xAFFE;
			vel_car[i+2] = 0xAFFE;
			vel_car[i+3] = 0xAFFE;
			vel_car[i+4] = 0xAFFE;
			vel_car[i+5] = 0xAFFE;
			vel_car[i+6] = 0xAFFE;
			vel_car[i+7] = 0xAFFE;
			vel_car[i+8] = 0xAFFE;
			vel_car[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				vel_car[i]=0xAFFE;
		}
	}
}

int yaw_rate[250];	

static bool isIinitialized_yaw_rate = false;
void initialize_yaw_rate() {
	if (!isIinitialized_yaw_rate){
		for (int i=0; i < 250; i++){
			yaw_rate[i] = i+1;
		}
		isIinitialized_yaw_rate = true;
	}
}


void read_yaw_rate(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_rate) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = yaw_rate[i];
			a = yaw_rate[i+1];
			a = yaw_rate[i+2];
			a = yaw_rate[i+3];
			a = yaw_rate[i+4];
			a = yaw_rate[i+5];
			a = yaw_rate[i+6];
			a = yaw_rate[i+7];
			a = yaw_rate[i+8];
			a = yaw_rate[i+9];
		}
		for(;i<arraysize;i++){
			a = yaw_rate[i];
		}
	}
}

void write_yaw_rate(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_rate) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			yaw_rate[i]   = 0xAFFE;
			yaw_rate[i+1] = 0xAFFE;
			yaw_rate[i+2] = 0xAFFE;
			yaw_rate[i+3] = 0xAFFE;
			yaw_rate[i+4] = 0xAFFE;
			yaw_rate[i+5] = 0xAFFE;
			yaw_rate[i+6] = 0xAFFE;
			yaw_rate[i+7] = 0xAFFE;
			yaw_rate[i+8] = 0xAFFE;
			yaw_rate[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				yaw_rate[i]=0xAFFE;
		}
	}
}

int Lane_boundaries_host[64];	

static bool isIinitialized_Lane_boundaries_host = false;
void initialize_Lane_boundaries_host() {
	if (!isIinitialized_Lane_boundaries_host){
		for (int i=0; i < 64; i++){
			Lane_boundaries_host[i] = i+1;
		}
		isIinitialized_Lane_boundaries_host = true;
	}
}


void read_Lane_boundaries_host(int labelAccessStatistics) {
	int numberOfBytes = 256;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Lane_boundaries_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Lane_boundaries_host[i];
			a = Lane_boundaries_host[i+1];
			a = Lane_boundaries_host[i+2];
			a = Lane_boundaries_host[i+3];
			a = Lane_boundaries_host[i+4];
			a = Lane_boundaries_host[i+5];
			a = Lane_boundaries_host[i+6];
			a = Lane_boundaries_host[i+7];
			a = Lane_boundaries_host[i+8];
			a = Lane_boundaries_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Lane_boundaries_host[i];
		}
	}
}

void write_Lane_boundaries_host(int labelAccessStatistics) {
	int numberOfBytes = 256;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Lane_boundaries_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Lane_boundaries_host[i]   = 0xAFFE;
			Lane_boundaries_host[i+1] = 0xAFFE;
			Lane_boundaries_host[i+2] = 0xAFFE;
			Lane_boundaries_host[i+3] = 0xAFFE;
			Lane_boundaries_host[i+4] = 0xAFFE;
			Lane_boundaries_host[i+5] = 0xAFFE;
			Lane_boundaries_host[i+6] = 0xAFFE;
			Lane_boundaries_host[i+7] = 0xAFFE;
			Lane_boundaries_host[i+8] = 0xAFFE;
			Lane_boundaries_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Lane_boundaries_host[i]=0xAFFE;
		}
	}
}

int Matrix_SFM_host[6000];	

static bool isIinitialized_Matrix_SFM_host = false;
void initialize_Matrix_SFM_host() {
	if (!isIinitialized_Matrix_SFM_host){
		for (int i=0; i < 6000; i++){
			Matrix_SFM_host[i] = i+1;
		}
		isIinitialized_Matrix_SFM_host = true;
	}
}


void read_Matrix_SFM_host(int labelAccessStatistics) {
	int numberOfBytes = 24000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Matrix_SFM_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Matrix_SFM_host[i];
			a = Matrix_SFM_host[i+1];
			a = Matrix_SFM_host[i+2];
			a = Matrix_SFM_host[i+3];
			a = Matrix_SFM_host[i+4];
			a = Matrix_SFM_host[i+5];
			a = Matrix_SFM_host[i+6];
			a = Matrix_SFM_host[i+7];
			a = Matrix_SFM_host[i+8];
			a = Matrix_SFM_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Matrix_SFM_host[i];
		}
	}
}

void write_Matrix_SFM_host(int labelAccessStatistics) {
	int numberOfBytes = 24000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Matrix_SFM_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Matrix_SFM_host[i]   = 0xAFFE;
			Matrix_SFM_host[i+1] = 0xAFFE;
			Matrix_SFM_host[i+2] = 0xAFFE;
			Matrix_SFM_host[i+3] = 0xAFFE;
			Matrix_SFM_host[i+4] = 0xAFFE;
			Matrix_SFM_host[i+5] = 0xAFFE;
			Matrix_SFM_host[i+6] = 0xAFFE;
			Matrix_SFM_host[i+7] = 0xAFFE;
			Matrix_SFM_host[i+8] = 0xAFFE;
			Matrix_SFM_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Matrix_SFM_host[i]=0xAFFE;
		}
	}
}

int Bounding_box_host[187500];	

static bool isIinitialized_Bounding_box_host = false;
void initialize_Bounding_box_host() {
	if (!isIinitialized_Bounding_box_host){
		for (int i=0; i < 187500; i++){
			Bounding_box_host[i] = i+1;
		}
		isIinitialized_Bounding_box_host = true;
	}
}


void read_Bounding_box_host(int labelAccessStatistics) {
	int numberOfBytes = 750000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Bounding_box_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Bounding_box_host[i];
			a = Bounding_box_host[i+1];
			a = Bounding_box_host[i+2];
			a = Bounding_box_host[i+3];
			a = Bounding_box_host[i+4];
			a = Bounding_box_host[i+5];
			a = Bounding_box_host[i+6];
			a = Bounding_box_host[i+7];
			a = Bounding_box_host[i+8];
			a = Bounding_box_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Bounding_box_host[i];
		}
	}
}

void write_Bounding_box_host(int labelAccessStatistics) {
	int numberOfBytes = 750000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Bounding_box_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Bounding_box_host[i]   = 0xAFFE;
			Bounding_box_host[i+1] = 0xAFFE;
			Bounding_box_host[i+2] = 0xAFFE;
			Bounding_box_host[i+3] = 0xAFFE;
			Bounding_box_host[i+4] = 0xAFFE;
			Bounding_box_host[i+5] = 0xAFFE;
			Bounding_box_host[i+6] = 0xAFFE;
			Bounding_box_host[i+7] = 0xAFFE;
			Bounding_box_host[i+8] = 0xAFFE;
			Bounding_box_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Bounding_box_host[i]=0xAFFE;
		}
	}
}

int speed_objective[250];	

static bool isIinitialized_speed_objective = false;
void initialize_speed_objective() {
	if (!isIinitialized_speed_objective){
		for (int i=0; i < 250; i++){
			speed_objective[i] = i+1;
		}
		isIinitialized_speed_objective = true;
	}
}


void read_speed_objective(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(speed_objective) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = speed_objective[i];
			a = speed_objective[i+1];
			a = speed_objective[i+2];
			a = speed_objective[i+3];
			a = speed_objective[i+4];
			a = speed_objective[i+5];
			a = speed_objective[i+6];
			a = speed_objective[i+7];
			a = speed_objective[i+8];
			a = speed_objective[i+9];
		}
		for(;i<arraysize;i++){
			a = speed_objective[i];
		}
	}
}

void write_speed_objective(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(speed_objective) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			speed_objective[i]   = 0xAFFE;
			speed_objective[i+1] = 0xAFFE;
			speed_objective[i+2] = 0xAFFE;
			speed_objective[i+3] = 0xAFFE;
			speed_objective[i+4] = 0xAFFE;
			speed_objective[i+5] = 0xAFFE;
			speed_objective[i+6] = 0xAFFE;
			speed_objective[i+7] = 0xAFFE;
			speed_objective[i+8] = 0xAFFE;
			speed_objective[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				speed_objective[i]=0xAFFE;
		}
	}
}

int steer_objective[250];	

static bool isIinitialized_steer_objective = false;
void initialize_steer_objective() {
	if (!isIinitialized_steer_objective){
		for (int i=0; i < 250; i++){
			steer_objective[i] = i+1;
		}
		isIinitialized_steer_objective = true;
	}
}


void read_steer_objective(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(steer_objective) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = steer_objective[i];
			a = steer_objective[i+1];
			a = steer_objective[i+2];
			a = steer_objective[i+3];
			a = steer_objective[i+4];
			a = steer_objective[i+5];
			a = steer_objective[i+6];
			a = steer_objective[i+7];
			a = steer_objective[i+8];
			a = steer_objective[i+9];
		}
		for(;i<arraysize;i++){
			a = steer_objective[i];
		}
	}
}

void write_steer_objective(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(steer_objective) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			steer_objective[i]   = 0xAFFE;
			steer_objective[i+1] = 0xAFFE;
			steer_objective[i+2] = 0xAFFE;
			steer_objective[i+3] = 0xAFFE;
			steer_objective[i+4] = 0xAFFE;
			steer_objective[i+5] = 0xAFFE;
			steer_objective[i+6] = 0xAFFE;
			steer_objective[i+7] = 0xAFFE;
			steer_objective[i+8] = 0xAFFE;
			steer_objective[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				steer_objective[i]=0xAFFE;
		}
	}
}

int Image_host[500000];	

static bool isIinitialized_Image_host = false;
void initialize_Image_host() {
	if (!isIinitialized_Image_host){
		for (int i=0; i < 500000; i++){
			Image_host[i] = i+1;
		}
		isIinitialized_Image_host = true;
	}
}


void read_Image_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_host[i];
			a = Image_host[i+1];
			a = Image_host[i+2];
			a = Image_host[i+3];
			a = Image_host[i+4];
			a = Image_host[i+5];
			a = Image_host[i+6];
			a = Image_host[i+7];
			a = Image_host[i+8];
			a = Image_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_host[i];
		}
	}
}

void write_Image_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_host[i]   = 0xAFFE;
			Image_host[i+1] = 0xAFFE;
			Image_host[i+2] = 0xAFFE;
			Image_host[i+3] = 0xAFFE;
			Image_host[i+4] = 0xAFFE;
			Image_host[i+5] = 0xAFFE;
			Image_host[i+6] = 0xAFFE;
			Image_host[i+7] = 0xAFFE;
			Image_host[i+8] = 0xAFFE;
			Image_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_host[i]=0xAFFE;
		}
	}
}

int Image_lane_lines_host[500000];	

static bool isIinitialized_Image_lane_lines_host = false;
void initialize_Image_lane_lines_host() {
	if (!isIinitialized_Image_lane_lines_host){
		for (int i=0; i < 500000; i++){
			Image_lane_lines_host[i] = i+1;
		}
		isIinitialized_Image_lane_lines_host = true;
	}
}


void read_Image_lane_lines_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_lane_lines_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_lane_lines_host[i];
			a = Image_lane_lines_host[i+1];
			a = Image_lane_lines_host[i+2];
			a = Image_lane_lines_host[i+3];
			a = Image_lane_lines_host[i+4];
			a = Image_lane_lines_host[i+5];
			a = Image_lane_lines_host[i+6];
			a = Image_lane_lines_host[i+7];
			a = Image_lane_lines_host[i+8];
			a = Image_lane_lines_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_lane_lines_host[i];
		}
	}
}

void write_Image_lane_lines_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_lane_lines_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_lane_lines_host[i]   = 0xAFFE;
			Image_lane_lines_host[i+1] = 0xAFFE;
			Image_lane_lines_host[i+2] = 0xAFFE;
			Image_lane_lines_host[i+3] = 0xAFFE;
			Image_lane_lines_host[i+4] = 0xAFFE;
			Image_lane_lines_host[i+5] = 0xAFFE;
			Image_lane_lines_host[i+6] = 0xAFFE;
			Image_lane_lines_host[i+7] = 0xAFFE;
			Image_lane_lines_host[i+8] = 0xAFFE;
			Image_lane_lines_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_lane_lines_host[i]=0xAFFE;
		}
	}
}

int Image_SFM_host[500000];	

static bool isIinitialized_Image_SFM_host = false;
void initialize_Image_SFM_host() {
	if (!isIinitialized_Image_SFM_host){
		for (int i=0; i < 500000; i++){
			Image_SFM_host[i] = i+1;
		}
		isIinitialized_Image_SFM_host = true;
	}
}


void read_Image_SFM_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_SFM_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_SFM_host[i];
			a = Image_SFM_host[i+1];
			a = Image_SFM_host[i+2];
			a = Image_SFM_host[i+3];
			a = Image_SFM_host[i+4];
			a = Image_SFM_host[i+5];
			a = Image_SFM_host[i+6];
			a = Image_SFM_host[i+7];
			a = Image_SFM_host[i+8];
			a = Image_SFM_host[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_SFM_host[i];
		}
	}
}

void write_Image_SFM_host(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_SFM_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_SFM_host[i]   = 0xAFFE;
			Image_SFM_host[i+1] = 0xAFFE;
			Image_SFM_host[i+2] = 0xAFFE;
			Image_SFM_host[i+3] = 0xAFFE;
			Image_SFM_host[i+4] = 0xAFFE;
			Image_SFM_host[i+5] = 0xAFFE;
			Image_SFM_host[i+6] = 0xAFFE;
			Image_SFM_host[i+7] = 0xAFFE;
			Image_SFM_host[i+8] = 0xAFFE;
			Image_SFM_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_SFM_host[i]=0xAFFE;
		}
	}
}

int Image_device[500000];	

static bool isIinitialized_Image_device = false;
void initialize_Image_device() {
	if (!isIinitialized_Image_device){
		for (int i=0; i < 500000; i++){
			Image_device[i] = i+1;
		}
		isIinitialized_Image_device = true;
	}
}


void read_Image_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_device[i];
			a = Image_device[i+1];
			a = Image_device[i+2];
			a = Image_device[i+3];
			a = Image_device[i+4];
			a = Image_device[i+5];
			a = Image_device[i+6];
			a = Image_device[i+7];
			a = Image_device[i+8];
			a = Image_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_device[i];
		}
	}
}

void write_Image_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_device[i]   = 0xAFFE;
			Image_device[i+1] = 0xAFFE;
			Image_device[i+2] = 0xAFFE;
			Image_device[i+3] = 0xAFFE;
			Image_device[i+4] = 0xAFFE;
			Image_device[i+5] = 0xAFFE;
			Image_device[i+6] = 0xAFFE;
			Image_device[i+7] = 0xAFFE;
			Image_device[i+8] = 0xAFFE;
			Image_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_device[i]=0xAFFE;
		}
	}
}

int Bounding_box_device[187500];	

static bool isIinitialized_Bounding_box_device = false;
void initialize_Bounding_box_device() {
	if (!isIinitialized_Bounding_box_device){
		for (int i=0; i < 187500; i++){
			Bounding_box_device[i] = i+1;
		}
		isIinitialized_Bounding_box_device = true;
	}
}


void read_Bounding_box_device(int labelAccessStatistics) {
	int numberOfBytes = 750000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Bounding_box_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Bounding_box_device[i];
			a = Bounding_box_device[i+1];
			a = Bounding_box_device[i+2];
			a = Bounding_box_device[i+3];
			a = Bounding_box_device[i+4];
			a = Bounding_box_device[i+5];
			a = Bounding_box_device[i+6];
			a = Bounding_box_device[i+7];
			a = Bounding_box_device[i+8];
			a = Bounding_box_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Bounding_box_device[i];
		}
	}
}

void write_Bounding_box_device(int labelAccessStatistics) {
	int numberOfBytes = 750000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Bounding_box_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Bounding_box_device[i]   = 0xAFFE;
			Bounding_box_device[i+1] = 0xAFFE;
			Bounding_box_device[i+2] = 0xAFFE;
			Bounding_box_device[i+3] = 0xAFFE;
			Bounding_box_device[i+4] = 0xAFFE;
			Bounding_box_device[i+5] = 0xAFFE;
			Bounding_box_device[i+6] = 0xAFFE;
			Bounding_box_device[i+7] = 0xAFFE;
			Bounding_box_device[i+8] = 0xAFFE;
			Bounding_box_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Bounding_box_device[i]=0xAFFE;
		}
	}
}

int Image_lane_lines_device[500000];	

static bool isIinitialized_Image_lane_lines_device = false;
void initialize_Image_lane_lines_device() {
	if (!isIinitialized_Image_lane_lines_device){
		for (int i=0; i < 500000; i++){
			Image_lane_lines_device[i] = i+1;
		}
		isIinitialized_Image_lane_lines_device = true;
	}
}


void read_Image_lane_lines_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_lane_lines_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_lane_lines_device[i];
			a = Image_lane_lines_device[i+1];
			a = Image_lane_lines_device[i+2];
			a = Image_lane_lines_device[i+3];
			a = Image_lane_lines_device[i+4];
			a = Image_lane_lines_device[i+5];
			a = Image_lane_lines_device[i+6];
			a = Image_lane_lines_device[i+7];
			a = Image_lane_lines_device[i+8];
			a = Image_lane_lines_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_lane_lines_device[i];
		}
	}
}

void write_Image_lane_lines_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_lane_lines_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_lane_lines_device[i]   = 0xAFFE;
			Image_lane_lines_device[i+1] = 0xAFFE;
			Image_lane_lines_device[i+2] = 0xAFFE;
			Image_lane_lines_device[i+3] = 0xAFFE;
			Image_lane_lines_device[i+4] = 0xAFFE;
			Image_lane_lines_device[i+5] = 0xAFFE;
			Image_lane_lines_device[i+6] = 0xAFFE;
			Image_lane_lines_device[i+7] = 0xAFFE;
			Image_lane_lines_device[i+8] = 0xAFFE;
			Image_lane_lines_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_lane_lines_device[i]=0xAFFE;
		}
	}
}

int Lane_boundaries_device[64];	

static bool isIinitialized_Lane_boundaries_device = false;
void initialize_Lane_boundaries_device() {
	if (!isIinitialized_Lane_boundaries_device){
		for (int i=0; i < 64; i++){
			Lane_boundaries_device[i] = i+1;
		}
		isIinitialized_Lane_boundaries_device = true;
	}
}


void read_Lane_boundaries_device(int labelAccessStatistics) {
	int numberOfBytes = 256;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Lane_boundaries_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Lane_boundaries_device[i];
			a = Lane_boundaries_device[i+1];
			a = Lane_boundaries_device[i+2];
			a = Lane_boundaries_device[i+3];
			a = Lane_boundaries_device[i+4];
			a = Lane_boundaries_device[i+5];
			a = Lane_boundaries_device[i+6];
			a = Lane_boundaries_device[i+7];
			a = Lane_boundaries_device[i+8];
			a = Lane_boundaries_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Lane_boundaries_device[i];
		}
	}
}

void write_Lane_boundaries_device(int labelAccessStatistics) {
	int numberOfBytes = 256;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Lane_boundaries_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Lane_boundaries_device[i]   = 0xAFFE;
			Lane_boundaries_device[i+1] = 0xAFFE;
			Lane_boundaries_device[i+2] = 0xAFFE;
			Lane_boundaries_device[i+3] = 0xAFFE;
			Lane_boundaries_device[i+4] = 0xAFFE;
			Lane_boundaries_device[i+5] = 0xAFFE;
			Lane_boundaries_device[i+6] = 0xAFFE;
			Lane_boundaries_device[i+7] = 0xAFFE;
			Lane_boundaries_device[i+8] = 0xAFFE;
			Lane_boundaries_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Lane_boundaries_device[i]=0xAFFE;
		}
	}
}

int IMU_data_host[64];	

static bool isIinitialized_IMU_data_host = false;
void initialize_IMU_data_host() {
	if (!isIinitialized_IMU_data_host){
		for (int i=0; i < 64; i++){
			IMU_data_host[i] = i+1;
		}
		isIinitialized_IMU_data_host = true;
	}
}


void read_IMU_data_host(int labelAccessStatistics) {
	int numberOfBytes = 256;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(IMU_data_host) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = IMU_data_host[i];
			a = IMU_data_host[i+1];
			a = IMU_data_host[i+2];
			a = IMU_data_host[i+3];
			a = IMU_data_host[i+4];
			a = IMU_data_host[i+5];
			a = IMU_data_host[i+6];
			a = IMU_data_host[i+7];
			a = IMU_data_host[i+8];
			a = IMU_data_host[i+9];
		}
		for(;i<arraysize;i++){
			a = IMU_data_host[i];
		}
	}
}

void write_IMU_data_host(int labelAccessStatistics) {
	int numberOfBytes = 256;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(IMU_data_host) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			IMU_data_host[i]   = 0xAFFE;
			IMU_data_host[i+1] = 0xAFFE;
			IMU_data_host[i+2] = 0xAFFE;
			IMU_data_host[i+3] = 0xAFFE;
			IMU_data_host[i+4] = 0xAFFE;
			IMU_data_host[i+5] = 0xAFFE;
			IMU_data_host[i+6] = 0xAFFE;
			IMU_data_host[i+7] = 0xAFFE;
			IMU_data_host[i+8] = 0xAFFE;
			IMU_data_host[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				IMU_data_host[i]=0xAFFE;
		}
	}
}

int Image_SFM_device[500000];	

static bool isIinitialized_Image_SFM_device = false;
void initialize_Image_SFM_device() {
	if (!isIinitialized_Image_SFM_device){
		for (int i=0; i < 500000; i++){
			Image_SFM_device[i] = i+1;
		}
		isIinitialized_Image_SFM_device = true;
	}
}


void read_Image_SFM_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_SFM_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Image_SFM_device[i];
			a = Image_SFM_device[i+1];
			a = Image_SFM_device[i+2];
			a = Image_SFM_device[i+3];
			a = Image_SFM_device[i+4];
			a = Image_SFM_device[i+5];
			a = Image_SFM_device[i+6];
			a = Image_SFM_device[i+7];
			a = Image_SFM_device[i+8];
			a = Image_SFM_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Image_SFM_device[i];
		}
	}
}

void write_Image_SFM_device(int labelAccessStatistics) {
	int numberOfBytes = 2000000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Image_SFM_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Image_SFM_device[i]   = 0xAFFE;
			Image_SFM_device[i+1] = 0xAFFE;
			Image_SFM_device[i+2] = 0xAFFE;
			Image_SFM_device[i+3] = 0xAFFE;
			Image_SFM_device[i+4] = 0xAFFE;
			Image_SFM_device[i+5] = 0xAFFE;
			Image_SFM_device[i+6] = 0xAFFE;
			Image_SFM_device[i+7] = 0xAFFE;
			Image_SFM_device[i+8] = 0xAFFE;
			Image_SFM_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Image_SFM_device[i]=0xAFFE;
		}
	}
}

int IMU_data_device[64];	

static bool isIinitialized_IMU_data_device = false;
void initialize_IMU_data_device() {
	if (!isIinitialized_IMU_data_device){
		for (int i=0; i < 64; i++){
			IMU_data_device[i] = i+1;
		}
		isIinitialized_IMU_data_device = true;
	}
}


void read_IMU_data_device(int labelAccessStatistics) {
	int numberOfBytes = 256;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(IMU_data_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = IMU_data_device[i];
			a = IMU_data_device[i+1];
			a = IMU_data_device[i+2];
			a = IMU_data_device[i+3];
			a = IMU_data_device[i+4];
			a = IMU_data_device[i+5];
			a = IMU_data_device[i+6];
			a = IMU_data_device[i+7];
			a = IMU_data_device[i+8];
			a = IMU_data_device[i+9];
		}
		for(;i<arraysize;i++){
			a = IMU_data_device[i];
		}
	}
}

void write_IMU_data_device(int labelAccessStatistics) {
	int numberOfBytes = 256;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(IMU_data_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			IMU_data_device[i]   = 0xAFFE;
			IMU_data_device[i+1] = 0xAFFE;
			IMU_data_device[i+2] = 0xAFFE;
			IMU_data_device[i+3] = 0xAFFE;
			IMU_data_device[i+4] = 0xAFFE;
			IMU_data_device[i+5] = 0xAFFE;
			IMU_data_device[i+6] = 0xAFFE;
			IMU_data_device[i+7] = 0xAFFE;
			IMU_data_device[i+8] = 0xAFFE;
			IMU_data_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				IMU_data_device[i]=0xAFFE;
		}
	}
}

int Matrix_SFM_device[6000];	

static bool isIinitialized_Matrix_SFM_device = false;
void initialize_Matrix_SFM_device() {
	if (!isIinitialized_Matrix_SFM_device){
		for (int i=0; i < 6000; i++){
			Matrix_SFM_device[i] = i+1;
		}
		isIinitialized_Matrix_SFM_device = true;
	}
}


void read_Matrix_SFM_device(int labelAccessStatistics) {
	int numberOfBytes = 24000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Matrix_SFM_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Matrix_SFM_device[i];
			a = Matrix_SFM_device[i+1];
			a = Matrix_SFM_device[i+2];
			a = Matrix_SFM_device[i+3];
			a = Matrix_SFM_device[i+4];
			a = Matrix_SFM_device[i+5];
			a = Matrix_SFM_device[i+6];
			a = Matrix_SFM_device[i+7];
			a = Matrix_SFM_device[i+8];
			a = Matrix_SFM_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Matrix_SFM_device[i];
		}
	}
}

void write_Matrix_SFM_device(int labelAccessStatistics) {
	int numberOfBytes = 24000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Matrix_SFM_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Matrix_SFM_device[i]   = 0xAFFE;
			Matrix_SFM_device[i+1] = 0xAFFE;
			Matrix_SFM_device[i+2] = 0xAFFE;
			Matrix_SFM_device[i+3] = 0xAFFE;
			Matrix_SFM_device[i+4] = 0xAFFE;
			Matrix_SFM_device[i+5] = 0xAFFE;
			Matrix_SFM_device[i+6] = 0xAFFE;
			Matrix_SFM_device[i+7] = 0xAFFE;
			Matrix_SFM_device[i+8] = 0xAFFE;
			Matrix_SFM_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Matrix_SFM_device[i]=0xAFFE;
		}
	}
}

int Cloud_map_device[375000];	

static bool isIinitialized_Cloud_map_device = false;
void initialize_Cloud_map_device() {
	if (!isIinitialized_Cloud_map_device){
		for (int i=0; i < 375000; i++){
			Cloud_map_device[i] = i+1;
		}
		isIinitialized_Cloud_map_device = true;
	}
}


void read_Cloud_map_device(int labelAccessStatistics) {
	int numberOfBytes = 1500000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Cloud_map_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Cloud_map_device[i];
			a = Cloud_map_device[i+1];
			a = Cloud_map_device[i+2];
			a = Cloud_map_device[i+3];
			a = Cloud_map_device[i+4];
			a = Cloud_map_device[i+5];
			a = Cloud_map_device[i+6];
			a = Cloud_map_device[i+7];
			a = Cloud_map_device[i+8];
			a = Cloud_map_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Cloud_map_device[i];
		}
	}
}

void write_Cloud_map_device(int labelAccessStatistics) {
	int numberOfBytes = 1500000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Cloud_map_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Cloud_map_device[i]   = 0xAFFE;
			Cloud_map_device[i+1] = 0xAFFE;
			Cloud_map_device[i+2] = 0xAFFE;
			Cloud_map_device[i+3] = 0xAFFE;
			Cloud_map_device[i+4] = 0xAFFE;
			Cloud_map_device[i+5] = 0xAFFE;
			Cloud_map_device[i+6] = 0xAFFE;
			Cloud_map_device[i+7] = 0xAFFE;
			Cloud_map_device[i+8] = 0xAFFE;
			Cloud_map_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Cloud_map_device[i]=0xAFFE;
		}
	}
}

int Vehicle_status_device[250];	

static bool isIinitialized_Vehicle_status_device = false;
void initialize_Vehicle_status_device() {
	if (!isIinitialized_Vehicle_status_device){
		for (int i=0; i < 250; i++){
			Vehicle_status_device[i] = i+1;
		}
		isIinitialized_Vehicle_status_device = true;
	}
}


void read_Vehicle_status_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Vehicle_status_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = Vehicle_status_device[i];
			a = Vehicle_status_device[i+1];
			a = Vehicle_status_device[i+2];
			a = Vehicle_status_device[i+3];
			a = Vehicle_status_device[i+4];
			a = Vehicle_status_device[i+5];
			a = Vehicle_status_device[i+6];
			a = Vehicle_status_device[i+7];
			a = Vehicle_status_device[i+8];
			a = Vehicle_status_device[i+9];
		}
		for(;i<arraysize;i++){
			a = Vehicle_status_device[i];
		}
	}
}

void write_Vehicle_status_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(Vehicle_status_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			Vehicle_status_device[i]   = 0xAFFE;
			Vehicle_status_device[i+1] = 0xAFFE;
			Vehicle_status_device[i+2] = 0xAFFE;
			Vehicle_status_device[i+3] = 0xAFFE;
			Vehicle_status_device[i+4] = 0xAFFE;
			Vehicle_status_device[i+5] = 0xAFFE;
			Vehicle_status_device[i+6] = 0xAFFE;
			Vehicle_status_device[i+7] = 0xAFFE;
			Vehicle_status_device[i+8] = 0xAFFE;
			Vehicle_status_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				Vehicle_status_device[i]=0xAFFE;
		}
	}
}

int x_car_device[250];	

static bool isIinitialized_x_car_device = false;
void initialize_x_car_device() {
	if (!isIinitialized_x_car_device){
		for (int i=0; i < 250; i++){
			x_car_device[i] = i+1;
		}
		isIinitialized_x_car_device = true;
	}
}


void read_x_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(x_car_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = x_car_device[i];
			a = x_car_device[i+1];
			a = x_car_device[i+2];
			a = x_car_device[i+3];
			a = x_car_device[i+4];
			a = x_car_device[i+5];
			a = x_car_device[i+6];
			a = x_car_device[i+7];
			a = x_car_device[i+8];
			a = x_car_device[i+9];
		}
		for(;i<arraysize;i++){
			a = x_car_device[i];
		}
	}
}

void write_x_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(x_car_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			x_car_device[i]   = 0xAFFE;
			x_car_device[i+1] = 0xAFFE;
			x_car_device[i+2] = 0xAFFE;
			x_car_device[i+3] = 0xAFFE;
			x_car_device[i+4] = 0xAFFE;
			x_car_device[i+5] = 0xAFFE;
			x_car_device[i+6] = 0xAFFE;
			x_car_device[i+7] = 0xAFFE;
			x_car_device[i+8] = 0xAFFE;
			x_car_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				x_car_device[i]=0xAFFE;
		}
	}
}

int y_car_device[250];	

static bool isIinitialized_y_car_device = false;
void initialize_y_car_device() {
	if (!isIinitialized_y_car_device){
		for (int i=0; i < 250; i++){
			y_car_device[i] = i+1;
		}
		isIinitialized_y_car_device = true;
	}
}


void read_y_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(y_car_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = y_car_device[i];
			a = y_car_device[i+1];
			a = y_car_device[i+2];
			a = y_car_device[i+3];
			a = y_car_device[i+4];
			a = y_car_device[i+5];
			a = y_car_device[i+6];
			a = y_car_device[i+7];
			a = y_car_device[i+8];
			a = y_car_device[i+9];
		}
		for(;i<arraysize;i++){
			a = y_car_device[i];
		}
	}
}

void write_y_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(y_car_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			y_car_device[i]   = 0xAFFE;
			y_car_device[i+1] = 0xAFFE;
			y_car_device[i+2] = 0xAFFE;
			y_car_device[i+3] = 0xAFFE;
			y_car_device[i+4] = 0xAFFE;
			y_car_device[i+5] = 0xAFFE;
			y_car_device[i+6] = 0xAFFE;
			y_car_device[i+7] = 0xAFFE;
			y_car_device[i+8] = 0xAFFE;
			y_car_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				y_car_device[i]=0xAFFE;
		}
	}
}

int yaw_car_device[250];	

static bool isIinitialized_yaw_car_device = false;
void initialize_yaw_car_device() {
	if (!isIinitialized_yaw_car_device){
		for (int i=0; i < 250; i++){
			yaw_car_device[i] = i+1;
		}
		isIinitialized_yaw_car_device = true;
	}
}


void read_yaw_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_car_device) / 4;
		
		//printf("number of bytes:%d\n",arraysize);
		int leftOverElements=arraysize%10;
		
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		int i = 0;
		int a = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {           //iteration with 10 reads
			a = yaw_car_device[i];
			a = yaw_car_device[i+1];
			a = yaw_car_device[i+2];
			a = yaw_car_device[i+3];
			a = yaw_car_device[i+4];
			a = yaw_car_device[i+5];
			a = yaw_car_device[i+6];
			a = yaw_car_device[i+7];
			a = yaw_car_device[i+8];
			a = yaw_car_device[i+9];
		}
		for(;i<arraysize;i++){
			a = yaw_car_device[i];
		}
	}
}

void write_yaw_car_device(int labelAccessStatistics) {
	int numberOfBytes = 1000;
	for (int repeat = 0 ; repeat < labelAccessStatistics; repeat++){
		if(numberOfBytes < 4){
			numberOfBytes = 4;
		}
		int arraysize = sizeof(yaw_car_device) / 4;
		int leftOverElements=arraysize%10;
		int arraySizeWith10Multiples=arraysize-leftOverElements;
		
		int i = 0;
		for (i = 0; i < arraySizeWith10Multiples; i = i + 10) {
			yaw_car_device[i]   = 0xAFFE;
			yaw_car_device[i+1] = 0xAFFE;
			yaw_car_device[i+2] = 0xAFFE;
			yaw_car_device[i+3] = 0xAFFE;
			yaw_car_device[i+4] = 0xAFFE;
			yaw_car_device[i+5] = 0xAFFE;
			yaw_car_device[i+6] = 0xAFFE;
			yaw_car_device[i+7] = 0xAFFE;
			yaw_car_device[i+8] = 0xAFFE;
			yaw_car_device[i+9] = 0xAFFE;
		}
		for(;i<arraysize;i++){
				yaw_car_device[i]=0xAFFE;
		}
	}
}

