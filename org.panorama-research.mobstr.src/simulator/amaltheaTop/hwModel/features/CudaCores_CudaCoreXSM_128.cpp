// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/features/CudaCores_CudaCoreXSM_128.h"
	
HwFeature*  CudaCores_CudaCoreXSM_128 = nullptr;
HwFeature* get_HwFeature_CudaCores_CudaCoreXSM_128(){
	if (CudaCores_CudaCoreXSM_128==NULL){
		CudaCores_CudaCoreXSM_128 = new HwFeature("CudaCoreXSM_128", 128.0);
	}
	return CudaCores_CudaCoreXSM_128;
}
