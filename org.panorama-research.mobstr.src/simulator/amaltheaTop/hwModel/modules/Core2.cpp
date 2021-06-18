// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core2.h"
#include "amaltheaTop/hwModel/structures/ARM island.h"

#include "amaltheaTop/hwModel/domains/A57_Domain.h"
#include "amaltheaTop/hwModel/definitions/A57.h"
#include "amaltheaTop/hwModel/hwAccessElements/C2toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core2 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core2(){
	if (Core2==NULL){
		Core2 = get_HwStructure_ARM island()->createModule<ProcessingUnit>("Core2", *get_ProcessingUnitDefinition_A57());
		Core2->clock_period= get_FrequencyDomain_A57_Domain();
		//ports & connections
		//HW Ports	
		Core2->addInitPort("P1");
		//Connections
		//access elements
		Core2->addHWAccessElement(get_HwStructure_C2toDRAM());
	}
	return Core2;
}

