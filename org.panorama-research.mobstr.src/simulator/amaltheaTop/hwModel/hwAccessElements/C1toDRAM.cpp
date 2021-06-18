// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/hwAccessElements/C1toDRAM.h"	
//include path elementss
#include "amaltheaTop/hwModel/modules/Core1.h"
#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"

/* HwAccessWlement not contained in structure, eg. in flat hardware model */
HwAccessElement get_HwStructure_C1toDRAM(){
	//utilize RTO here
	HwAccessElement returnVal;
	returnVal.setReadLatency(DiscreteValueConstant(16));
	returnVal.setWriteLatency(DiscreteValueConstant(16));
	
	
	
	//set source
	returnVal.source = get_Core1();
	
	//set destination
	returnVal.dest = get_SYSTEM_DRAM();
		
	return returnVal;
}
