// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/hwModel.h"	

/* Hardware */
void init_hwModel(){
	get_HwStructure_ARM island();
	get_HwStructure_Denver island();
	get_HwStructure_GPU island();
	get_HwStructure_JetsonTX2();
}
