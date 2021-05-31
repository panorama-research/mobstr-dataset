// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/definitions/GPU_def.h"	
#include "amaltheaTop/hwModel/features/CudaCores_CudaCoreXSM_128.h"
#include "amaltheaTop/hwModel/features/SMs_SM_2.h"

ProcessingUnitDefinition* GPU_def = NULL;
ProcessingUnitDefinition* get_ProcessingUnitDefinition_GPU_def(){
	if (GPU_def==NULL){
		GPU_def = new ProcessingUnitDefinition("GPU_def");
		GPU_def->addFeature(*get_HwFeature_CudaCores_CudaCoreXSM_128());
		GPU_def->addFeature(*get_HwFeature_SMs_SM_2());
	}
	return GPU_def;
}
