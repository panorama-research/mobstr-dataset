package org.panorama.research.mobstr.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.capra.core.adapters.AbstractMetaModelAdapter;
import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.capra.core.adapters.TracePersistenceAdapter;
import org.eclipse.capra.core.helpers.ArtifactHelper;
import org.eclipse.capra.core.helpers.EditingDomainHelper;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * 
 * Implementation of {@link TraceMetaModelAdapter} for the WATERS Challenge TIM.
 * 
 * @author Jan-Philipp Steghöfer
 *
 */
public class MobstrTIMAdapter extends AbstractMetaModelAdapter implements TraceMetaModelAdapter {

	private static final int DEFAULT_INITIAL_TRANSITIVITY_DEPTH = 1;

	@Override
	public EObject createModel() {
		// TODO Auto-generated method stub
		return TimFactory.eINSTANCE.createMobstrTIM();
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		// TODO: Make the available trace types dependent on the selection
		Collection<EClass> traceTypes = new ArrayList<>();
		if (selection.size() > 1) {
			traceTypes.add(TimPackage.eINSTANCE.getAddressedByFMEA());
			traceTypes.add(TimPackage.eINSTANCE.getAddressedBySafetyGoal());
			traceTypes.add(TimPackage.eINSTANCE.getBasedOnAssumption());
			traceTypes.add(TimPackage.eINSTANCE.getDerivedFromItemDefinition());
			traceTypes.add(TimPackage.eINSTANCE.getDetailsCausesOf());
			traceTypes.add(TimPackage.eINSTANCE.getDetailsHazardWith());
			traceTypes.add(TimPackage.eINSTANCE.getEffectsComponent());
			traceTypes.add(TimPackage.eINSTANCE.getExpressesAsClaim());
			traceTypes.add(TimPackage.eINSTANCE.getExpressesAsGoal());
			traceTypes.add(TimPackage.eINSTANCE.getExpressesAsClaim());
			traceTypes.add(TimPackage.eINSTANCE.getImplementsComponent());
			traceTypes.add(TimPackage.eINSTANCE.getLeadsToHazard());
			traceTypes.add(TimPackage.eINSTANCE.getModelsImplementationOfRequirement());
			traceTypes.add(TimPackage.eINSTANCE.getRealizesItemDefintion());
			traceTypes.add(TimPackage.eINSTANCE.getReferencesComponent());
			traceTypes.add(TimPackage.eINSTANCE.getReferencesInEvidences());
			traceTypes.add(TimPackage.eINSTANCE.getRefinesItemDefinition());
			traceTypes.add(TimPackage.eINSTANCE.getRefinesTimingRequirement());
			traceTypes.add(TimPackage.eINSTANCE.getRelatedTo());
			traceTypes.add(TimPackage.eINSTANCE.getSpecifiedByRequirement());
			traceTypes.add(TimPackage.eINSTANCE.getUsesAsEvidence());
		}
		return traceTypes;
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> origins, List<EObject> targets) {
		MobstrTIM tm = (MobstrTIM) traceModel;
		AbstractTraceLink trace = (AbstractTraceLink) TimFactory.eINSTANCE.create(traceType);
		if (traceType.getClassifierID() == TimPackage.RELATED_TO) {
			RelatedTo relatedToTrace = (RelatedTo) trace;
			relatedToTrace.getItems().addAll(origins);
			relatedToTrace.getItems().addAll(targets);
		} else {
			EReference sourceRef = getTraceOriginRef(trace);
			if (sourceRef.isMany()) {
				trace.eSet(sourceRef, origins);
			} else {
				trace.eSet(sourceRef, origins.get(0));
			}
			EReference targetRef = getTraceTargetRef(trace);
			if (targetRef.isMany()) {
				trace.eSet(targetRef, targets);
			} else {
				trace.eSet(targetRef, targets.get(0));
			}
		}

		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(new ResourceSetImpl());
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);

