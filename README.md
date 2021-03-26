# The MobSTr dataset: *Mo*del-*B*ased *S*afety Assurance and *Tr*aceability
Provided by the [PANORAMA Research Project][2].

This repository contains artifacts such as requirements and architecture models for the MobSTr dataset, based on the [WATERS FMTV 2019 challenge][1]. The MobSTr dataset provides a number of artifacts and traceability links for use in demonstrating model-based safety assurance and traceability.

The WATERS FMTV 2019 challenge is an industrial case study used as part of the 10th International Workshop on Analysis Tools and Methodologies for Embedded and Real-time Systems (WATERS). It was originally proposed by Arne Hamann, Dakshina Dasari, and Falk Wurst, Corporate Research Robert Bosch GmbH and Ignacio Sañudo, Nicola Capodieci, Paolo Burgio and Marko Bertogna, University of Modena and Reggio Emilia. 

The artifacts in this repository are based on the challenge description and are provided by the [PANORAMA research project][2], specifically by the [contributors][7]. The corresponding AMALTHEA model for the challenge is included here. The original file can be found in the [Eclipse APP4MC Github Repository][4].

The system described in the WATERS FMTV 2019 challenge and consequently in the MobSTr dataset is an automated driving system that includes lane following and routing features. The original challenge definition was used as a starting point, but refinements have been applied when necessary. We make no claim on the completeness or correctness of any of the artefacts available for download here.

## Included Artifacts

| *Artifact* | *Description* |
|----|----|
| org.panorama-research.mobstr.amalthea | The Amalthea model of the WATERS FMTV 2019 Challenge by the [PANORAMA research project][2]. You will need [Eclipse APP4MC][3] to open the model. |
| org.panorama-research.mobstr.architecture | A UML model of the components of the system. |
| org.panorama-research.mobstr.artifacts | A UML model of the relevant artifacts for the WATERS challenge. This information model is used as the foundation for the TIM. |
| org.panorama-research.mobstr.assumptions | An Excel spreadsheet with additional assumptions. |
| org.panorama-research.mobstr.fmea | An [ODE model][6] containing the Failure Mode and Effects Analysis for the system. | 
| org.panorama-research.mobstr.hazards | An Excel spreadsheet with the identified hazards of the system. |
| org.panorama-research.mobstr.requirements | An Excel spreadsheet with the requirements of the system, including safety requirements. |
| org.panorama-research.mobstr.safetycase |  An [ODE model][6] containing the safety case for the system. |
| org.panorama-research.mobstr.tim | An Eclipse plugin project containing the implementation of the traceability information model (TIM) for Eclipse Capra (see below). |
| org.panorama-research.mobstr.tim.test | An Eclipse test plugin with test cases for the TIM implementation. |
| __WorkspaceTraceModels | The traceability links between the different artifacts conforming to the TIM. Please note that the links are partial, i.e., not all artifacts that should be linked are indeed currently connected by a trace link. |
| WATERS_Industrial_Challenge_2019_final.pdf | The original WATERS FMTV 2019 Challenge description on which the artifacts in this repository are based. |



## How to use the custom TIM
Additionally the repository contains a custom traceability information model (TIM) that defines which link types can be created between the different artifacts. The current TIM is based on the artifact model in project `org.panorama-research.mobstr.tim`. It is implemented for use in  [Eclipse Capra](https://eclipse.org/capra).  The TIM project is located in `org.panorama-research.mobstr.tim`.


Use the following instructions to try out the TIM.  

* Download Eclipse Capra development environment using instructions provided [here](https://wiki.eclipse.org/Capra#Using_the_Eclipse_Installer). Make sure that you are using the current `develop` branch.
* Close the project `org.eclipse.capra.generic.tracemodel`
* Import the project `org.panorama-research.mobstr.tim` into your workspace. 
* Make sure that all the projects have no errors. Some of Eclipse Capra's test projects might show compilation errors due to the missing `org.eclipse.capra.generic.tracemodel` project. You can either ignore these or close the test projects.
* Click on Run --> Run Configurations and create a new Eclipse Application Configuration
* Select a new folder as the workspace for your Eclipse application
* Click "Apply", then "Run"
* Once the new workspace opens, import the projects in this repository (apart from `org.panorama-research.mobstr.tim`)
* Go to Window --> Perspectives and switch to the Capra perspective
* Go to the Eclipse preferences, open the "Capra Traceability" tree and select "Office Documents". Select "Use this column as the ID" and make sure the column is "A". Tje MobSTr dataset uses the first column in Excel files to  identify requirements and hazards.
* Follow [this video](https://www.youtube.com/watch?v=XRtLs5OT_yM&feature=youtu.be) to create and visualize traceability links.

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