// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/hwAccessElements/GPUtoDRAM.h"	
//include path elementss
#include "amaltheaTop/hwModel/modules/GP10B.h"
#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"

/* HwAccessWlement not contained in structure, eg. in flat hardware model */
HwAccessElement get_HwStructure_GPUtoDRAM(){
	//utilize RTO here
	HwAccessElement returnVal;
	returnVal.setReadLatency(DiscreteValueConstant(5));
	returnVal.setWriteLatency(DiscreteValueConstant(5));
	returnVal.setDataRate({160, DataRateUnit::GbitPerSecond});
	
	
	
	//set source
	returnVal.source = get_GP10B();
	
	//set destination
	returnVal.dest = get_SYSTEM_DRAM();
		
	return returnVal;
}
