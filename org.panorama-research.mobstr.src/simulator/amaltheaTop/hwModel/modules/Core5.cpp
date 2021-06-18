// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Core5.h"
#include "amaltheaTop/hwModel/structures/ARM island.h"

#include "amaltheaTop/hwModel/domains/A57_Domain.h"
#include "amaltheaTop/hwModel/definitions/A57.h"
#include "amaltheaTop/hwModel/hwAccessElements/C5toDRAM.h"
//Connections

std::shared_ptr<ProcessingUnit> Core5 = nullptr;
//for usage in structures
std::shared_ptr<ProcessingUnit> get_Core5(){
	if (Core5==NULL){
		Core5 = get_HwStructure_ARM island()->createModule<ProcessingUnit>("Core5", *get_ProcessingUnitDefinition_A57());
		Core5->clock_period= get_FrequencyDomain_A57_Domain();
		//ports & connections
		//HW Ports	
		Core5->addInitPort("P1");
		//Connections
		//access elements
		Core5->addHWAccessElement(get_HwStructure_C5toDRAM());
	}
	return Core5;
}

