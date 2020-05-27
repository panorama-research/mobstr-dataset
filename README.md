# WATERS 2019 Challenge Artefacts provided by the PANORAMA Project

This repository contains additional artifacts such as requirements and architecture models for the [WATERS FMTV 2019 challenge][1]. It is based on the solution provided by the [PANORAMA research project][2] in the [APP4MC Eclipse project][3]. The corresponding AMALTHEA model for the challenge is included here. The original file can be found in the [APP4MC Github Repository][4].

Requirements and architectural information have been derived directly from the challenge description. We make no claim on the completeness or correctness of any of the artefacts available for download here.

Additionally the repo contains a custom traceability information model (TIM) that defines which link types can be created between the different artifacts. The current TIM is given in the TIM.pptx file. 

The TIM assumes one is using [Eclipse Capra](https://projects.eclipse.org/projects/modeling.capra) and is therefore implemented as a traceability extension point of the Eclipse Capra tool. The TIM project is `org.panorama.research.waters-2019.traceMetamodel`

### How to use the custom TIM
The current TIM is not packaged yet with a Capra distribution and therefore can only be used in the development environment. Use the following instructions to try out the TIM.  

* Download Eclipse Capra developement environment using instructions provided on this [link](https://wiki.eclipse.org/Capra)
* Close the project `org.eclipse.capra.generic.tracemodels`
* Add the project `org.panorama.research.waters-2019.traceMetamodel` to your workspace
* Make sure that all the projects have no errors.
* Click on Run --> Run Configurations and create a new Eclipse Application Configuration
* Select your running workspace
* Click "Apply", then "Run"
* Once the new workspace opens, create or import projects that you want to use to create traceability links (in this case the projects in this repo)
* Go to perspectives and switch to the Capra perspective
* Follow [this video](https://www.youtube.com/watch?v=XRtLs5OT_yM&feature=youtu.be) to create and visualize traceability links.

All artefacts provided here are under [Eclipse Public License v2.0][5]. Copyright 2020 by [contributors](CONTRIBUTORS).

[1]: https://www.ecrts.org/archives/fileadmin/WebsitesArchiv/ecrts2019/waters/waters-industrial-challenge/index.html
[2]: https://panorama-research.org/
[3]: https://www.eclipse.org/app4mc/
[4]: https://git.eclipse.org/c/app4mc/org.eclipse.app4mc.examples.git/tree/WATERS-FMTV-challenges
[5]: https://www.eclipse.org/legal/epl-2.0/