		// String builder to build the name of the trace link so by adding the
		// elements it connects so as to make it easy for a user to visually
		// differentiate trace links
		StringBuilder name = new StringBuilder();
		name.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(origins.get(0))).get()
				.withCastedHandler(artifactHelper.unwrapWrapper(origins.get(0)), (h, e) -> h.getDisplayName(e))
				.orElseGet(origins.get(0)::toString));
		name.append(" -> ");
		for (Object obj : targets) {
			name.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(obj)).get()
					.withCastedHandler(artifactHelper.unwrapWrapper(obj), (h, e) -> h.getDisplayName(e))
					.orElseGet(obj::toString));
			name.append(";");
		}
		trace.setName(name.toString());

		TransactionalEditingDomain editingDomain = EditingDomainHelper.getEditingDomain();
		// We're saving the trace model and the artifact model in the same transaction
		Command cmd = new RecordingCommand(editingDomain, "Add trace") {
			@Override
			protected void doExecute() {
				tm.getTraces().add(trace);
			}
		};

		try {
			((TransactionalCommandStack) editingDomain.getCommandStack()).execute(cmd, null); // default options
		} catch (RollbackException e) {
			throw new IllegalStateException("Adding a trace link was rolled back.", e);
		} catch (InterruptedException e) {
			throw new IllegalStateException("Adding a trace link was interrupted.", e);
		}
		return trace;
	}

	@Override
	public boolean isThereATraceBetween(EObject firstElement, EObject secondElement, EObject traceModel) {
		if (traceModel == null) {
			return false;
		}
		MobstrTIM root = (MobstrTIM) traceModel;

		List<AbstractTraceLink> relevantLinks = new ArrayList<AbstractTraceLink>();
		List<AbstractTraceLink> allTraces = root.getTraces();

		for (AbstractTraceLink trace : allTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace instanceof RelatedTo) {
					if (((RelatedTo) trace).getItems().contains(firstElement)
							&& ((RelatedTo) trace).getItems().contains(secondElement)) {
						relevantLinks.add(trace);
					}
				} else {
					if (getTraceOrigin(trace).contains(firstElement) && getTraceTarget(trace).contains(secondElement)) {
						relevantLinks.add(trace);
					}
				}
			}
		}
		return !relevantLinks.isEmpty();
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject traceModel) {
		if (traceModel == null) {
			return Collections.emptyList();
		}
		MobstrTIM root = (MobstrTIM) traceModel;
		List<Connection> connections = new ArrayList<>();
		List<AbstractTraceLink> traces = root.getTraces();

		if (element instanceof RelatedTo) {
			RelatedTo trace = (RelatedTo) element;
			connections.add(new Connection(Arrays.asList(element), trace.getItems(), trace));
		} else {
			for (AbstractTraceLink trace : traces) {
				for (EObject item : getTraceOrigin(trace)) {
					if (EcoreUtil.equals(item, element)) {
						connections.add(new Connection(Arrays.asList(element), getTraceTarget(trace), trace));
					}
				}
			}
		}
		return connections;
	}

	/**
	 * Retrieve the reference for the {@code targets} property of a
	 * {@link DirectedTraceLink}.
	 * 
	 * @param trace the {@code DirectedTraceLink} whose target reference should be
	 *              retrieved
	 * @return the {@code EReference} for the {@code targets} property of the given
	 *         trace link
	 */
	private EReference getTraceTargetRef(AbstractTraceLink trace) {
		return (EReference) trace.eClass().getEStructuralFeatures().get(1);
	}

	/**
	 * Retrieve the objects stored in the {@code targets} property of a
	 * {@link DirectedTraceLink}.
	 * 
	 * @param trace the {@code DirectedTraceLink} whose targets should be retrieved
	 * @return the objects stored in the {@code targets} property of the given trace
	 *         link
	 */
	private EList<EObject> getTraceTarget(AbstractTraceLink trace) {
		return getElistFromReference(getTraceTargetRef(trace), trace);
	}

	/**
	 * Retrieve the reference for the {@code origin} property of a
	 * {@link DirectedTraceLink}.
	 * 
	 * @param trace the {@code DirectedTraceLink} whose origin reference should be
	 *              retrieved
	 * @return the {@code EReference} for the {@code origin} property of the given
	 *         trace link
	 */
	private EReference getTraceOriginRef(AbstractTraceLink trace) {
		return (EReference) trace.eClass().getEStructuralFeatures().get(0);
	}

	/**
	 * Retrieve the objects stored in the {@code origin} property of a
	 * {@link DirectedTraceLink}.
	 * 
	 * @param trace the {@code DirectedTraceLink} whose origins should be retrieved
	 * @return the objects stored in the {@code origins} property of the given trace
	 *         link
	 */
	private EList<EObject> getTraceOrigin(AbstractTraceLink trace) {
		return getElistFromReference(getTraceOriginRef(trace), trace);
	}

	/**
	 * Constructs a list of {@code EObject} from the objects stored in the provided
	 * reference.
	 * 
	 * @param ref   the reference whose objects should be retrieved
	 * @param trace the trace link to which the reference belongs
	 * @return a list of {@code EObject} instances stored in the reference; empty
	 *         list if none are found
	 */
	@SuppressWarnings("unchecked")
	private EList<EObject> getElistFromReference(EReference ref, AbstractTraceLink trace) {
		EList<EObject> elist = new BasicEList<EObject>();
		Object originData = trace.eGet(ref);
		if (elist.getClass().isAssignableFrom(originData.getClass())) {
			elist = (EList<EObject>) originData;
		} else {
			if (originData instanceof EObject) {
				elist.add((EObject) originData);
			}
		}
		return elist;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel,
			List<String> selectedRelationshipTypes) {
		if (tracemodel == null) {
			return Collections.emptyList();
		}
		MobstrTIM root = (MobstrTIM) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<AbstractTraceLink> traces = root.getTraces();

		if (selectedRelationshipTypes.size() == 0
				|| selectedRelationshipTypes.contains(TimPackage.eINSTANCE.getRelatedTo().getName())) {
			if (element instanceof RelatedTo) {
				RelatedTo trace = (RelatedTo) element;
				connections.add(new Connection(Arrays.asList(element), trace.getItems(), trace));
			} else if (element instanceof DirectedTraceLink) {

			} else {
				for (AbstractTraceLink trace : traces) {
					if (trace instanceof RelatedTo) {
						for (EObject item : ((RelatedTo) trace).getItems()) {
							if (EcoreUtil.equals(item, element)) {
								connections.add(
										new Connection(Arrays.asList(element), ((RelatedTo) trace).getItems(), trace));
							}
						}
					} else {
						for (EObject item : getTraceOrigin(trace)) {
							if (EcoreUtil.equals(item, element)) {
								connections.add(new Connection(getTraceOrigin(trace), getTraceTarget(trace), trace));
							}
						}
					}
				}
			}
		}
		return connections;
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, int currentDepth, int maximumDepth) {
		if (traceModel == null) {
			return Collections.emptyList();
		}
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
		if (traceModel == null) {
			return Collections.emptyList();
		}
		MobstrTIM model = (MobstrTIM) traceModel;
		List<Connection> allLinks = new ArrayList<>();

		for (AbstractTraceLink trace : model.getTraces()) {
			if (trace instanceof RelatedTo) {
				List<EObject> allItems = new ArrayList<>();
				allItems.addAll(((RelatedTo) trace).getItems());
				EObject origin = allItems.get(0);
				allItems.remove(0);
				allLinks.add(new Connection(Arrays.asList(origin), allItems, trace));
			} else {
				allLinks.add(new Connection(getTraceOrigin(trace), getTraceTarget(trace), trace));
			}
		}
		return allLinks;
	}

	@Override
	public void deleteTrace(List<Connection> toDelete, EObject traceModel) {
		List<Object> toRemove = new ArrayList<>();
		if (traceModel instanceof MobstrTIM) {
			MobstrTIM tModel = (MobstrTIM) traceModel;
			for (Connection c : toDelete) {
				for (AbstractTraceLink trace : tModel.getTraces()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
					}
				}
			}

			// Delete traces within a transaction
			TransactionalEditingDomain editingDomain = EditingDomainHelper.getEditingDomain();
			Command cmd = new RecordingCommand(editingDomain, "Remove traces") {
				@Override
				protected void doExecute() {
					for (Object trace : toRemove) {
						tModel.getTraces().remove(trace);
					}
				}
			};

			try {
				((TransactionalCommandStack) editingDomain.getCommandStack()).execute(cmd, null); // default options
			} catch (RollbackException e) {
				throw new IllegalStateException("Removing trace links was rolled back.", e);
			} catch (InterruptedException e) {
				throw new IllegalStateException("Removing trace links was interrupted.", e);
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
		if (traceModel == null) {
			return Collections.emptyList();
		}
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
