# The MobSTr dataset: *Mo*del-*B*ased *S*afety Assurance and *Tr*aceability
Provided by the [PANORAMA Research Project][2].

This repository contains artifacts such as requirements and architecture models for the MobSTr dataset, based on the [WATERS FMTV 2019 challenge][1]. The MobSTr dataset provides a number of artifacts and traceability links for use in demonstrating model-based safety assurance and traceability.

The WATERS FMTV 2019 challenge is an industrial case study used as part of the 10th International Workshop on Analysis Tools and Methodologies for Embedded and Real-time Systems (WATERS). It was originally proposed by Arne Hamann, Dakshina Dasari, and Falk Wurst, Corporate Research Robert Bosch GmbH and Ignacio Sañudo, Nicola Capodieci, Paolo Burgio and Marko Bertogna, University of Modena and Reggio Emilia. 

The artifacts in this repository are based on the challenge description and are provided by the [PANORAMA research project][2], specifically by the [contributors][7]. The corresponding AMALTHEA model for the challenge is included here. The original file can be found in the [Eclipse APP4MC Github Repository][4].

The system described in the WATERS FMTV 2019 challenge and consequently in the MobSTr dataset is an automated driving system that includes lane following and routing features. The original challenge definition was used as a starting point, but refinements have been applied when necessary. We make no claim on the completeness or correctness of any of the artifacts available for download here.


## Included Artifacts

| *Artifact* | *Description* |
|----|----|
| org.panorama-research.mobstr.amalthea | The AMALTHEA model of the WATERS FMTV 2019 Challenge. You will need [Eclipse APP4MC][3] to open the model. |
| org.panorama-research.mobstr.architecture | A UML model of the components of the system. You will need [Eclipse Papyrus][8] to open the model. |
| org.panorama-research.mobstr.artifacts | A UML model of the artifacts that are part of this dataset. This information model is used as the foundation for the TIM. You will need [Eclipse Papyrus][8] to open the model. |
| org.panorama-research.mobstr.assumptions | An Excel spreadsheet with additional assumptions. |
| org.panorama-research.mobstr.fmea | An [ODE model][6] containing the results of a Failure Mode and Effects Analysis performed for the system. |
| org.panorama-research.mobstr.fta | An [ODE model][6] containing a component fault tree and exemplary fault trees for all identified hazards. |
| org.panorama-research.mobstr.hazards | An Excel spreadsheet with the identified hazards of the system. |
| org.panorama-research.mobstr.requirements | An Excel spreadsheet with the requirements of the system, including safety requirements. |
| org.panorama-research.mobstr.safetycase |  An [ODE model][6] containing the safety case for the system. |
| org.panorama-research.mobstr.src |  Source code generated out of the Amalthea model. Part of the code is in SystemC, part of it (`synthetic_gen`) is for the Linux platform. The code is not compilable or executable on its own at this point.|
| org.panorama-research.mobstr.tim | An Eclipse plugin project containing the implementation of the traceability information model (TIM) for Eclipse Capra (see below). |
| org.panorama-research.mobstr.tim.test | An Eclipse test plugin with test cases for the TIM implementation. |
| __WorkspaceTraceModels | The traceability links between the different artifacts conforming to the TIM. Please note that the links are partial, i.e., not all artifacts that should be linked are currently connected by a trace link. |
| WATERS_Industrial_Challenge_2019_final.pdf | The original WATERS FMTV 2019 Challenge description on which the artifacts in this repository are based. |

## The MobSTr TIM

The MobSTr dataset comes with its own custom traceability information model (TIM). The TIM has been designed to fulfill the needs of an organisation that develops a safety-critical product. Therefore, the trace link types, the directionality of the trace link types, and the artifacts they connect are based on the goal to allow constructing a safety case from the existing artifacts as easily as possible and to trace all required evidence from the safety case. In particular, the trace link types are informed by the traceability described in ISO 26262.

Each combination of artifacts that needs to be traced has a unique trace link type which also carries a unique name that reflects its semantics. All trace link types are shown in the figure below. Please note that the cardinalities in the figure differ from the cardinalities that are implemented in the custom TIM (see below). The reason is that while it might make sense that not all hazards are assigned to a safety goal on the global level (e.g., while hazards are developed and refined and safety goals have not yet been updated), no trace links would exist in such cases.

![The information model for the MobSTr dataset](org.panorama-research.mobstr.artifacts/mobstr-tim.png)

