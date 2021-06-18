# CMakeList.txt: CMake project for HwModel of "WATERS-2019_FMTV-Model".
		

# Add sources of HwModel
target_sources (WATERS-2019_FMTV-Model  PRIVATE

#features 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/features/CudaCores_CudaCoreXSM_128.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/features/SMs_SM_2.cpp" 

#definitions
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/definitions/A57.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/definitions/Denver.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/definitions/GPU_def.cpp" 

#domains	
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/domains/A57_Domain.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/domains/DRAM_eff_Freq.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/domains/Denver_Domain.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/domains/GPU_Domain.cpp" 

#hw structure
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/structures/ARM island.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/structures/Denver island.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/structures/GPU island.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/structures/JetsonTX2.cpp" 

# modules
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/SYSTEM_DRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core0.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core1.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core2.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core3.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core4.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Core5.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/GP10B.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/modules/Intercon.cpp" 

#connections

#HW access elements
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C0toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C1toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C2toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C3toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C4toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/C5toDRAM.cpp" 
"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwAccessElements/GPUtoDRAM.cpp" 

"${PROJECT_SOURCE_DIR}/amaltheaTop/hwModel/hwModel.cpp")

