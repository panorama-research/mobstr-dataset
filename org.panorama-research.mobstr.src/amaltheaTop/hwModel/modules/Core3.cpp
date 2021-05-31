// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core3.h"
#include "amaltheaTop/hwModel/structures/ARM island.h"

#include "amaltheaTop/hwModel/domains/A57_Domain.h"
#include "amaltheaTop/hwModel/definitions/A57.h"
#include "amaltheaTop/hwModel/hwAccessElements/C3toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core3 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core3(){
	if (Core3==NULL){
		Core3 = get_HwStructure_ARM island()->createModule<ProcessingUnit>("Core3", *get_ProcessingUnitDefinition_A57());
		Core3->clock_period= get_FrequencyDomain_A57_Domain();
		//ports & connections
		//HW Ports	
		Core3->addInitPort("P1");
		//Connections
		//access elements
		Core3->addHWAccessElement(get_HwStructure_C3toDRAM());
	}
	return Core3;
}

