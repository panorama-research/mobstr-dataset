# CMakeList.txt: Top level CMake project file.
# Perform a global configuration and include subprojects.
#
# need 3.12, otherwise OBJECT library app4mc.sim.lib is not working as expected
cmake_minimum_required (VERSION 3.12)

project (WATERS-2019_FMTV-Model)

# leave redundant settings below in place (visual studio seems to default to c++ 11 if statements below are missing)
set (CMAKE_CXX_STANDARD 17 CACHE STRING
     "C++ standard to build all targets.")
set (CMAKE_CXX_STANDARD_REQUIRED ON CACHE BOOL
     "The with CMAKE_CXX_STANDARD selected C++ standard is a requirement.")
mark_as_advanced (CMAKE_CXX_STANDARD_REQUIRED)

set(APP4MCSIM_LOC ./ CACHE PATH "Path for App4mc.sim library")
set(MODEL_WORKING_DIR "." CACHE PATH "Working directory for build system based execution")

# include subprojects
add_subdirectory (${APP4MCSIM_LOC} "./app4mc.sim")
add_subdirectory(./amaltheaTop)
