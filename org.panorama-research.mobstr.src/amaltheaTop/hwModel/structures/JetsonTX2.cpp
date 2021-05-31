// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/structures/JetsonTX2.h"
#include "amaltheaTop/hwModel/structures/GPU island.h"
#include "amaltheaTop/hwModel/structures/ARM island.h"
#include "amaltheaTop/hwModel/structures/Denver island.h"
#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"
#include "amaltheaTop/hwModel/modules/Intercon.h"


std::shared_ptr<HwStructure> JetsonTX2 = nullptr;


//for usage on hw model top level (eg. in flat hierarchies)
std::shared_ptr<HwStructure> get_HwStructure_JetsonTX2() {
	if (JetsonTX2 == nullptr) {
		//initialize
		JetsonTX2 = std::make_shared<HwStructure>("JetsonTX2");
				//Sub-Structures
			get_HwStructure_GPU island();
			get_HwStructure_ARM island();
			get_HwStructure_Denver island();
		//Sub-Modules
		get_SYSTEM_DRAM();
		get_Intercon();
		//HW Ports	
		//Connections (Deferred Bindings of delegate ports)
	}
	return JetsonTX2;
}
