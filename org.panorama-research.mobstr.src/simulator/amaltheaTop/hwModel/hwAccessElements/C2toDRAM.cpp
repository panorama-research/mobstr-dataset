// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/hwAccessElements/C2toDRAM.h"	
//include path elementss
#include "amaltheaTop/hwModel/modules/Core2.h"
#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"

/* HwAccessWlement not contained in structure, eg. in flat hardware model */
HwAccessElement get_HwStructure_C2toDRAM(){
	//utilize RTO here
	HwAccessElement returnVal;
	returnVal.setReadLatency(DiscreteValueConstant(40));
	returnVal.setWriteLatency(DiscreteValueConstant(40));
	
	
	
	//set source
	returnVal.source = get_Core2();
	
	//set destination
	returnVal.dest = get_SYSTEM_DRAM();
		
	return returnVal;
}
