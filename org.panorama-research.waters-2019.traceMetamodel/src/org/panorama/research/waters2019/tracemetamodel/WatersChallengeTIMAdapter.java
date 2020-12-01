package org.panorama.research.waters2019.tracemetamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.capra.core.adapters.AbstractMetaModelAdapter;
import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.capra.core.adapters.TracePersistenceAdapter;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class WatersChallengeTIMAdapter extends AbstractMetaModelAdapter implements TraceMetaModelAdapter {

	private static final int DEFAULT_INITIAL_TRANSITIVITY_DEPTH = 1;

	@Override
	public EObject createModel() {
		// TODO Auto-generated method stub
		return TracemetamodelFactory.eINSTANCE.createWatersChallengeTIM();
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		Collection<EClass> traceTypes = new ArrayList<>();
		if (selection.size() > 1) {
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getExcecutedBy());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getFormalizedBy());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getPreventedBy());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getRealizedBy());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getImplementedBy());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getRelatedTo());
			traceTypes.add(TracemetamodelPackage.eINSTANCE.getDerivedFrom());
		}
		return traceTypes;
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> selection) {
		WatersChallengeTIM tm = (WatersChallengeTIM) traceModel;
		EObject trace = TracemetamodelFactory.eINSTANCE.create(traceType);
		RelatedTo relatedToTrace = (RelatedTo) trace;
		relatedToTrace.getItem().addAll(selection);
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(new ResourceSetImpl());
		// ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);
		String name = " : ";

		// String builder to build the name of the trace link so by adding the
		// elements it connects so as to make it easy for a user to visually
		// differentiate trace links
//		StringBuilder name = new StringBuilder();
//		for (Object obj : selection) {
//			name.append(" ")
//					.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(obj)).get()
//							.withCastedHandler(artifactHelper.unwrapWrapper(obj), (h, e) -> h.getDisplayName(e))
//							.orElseGet(obj::toString));
//		}
		relatedToTrace.setName(name.toString());
		tm.getTraces().add(relatedToTrace);
		return relatedToTrace;
	}

	@Override
	public boolean isThereATraceBetween(EObject firstElement, EObject secondElement, EObject traceModel) {
		WatersChallengeTIM root = (WatersChallengeTIM) traceModel;
		List<RelatedTo> relevantLinks = new ArrayList<RelatedTo>();
		List<RelatedTo> allTraces = root.getTraces();

		for (RelatedTo trace : allTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace.getItem().contains(firstElement) && trace.getItem().contains(secondElement)) {
					relevantLinks.add(trace);
				}
			}
		}
		return relevantLinks.size() > 0;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel) {
		WatersChallengeTIM root = (WatersChallengeTIM) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<RelatedTo> traces = root.getTraces();

		if (element instanceof RelatedTo) {
			RelatedTo trace = (RelatedTo) element;
			connections.add(new Connection(element, trace.getItem(), trace));
		} else {
			for (RelatedTo trace : traces) {
				for (EObject item : trace.getItem()) {
					if (EcoreUtil.equals(item, element)) {
						connections.add(new Connection(element, trace.getItem(), trace));
					}
				}
			}
		}
		return connections;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel,
			List<String> selectedRelationshipTypes) {
		WatersChallengeTIM root = (WatersChallengeTIM) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<RelatedTo> traces = root.getTraces();

		if (selectedRelationshipTypes.size() == 0
				|| selectedRelationshipTypes.contains(TracemetamodelPackage.eINSTANCE.getRelatedTo().getName())) {
			if (element instanceof RelatedTo) {
				RelatedTo trace = (RelatedTo) element;
				connections.add(new Connection(element, trace.getItem(), trace));
			} else {
				for (RelatedTo trace : traces) {
					for (EObject item : trace.getItem()) {
						if (EcoreUtil.equals(item, element)) {
							connections.add(new Connection(element, trace.getItem(), trace));
						}
					}
				}
			}
		}
		return connections;
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel);
		List<Connection> allElements = new ArrayList<>();

		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(
								getTransitivelyConnectedElements(e, traceModel, accumulator, currDepth, maximumDepth));
					}
				}
			}
		}
		return allElements;
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, DEFAULT_INITIAL_TRANSITIVITY_DEPTH,
				maximumDepth);
	}

	@Override
	public List<Connection> getAllTraceLinks(EObject traceModel) {
		WatersChallengeTIM model = (WatersChallengeTIM) traceModel;
		List<Connection> allLinks = new ArrayList<>();

		for (RelatedTo trace : model.getTraces()) {
			List<EObject> allItems = new ArrayList<>();
			allItems.addAll(trace.getItem());
			EObject origin = allItems.get(0);
			allItems.remove(0);
			allLinks.add(new Connection(origin, allItems, trace));
		}
		return allLinks;
	}

	@Override
	public void deleteTrace(List<Connection> toDelete, EObject traceModel) {
		List<Object> toRemove = new ArrayList<>();
		if (traceModel instanceof WatersChallengeTIM) {
			WatersChallengeTIM tModel = (WatersChallengeTIM) traceModel;
			for (Connection c : toDelete) {
				for (RelatedTo trace : tModel.getTraces()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
					}
				}
			}
			for (Object trace : toRemove) {
				tModel.getTraces().remove(trace);
			}

			TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
			persistenceAdapter.saveTracesAndArtifacts(tModel,
					persistenceAdapter.getArtifactWrappers(new ResourceSetImpl()));
		}
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, selectedRelationshipTypes,
				DEFAULT_INITIAL_TRANSITIVITY_DEPTH, maximumDepth);
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, List<String> selectedRelationshipTypes, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel, selectedRelationshipTypes);
		List<Connection> allElements = new ArrayList<>();
		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(getTransitivelyConnectedElements(e, traceModel, accumulator,
								selectedRelationshipTypes, currDepth, maximumDepth));
					}
				}
			}
		}

		return allElements;
	}
}
