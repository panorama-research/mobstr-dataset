# Generated Source Code for the MobSTr dataset

The source code that is part of the MobSTr dataset consists of two parts:

1. Source code for a partial simulator written in SystemC that can be compiled and executed using the app4mc.sim library.
2. Source code for a a Linux executable that provides a synthetic load generator for the model and allows analysing it using the built-in Linux trace functions.

An [advanced simulator](3) that runs on an NVIDIA Jetson TX2 board is also available in a separate repository provided by Dortmund University of Applied Sciences and Arts.

*Important Note*:
Please note that the main purpose of the source code in the MobSTr dataset is *not* to provide a compilable and working working project, but rather to demonstrate how source code can be connected to development artifacts using traceability links. As such, there is no guarantee that the source code is compilable and we cannot provide technical support for any issues regarding the included source code.

## SystemC Simulator

The source code can be found in the `simulator` directory.

The SystemC source code covers most of the Amalthea model, including the hardware model and the software model. However, it does not contain the operating system events, the stimuli, and the user-specific scheduler. This means that the simulator does not include crucial aspects of the model at this point and any simulation results that could be derived from it would not be representative of the final system. 

The source code was generated directly from an updated version of the Amalthea model in the `org.panorama-research.mobstr.amalthea` folder using a [model-to-code transformation](2).

The SystemC source code can be compiled together with [the simulation library](1) and the resulting library can be used for simulations of the model. 

## Linux Synthetic Load Generator

The source code for Linux (in the `linux` sub-folder) should be compilable on any distribution and yield an executable that will generate synthetic loads to analyse the Amalthea model.
The built-in Linux trace functions can be used to check if it behaves as expected. This load generator can also be combined with other programs that emulate other parts of the system to do integration testing.

At this point, the load generator is partial and only works based on ticks and label accesses.
    

    
[1]: https://gitlab.idial.institute/panorama.systemc.group/app4mc.sim
[2]: https://gitlab.idial.institute/panorama.systemc.group/amalthea2systemc.transformation
[3]: https://github.com/anand6105/MBSE