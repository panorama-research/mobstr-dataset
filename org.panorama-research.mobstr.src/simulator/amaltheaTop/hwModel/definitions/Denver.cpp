// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/hwModel/definitions/Denver.h"	

ProcessingUnitDefinition* Denver = NULL;
ProcessingUnitDefinition* get_ProcessingUnitDefinition_Denver(){
	if (Denver==NULL){
		Denver = new ProcessingUnitDefinition("Denver");
	}
	return Denver;
}
