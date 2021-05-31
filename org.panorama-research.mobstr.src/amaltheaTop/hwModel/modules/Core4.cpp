// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core4.h"
#include "amaltheaTop/hwModel/structures/ARM island.h"

#include "amaltheaTop/hwModel/domains/A57_Domain.h"
#include "amaltheaTop/hwModel/definitions/A57.h"
#include "amaltheaTop/hwModel/hwAccessElements/C4toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core4 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core4(){
	if (Core4==NULL){
		Core4 = get_HwStructure_ARM island()->createModule<ProcessingUnit>("Core4", *get_ProcessingUnitDefinition_A57());
		Core4->clock_period= get_FrequencyDomain_A57_Domain();
		//ports & connections
		//HW Ports	
		Core4->addInitPort("P1");
		//Connections
		//access elements
		Core4->addHWAccessElement(get_HwStructure_C4toDRAM());
	}
	return Core4;
}

