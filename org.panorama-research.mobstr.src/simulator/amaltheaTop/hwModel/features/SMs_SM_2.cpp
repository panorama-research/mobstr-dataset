// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/features/SMs_SM_2.h"
	
HwFeature*  SMs_SM_2 = nullptr;
HwFeature* get_HwFeature_SMs_SM_2(){
	if (SMs_SM_2==NULL){
		SMs_SM_2 = new HwFeature("SM_2", 2.0);
	}
	return SMs_SM_2;
}
