// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/SFM_Preprocessing.h"	
#include "amaltheaTop/swModel/labels/Image_SFM_host_type_Label.h"

std::shared_ptr<Runnable> SFM_Preprocessing = nullptr;

std::shared_ptr<Runnable>  get_SFM_Preprocessing() {

	if (SFM_Preprocessing == nullptr) {
		//initialize
		SFM_Preprocessing = std::make_shared<Runnable>("SFM_Preprocessing");
		SFM_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_SFM_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		SFM_Preprocessing->addActivityGraphItem<Ticks>({});
		SFM_Preprocessing->addActivityGraphItem<LabelAccess>({get_Image_SFM_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return SFM_Preprocessing;
}

