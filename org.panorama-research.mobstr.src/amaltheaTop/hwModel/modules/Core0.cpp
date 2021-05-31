// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core0.h"
#include "amaltheaTop/hwModel/structures/Denver island.h"

#include "amaltheaTop/hwModel/domains/Denver_Domain.h"
#include "amaltheaTop/hwModel/definitions/Denver.h"
#include "amaltheaTop/hwModel/hwAccessElements/C0toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core0 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core0(){
	if (Core0==NULL){
		Core0 = get_HwStructure_Denver island()->createModule<ProcessingUnit>("Core0", *get_ProcessingUnitDefinition_Denver());
		Core0->clock_period= get_FrequencyDomain_Denver_Domain();
		//ports & connections
		//HW Ports	
		Core0->addInitPort("P1");
		//Connections
		//access elements
		Core0->addHWAccessElement(get_HwStructure_C0toDRAM());
	}
	return Core0;
}