## How to Use the Custom TIM

The repository contains a custom traceability information model (TIM) that defines which link types can be created between the different artifacts. The current TIM is based on the artifact model in project `org.panorama-research.mobstr.artifacts` and is implemented for use in [Eclipse Capra](https://eclipse.org/capra). The TIM project is located in `org.panorama-research.mobstr.tim`.

Use the following instructions to try out the TIM:  

1. **Install Eclipse Capra**: 
  * Download Eclipse Capra development environment using instructions provided [here](https://wiki.eclipse.org/Capra#Using_the_Eclipse_Installer). The recommended version of Eclipse Capra to use is 0.8.2. If you would like to use a stable codebase, please checkout the corresponding `0.8.2` tag. Using the `develop` branch is also possible, but changes there can lead to incompatibilites that need to be resolved manually.
  * Optional: At the time of writing, the Eclipse Installer does not allow selecting a target platform for Eclipse Capra that uses the latest versions of Eclipse (2021-03 and 2021-06). However, it is possible to set these target platforms, once the installer has completed. To do this, open the files `eclipse-capra-e4.19.target` (for Eclipse 2021-03) or `eclipse-capra-e4.20.target` (for Eclipse 2021-06) in the `org.eclipse.capra.releng.target` project and click on "Set as Active Target Platform".
2. **Install the "UML2 Extender SDK**
  * In your brand new Eclipse installation, go to Help->Install new Software.
  * Under "Work with", select the release update site (should have a URL like `http://download.eclipse.org/releases/2021-03`).
  * Select the "UML2 Extender SDK" from the available software.
  * Click "Next" as many times as necessary to finish the installation.
  * Restart Eclipse.
3. **Get the ODE meta-model dependencies**: Use the "Install new Software" feature to install the ODE meta-model and editors using the ODE update site at: https://digital-dependability-identities.github.io/ODE_Editor/
4. **Import the TIM project**
  * Clone this GitHub project.
  * Close the project `org.eclipse.capra.generic.tracemodel`
  * Import the project `org.panorama-research.mobstr.tim` into your workspace.
  * Make sure that all the projects have no errors. Some of Eclipse Capra's test projects might show compilation errors due to the missing `org.eclipse.capra.generic.tracemodel` project. You can either ignore these or close the test projects.
5. **Create a new run configuration**
  * Click on Run --> Run Configurations and create a new Eclipse Application Configuration
  * Select a new folder as the workspace for your Eclipse application
  * Click "Apply", then "Run"
  * Depending on your chosen Eclipse version and target platform, you might see a warning about a dependency to `http-client`. This message can be safely ignored.
6. **Import the MobSTr projects into the runtime Eclipse workspace**
  * Once the new workspace opens, import the projects in this repository (apart from `org.panorama-research.mobstr.tim` and `org.panorama-research.mobstr.tim.test`). 
  * Go to Window --> Perspectives and switch to the Capra perspective
  * Go to the Eclipse preferences, open the "Capra Traceability" tree and select "Office Documents". Select "Use this column as the ID" and make sure the column is "A". The MobSTr dataset uses the first column in Excel files to  identify requirements and hazards.
7. **Start creating and using traceability links**: Follow [this video](https://www.youtube.com/watch?v=XRtLs5OT_yM&feature=youtu.be) to create and visualize traceability links.

In case you get an error that the wrong APP4MC version is installed, please open `waters-challenge-2019.amxmi` in a text editor and change the model version to the APP4MC version you have installed (usually either 0.9.7 or 1.0.0, depending on the version of Eclipse that you are using and thus the target platform chosen for Eclipse Capra).


## License and Copyright

All artifacts provided here are under [Eclipse Public License v2.0][5]. Copyright 2020, 2021 by [contributors](CONTRIBUTORS).

[1]: https://www.ecrts.org/archives/fileadmin/WebsitesArchiv/ecrts2019/waters/waters-industrial-challenge/index.html
[2]: https://panorama-research.org/
[3]: https://www.eclipse.org/app4mc/
[4]: https://git.eclipse.org/c/app4mc/org.eclipse.app4mc.examples.git/tree/WATERS-FMTV-challenges
[5]: https://www.eclipse.org/legal/epl-2.0/
[6]: https://github.com/Digital-Dependability-Identities
[7]: CONTRIBUTORS
[8]: https://www.eclipse.org/papyrus/
[9]: https://github.com/Digital-Dependability-Identities/ODE_Editor
