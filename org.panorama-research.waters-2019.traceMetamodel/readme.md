# WATERS Challenge TIM

This project contains the traceability information model (TIM) for the WATERS challenge dataset. It is based on the artifacts model from the `org.panorama-research.waters-2019.artifacts` project.

The TIM defines the different types of trace links that are available. Each link type has a unique name and links specific types of artifacts. Whenever possible, the type of artifact has been specified using the concrete `EClass` of the corresponding meta-model, for instance `INamed` from the Amalthea meta-model. If that is not possible because the type is wrapped (e.g., for `CapraOfficeObject`), a corresponding `@UseWrapperType` annotation is used.

The `TraceMetaModelAdapter` implementation in this project exposes all non-abstract trace types as well as the usual functions for CRUD operations on trace links and to query the trace model.