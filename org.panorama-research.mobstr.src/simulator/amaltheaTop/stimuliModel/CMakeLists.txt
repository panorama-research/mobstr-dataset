# CMakeList.txt: CMake project for StimuliModel of "WATERS-2019_FMTV-Model".
						
				
# Add sources of Stimuli
target_sources (WATERS-2019_FMTV-Model  PRIVATE
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_100ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_10ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_15ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_200ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_33ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_400ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_5ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/periodic_66ms.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/Lane_detection_stim.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/Localization_stim.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/SFM_stim.cpp" 
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/detection_stim.cpp" 
	
	"${PROJECT_SOURCE_DIR}/amaltheaTop/stimuliModel/stimuliModel.cpp")
