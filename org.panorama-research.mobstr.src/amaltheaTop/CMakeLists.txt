include_directories(${PROJECT_SOURCE_DIR})

add_executable (WATERS-2019_FMTV-Model
	"${PROJECT_SOURCE_DIR}/amaltheaTop/amalthea.cpp"
	 )

target_link_libraries(WATERS-2019_FMTV-Model app4mc.sim_lib)
target_include_directories(WATERS-2019_FMTV-Model PUBLIC app4mc.sim_lib)

add_subdirectory ("./hwModel")
add_subdirectory ("./swModel")
add_subdirectory ("./mappingModel") 
add_subdirectory ("./eventModel")
add_subdirectory ("./stimuliModel")
add_subdirectory ("./osModel")


add_custom_target(model_execution 
                COMMAND WATERS-2019_FMTV-Model
                WORKING_DIRECTORY "${MODEL_WORKING_DIR}"
  )
