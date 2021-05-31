// This code was generated for simulation with app4mc.sim

#include "amaltheaTop/stimuliModel/stimuliModel.h"
#include "APP4MCsim.h"

//include model elements»
#include "amaltheaTop/stimuliModel/periodic_100ms.h"
#include "amaltheaTop/stimuliModel/periodic_10ms.h"
#include "amaltheaTop/stimuliModel/periodic_15ms.h"
#include "amaltheaTop/stimuliModel/periodic_200ms.h"
#include "amaltheaTop/stimuliModel/periodic_33ms.h"
#include "amaltheaTop/stimuliModel/periodic_400ms.h"
#include "amaltheaTop/stimuliModel/periodic_5ms.h"
#include "amaltheaTop/stimuliModel/periodic_66ms.h"
#include "amaltheaTop/stimuliModel/Lane_detection_stim.h"
#include "amaltheaTop/stimuliModel/Localization_stim.h"
#include "amaltheaTop/stimuliModel/SFM_stim.h"
#include "amaltheaTop/stimuliModel/detection_stim.h"

/* Software */
void init_stimuliModel(){		
	get_periodic_100ms();
	get_periodic_10ms();
	get_periodic_15ms();
	get_periodic_200ms();
	get_periodic_33ms();
	get_periodic_400ms();
	get_periodic_5ms();
	get_periodic_66ms();
	get_Lane_detection_stim();
	get_Localization_stim();
	get_SFM_stim();
	get_detection_stim();
}
