# Install Eclipse Capra manually

Use the following instructions to try out the TIM:  

1. **Install Eclipse Capra**: 
  * Download Eclipse Capra development environment using instructions provided [here](https://wiki.eclipse.org/Capra#Using_the_Eclipse_Installer). The recommended version of Eclipse Capra to use is 0.8.2. If you would like to use a stable codebase, please checkout the corresponding `0.8.2` tag. Using the `develop` branch is also possible, but changes there can lead to incompatibilites that need to be resolved manually.
  * Optional: At the time of writing, the Eclipse Installer does not allow selecting a target platform for Eclipse Capra that uses the latest versions of Eclipse (2021-03 and 2021-06). However, it is possible to set these target platforms, once the installer has completed. To do this, open the files `eclipse-capra-e4.19.target` (for Eclipse 2021-03) or `eclipse-capra-e4.20.target` (for Eclipse 2021-06) in the `org.eclipse.capra.releng.target` project and click on "Set as Active Target Platform".
2. **Get the ODE meta-model dependencies**: Use the "Install new Software" feature to install the ODE meta-model and editors using the ODE update site at: https://digital-dependability-identities.github.io/ODE_Editor/
3. **Import the TIM project**
  * Clone this GitHub project.
  * Close the project `org.eclipse.capra.generic.tracemodel`
  * Import the project `org.panorama-research.mobstr.tim` into your workspace.
  * Make sure that all the projects have no errors. Some of Eclipse Capra's test projects might show compilation errors due to the missing `org.eclipse.capra.generic.tracemodel` project. You can either ignore these or close the test projects.