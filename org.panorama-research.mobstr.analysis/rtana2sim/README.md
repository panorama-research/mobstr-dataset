# RTana<sub>2sim</sub> Analysis of the MobSTr Requirements

This folder contains configurations and results of an analysis of the MobSTr safety requirements with the RTana<sub>2sim</sub> model checker [1]. In particular, two example analysis cases are contained.

* A *virtual integration test (VIT)* of the `Object Localization` component in the UML model. The VIT analysis verifies the decomposition of the `Object Localization` component into its sub-components by checking refinement of the attached contracts in the [`../../org.panorama-research.mobstr.contracts`](../../org.panorama-research.mobstr.contracts) folder. 
* A *satisfaction check* on the `Object Localization` component. It checks whether the AMALTHEA software model in the [`../../org.panorama-research.mobstr.amalthea/mapped+safety`](../../org.panorama-research.mobstr.amalthea/mapped+safety) folder satisfies the timing contract of the `Object Localization` component. The AMALTHEA model is a modified version of the original WATERS Challenge model that reflects the task-to-core mapping determined in [2] and some of the introduced safety mechanisms.   

For both types of analyses, the mappings between components, contracts, and AMALTHEA model elements is derived from the Capra trace links. 

The files in this folder are organized as follows:

* `*.analysisconfig` files contain the analysis configurations in a simple XML format. 
* Analysis results are stored as `*.html` files. 
* `*.model` files are the intermediate RTana<sub>2sim</sub> models that have been generated from the UML and AMALTHEA models and the timing contracts.
* In case of contract violations, the `*.btf` file contains a counter-example trace that shows the contract violation. It can be opened for example with [Tracecompass](https://www.eclipse.org/tracecompass/). 


#### References

[1] Jan Steffen Becker, Björn Koopmann and Ingo Stierand: "[AMALTHEA Timing Analyses with RTana2sim](https://panorama-research.org/pdf/aramis2-timing-analysis.pdf)", Presentation, 2021

[2] Lukas Krawczyk, Mahmoud Bazzal, Ram Prasath Govindarajan and Carsten Wolff, "[Model-Based Timing Analysis and Deployment Optimization for Heterogeneous Multi-core Systems using Eclipse APP4MC](https://www.researchgate.net/profile/Lukas-Krawczyk/publication/336345570_Model-based_Timing_Analysis_and_Deployment_Optimization_for_Heterogeneous_Multi-Core_Systems_using_Eclipse_APP4MC/links/5e1483c14585159aa4b917cd/Model-based-Timing-Analysis-and-Deployment-Optimization-for-Heterogeneous-Multi-Core-Systems-using-Eclipse-APP4MC.pdf)," 2019 ACM/IEEE 22nd International Conference on Model Driven Engineering Languages and Systems Companion (MODELS-C), 2019, pp. 44-53, doi: 10.1109/MODELS-C.2019.00013.
