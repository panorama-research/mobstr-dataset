// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/structures/GPU island.h"
#include "amaltheaTop/hwModel/structures/JetsonTX2.h"
#include "amaltheaTop/hwModel/modules/GP10B.h"
#include "Transformation of Cache transformation not yet implemented.h"


std::shared_ptr<HwStructure> GPU island = nullptr;
//for usage in structures
std::shared_ptr<HwStructure> get_HwStructure_GPU island() {
	if (GPU island == nullptr) {
		//initialize
		GPU island = get_HwStructure_JetsonTX2()->createSubStructure("GPU island");
				//Sub-Structures
		//Sub-Modules
		get_GP10B();
		Transformation of Cache transformation not yet implemented();
		//HW Ports	
		//Connections (Deferred Bindings of delegate ports)
	}
	return GPU island;
}
