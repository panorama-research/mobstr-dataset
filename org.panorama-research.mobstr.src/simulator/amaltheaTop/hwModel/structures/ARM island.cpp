// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/structures/ARM island.h"
#include "amaltheaTop/hwModel/structures/JetsonTX2.h"
#include "amaltheaTop/hwModel/modules/Core2.h"
#include "amaltheaTop/hwModel/modules/Core3.h"
#include "amaltheaTop/hwModel/modules/Core4.h"
#include "amaltheaTop/hwModel/modules/Core5.h"
#include "Transformation of Cache transformation not yet implemented.h"


std::shared_ptr<HwStructure> ARM island = nullptr;
//for usage in structures
std::shared_ptr<HwStructure> get_HwStructure_ARM island() {
	if (ARM island == nullptr) {
		//initialize
		ARM island = get_HwStructure_JetsonTX2()->createSubStructure("ARM island");
				//Sub-Structures
		//Sub-Modules
		get_Core2();
		get_Core3();
		get_Core4();
		get_Core5();
		Transformation of Cache transformation not yet implemented();
		//HW Ports	
		//Connections (Deferred Bindings of delegate ports)
	}
	return ARM island;
}
