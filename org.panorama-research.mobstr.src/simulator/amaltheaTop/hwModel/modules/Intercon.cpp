// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/modules/Intercon.h"
#include "amaltheaTop/hwModel/structures/JetsonTX2.h"
#include "amaltheaTop/hwModel/domains/DRAM_eff_Freq.h"
//Connections

std::shared_ptr<ConnectionHandler> Intercon = nullptr;

//for usage in structures
std::shared_ptr<ConnectionHandler> get_Intercon(){
	if (Intercon==NULL){
		Intercon = get_HwStructure_JetsonTX2()->createModule<ConnectionHandler>("Intercon");
		//parameters from definition
		//ports
		//HW Ports	
		Intercon->addTargetPort("Inter_P1");
		Intercon->addTargetPort("Inter_P2");
		Intercon->addTargetPort("Inter_P3");
		Intercon->addInitPort("Inter_P4");
		//Connections
		//frequency domain
		Intercon->clock_period= get_FrequencyDomain_DRAM_eff_Freq();
	}
	return Intercon;
}
