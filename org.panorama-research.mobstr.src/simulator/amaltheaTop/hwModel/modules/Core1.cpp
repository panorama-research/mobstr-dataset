// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core1.h"
#include "amaltheaTop/hwModel/structures/Denver island.h"

#include "amaltheaTop/hwModel/domains/Denver_Domain.h"
#include "amaltheaTop/hwModel/definitions/Denver.h"
#include "amaltheaTop/hwModel/hwAccessElements/C1toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core1 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core1(){
	if (Core1==NULL){
		Core1 = get_HwStructure_Denver island()->createModule<ProcessingUnit>("Core1", *get_ProcessingUnitDefinition_Denver());
		Core1->clock_period= get_FrequencyDomain_Denver_Domain();
		//ports & connections
		//HW Ports	
		Core1->addInitPort("P1");
		//Connections
		//access elements
		Core1->addHWAccessElement(get_HwStructure_C1toDRAM());
	}
	return Core1;
}

