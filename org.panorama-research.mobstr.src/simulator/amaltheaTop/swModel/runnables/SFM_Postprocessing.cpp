// This code was generated for simulation with app4mc.sim

#include <systemc>
#include "APP4MCsim.h"
#include "amaltheaTop/swModel/runnables/SFM_Postprocessing.h"	
#include "amaltheaTop/swModel/labels/Matrix_SFM_host_type_Label.h"
#include "amaltheaTop/swModel/labels/Image_SFM_host_type_Label.h"

std::shared_ptr<Runnable> SFM_Postprocessing = nullptr;

std::shared_ptr<Runnable>  get_SFM_Postprocessing() {

	if (SFM_Postprocessing == nullptr) {
		//initialize
		SFM_Postprocessing = std::make_shared<Runnable>("SFM_Postprocessing");
		SFM_Postprocessing->addActivityGraphItem<LabelAccess>({get_Matrix_SFM_host_type_Label(), 1, tlm::TLM_READ_COMMAND});
		SFM_Postprocessing->addActivityGraphItem<Ticks>({});
		SFM_Postprocessing->addActivityGraphItem<LabelAccess>({get_Image_SFM_host_type_Label(), 1, tlm::TLM_WRITE_COMMAND});
	}
	return SFM_Postprocessing;
}

