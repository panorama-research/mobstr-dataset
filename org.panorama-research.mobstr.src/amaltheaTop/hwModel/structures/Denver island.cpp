// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/structures/Denver island.h"
#include "amaltheaTop/hwModel/structures/JetsonTX2.h"
#include "amaltheaTop/hwModel/modules/Core0.h"
#include "amaltheaTop/hwModel/modules/Core1.h"
#include "Transformation of Cache transformation not yet implemented.h"


std::shared_ptr<HwStructure> Denver island = nullptr;
//for usage in structures
std::shared_ptr<HwStructure> get_HwStructure_Denver island() {
	if (Denver island == nullptr) {
		//initialize
		Denver island = get_HwStructure_JetsonTX2()->createSubStructure("Denver island");
				//Sub-Structures
		//Sub-Modules
		get_Core0();
		get_Core1();
		Transformation of Cache transformation not yet implemented();
		//HW Ports	
		//Connections (Deferred Bindings of delegate ports)
	}
	return Denver island;
}
