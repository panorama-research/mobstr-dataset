// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/GP10B.h"
#include "amaltheaTop/hwModel/structures/GPU island.h"

#include "amaltheaTop/hwModel/domains/GPU_Domain.h"
#include "amaltheaTop/hwModel/definitions/GPU_def.h"
#include "amaltheaTop/hwModel/hwAccessElements/GPUtoDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> GP10B = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_GP10B(){
	if (GP10B==NULL){
		GP10B = get_HwStructure_GPU island()->createModule<ProcessingUnit>("GP10B", *get_ProcessingUnitDefinition_GPU_def());
		GP10B->clock_period= get_FrequencyDomain_GPU_Domain();
		//ports & connections
		//HW Ports	
		GP10B->addInitPort("P1");
		//Connections
		//access elements
		GP10B->addHWAccessElement(get_HwStructure_GPUtoDRAM());
	}
	return GP10B;
}

