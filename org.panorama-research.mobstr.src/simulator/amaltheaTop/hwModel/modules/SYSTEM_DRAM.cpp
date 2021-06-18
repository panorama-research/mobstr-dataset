// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"
#include "amaltheaTop/hwModel/structures/JetsonTX2.h"

#include "amaltheaTop/hwModel/domains/DRAM_eff_Freq.h"
//Connections

std::shared_ptr<Memory> SYSTEM_DRAM = nullptr;

//for usage in structures
std::shared_ptr<Memory> get_SYSTEM_DRAM(){
	if (SYSTEM_DRAM==NULL){
		SYSTEM_DRAM = get_HwStructure_JetsonTX2()->createModule<Memory>("SYSTEM_DRAM", 8000000000);
		SYSTEM_DRAM->clock_period= get_FrequencyDomain_DRAM_eff_Freq();
		//HW Ports	
		SYSTEM_DRAM->addTargetPort("Mem_P1");
		//Connections
		SYSTEM_DRAM->setAccessLatency(DiscreteValueConstant(0));
	}
	return SYSTEM_DRAM;
}
