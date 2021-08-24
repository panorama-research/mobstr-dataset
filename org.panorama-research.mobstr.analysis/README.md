# Analysis Results for the MobSTr dataset

This folder contains analysis results that were derived from the Amalthea model in the "[`org.panorama-research.mobstr.amalthea`](../org.panorama-research.mobstr.amalthea)" folder using different tools. 

* [`dse_analysis`](dse_analysis): Contains a series of timing related metrics, such as the **W**orst **C**ase **R**esponse **T**ime (WCRT) for each individual task, an indicator whether deadlines were missed, and end-to-end latencies for task chains. The metrics were derived using static analysis techniques that were described in publications [1,2]. 
  * [`dse_analysis/results.json`](dse_analysis/results.json): Timing analysis metrics in a machine-readable format (JSON)
  * [`dse_analysis/_dse_interpreter/_chart_visualizer/charts.html`](dse_analysis/_dse_interpreter/_chart_visualizer/charts.html): Visualization of the timing analysis results (HTML)
* [`model_analysis/_chart_visualizer/charts.html`](model_analysis/_chart_visualizer/charts.html): Visualization of so-called label access metrics, e.g. the number of times variables are accessed by each individual processing unit and process, the type of access (read, write, both), and a histogram illustrating the distribution of variable sizes.

Details about these analyses can be found in the following papers:

[1] Lukas Krawczyk, Mahmoud Bazzal, Ram Prasath Govindarajan and Carsten Wolff, "[An analytical approach for calculating end-to-end response times in autonomous driving applications](https://www.researchgate.net/profile/Lukas-Krawczyk/publication/334084554_An_analytical_approach_for_calculating_end-to-end_response_times_in_autonomous_driving_applications/links/5d15ea50458515c11cfdec47/An-analytical-approach-for-calculating-end-to-end-response-times-in-autonomous-driving-applications.pdf)", 10th International Workshop on Analysis Tools and Methodologies for Embedded and Realtime Systems (WATERS 2019), July 2019.

[2] Lukas Krawczyk, Mahmoud Bazzal, Ram Prasath Govindarajan and Carsten Wolff, "[Model-Based Timing Analysis and Deployment Optimization for Heterogeneous Multi-core Systems using Eclipse APP4MC](https://www.researchgate.net/profile/Lukas-Krawczyk/publication/336345570_Model-based_Timing_Analysis_and_Deployment_Optimization_for_Heterogeneous_Multi-Core_Systems_using_Eclipse_APP4MC/links/5e1483c14585159aa4b917cd/Model-based-Timing-Analysis-and-Deployment-Optimization-for-Heterogeneous-Multi-Core-Systems-using-Eclipse-APP4MC.pdf)," 2019 ACM/IEEE 22nd International Conference on Model Driven Engineering Languages and Systems Companion (MODELS-C), 2019, pp. 44-53, doi: 10.1109/MODELS-C.2019.00013.
