// This code was generated for simulation with app4mc.sim

#include "APP4MCsim.h"
#include "Tracer/Tracer.h"
#include "Tracer/BTFTracer.h"

#include "amaltheaTop/amalthea.h"
//include model elements
#include "amaltheaTop/swModel/swModel.h"
#include "amaltheaTop/hwModel/hwModel.h"
#include "amaltheaTop/osModel/osModel_.h"
#include "amaltheaTop/mappingModel/mappingModel.h"
#include "amaltheaTop/eventModel/eventModel.h"
#include "amaltheaTop/stimuliModel/stimuliModel.h"


//include processing units and memories for tracing -----
#include "amaltheaTop/hwModel/modules/Core5.h"
#include "amaltheaTop/hwModel/modules/Core2.h"
#include "amaltheaTop/hwModel/modules/GP10B.h"
#include "amaltheaTop/hwModel/modules/Core0.h"
#include "amaltheaTop/hwModel/modules/Core4.h"
#include "amaltheaTop/hwModel/modules/Core3.h"
#include "amaltheaTop/hwModel/modules/Core1.h"
#include "amaltheaTop/hwModel/modules/SYSTEM_DRAM.h"
// tracing includes -----------------

INITIALIZE_EASYLOGGINGPP;

int sc_main(int argc, char *argv[]) {
	//static code ----------------------
	START_EASYLOGGINGPP(argc, argv);
	sc_core::sc_set_time_resolution(1.0,sc_core::SC_NS);
	//end static code ------------------
	
	/* Software */
	init_swModel();
	/* Hardware */
	init_hwModel();
	/* OS */
	init_osModel();
	/* Mapping */
	init_mappingModel();
	/* Event */
	init_eventModel();
	/* Stimuli */
	init_stimuliModel();
	
	auto tracer = std::make_shared<BtfTracer>();
	TraceManager::setTracer(tracer);
	
//static code ----------------------
	sc_core::sc_trace_file *tf = sc_core::sc_create_vcd_trace_file("trace");
	
	//trace processing units and memories -----
	sc_trace(tf, &*get_Core5(), "amaltheaTop_hwModel_modules_Core5");
	sc_trace(tf, &*get_Core2(), "amaltheaTop_hwModel_modules_Core2");
	sc_trace(tf, &*get_GP10B(), "amaltheaTop_hwModel_modules_GP10B");
	sc_trace(tf, &*get_Core0(), "amaltheaTop_hwModel_modules_Core0");
	sc_trace(tf, &*get_Core4(), "amaltheaTop_hwModel_modules_Core4");
	sc_trace(tf, &*get_Core3(), "amaltheaTop_hwModel_modules_Core3");
	sc_trace(tf, &*get_Core1(), "amaltheaTop_hwModel_modules_Core1");
	sc_trace(tf, &*get_SYSTEM_DRAM(), "amaltheaTop_hwModel_modules_SYSTEM_DRAM");
	
	//run simulation
	try {
		sc_core::sc_start(1000, sc_core::SC_MS);
	}
	catch (sc_core::sc_report e) {
		const char* file = e.get_file_name();
		const int line = e.get_line_number();
		const char* msg = e.get_msg();
		VLOG(0) << msg << "\nin file: " << file << "\nline: " << line;
		return -1;
	}

	sc_core::sc_close_vcd_trace_file(tf);

	VLOG(0) << " done ";
	return 0;
}
