package org.panorama.research.mobstr.tim.test;

import static org.eclipse.capra.testsupport.TestHelper.clearWorkspace;
import static org.eclipse.capra.testsupport.TestHelper.createEClassInEPackage;
import static org.eclipse.capra.testsupport.TestHelper.createEcoreModel;
import static org.eclipse.capra.testsupport.TestHelper.createSimpleProject;
import static org.eclipse.capra.testsupport.TestHelper.createTraceForCurrentSelectionOfType;
import static org.eclipse.capra.testsupport.TestHelper.getProject;
import static org.eclipse.capra.testsupport.TestHelper.load;
import static org.eclipse.capra.testsupport.TestHelper.projectExists;
import static org.eclipse.capra.testsupport.TestHelper.resetSelectionView;
import static org.eclipse.capra.testsupport.TestHelper.save;
import static org.eclipse.capra.testsupport.TestHelper.thereIsATraceBetween;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.capra.testsupport.TestHelper;
import org.eclipse.capra.ui.views.SelectionView;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Before;
import org.junit.Test;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * Simple test cases for the WATERS Challenge TIM.
 * 
 * @author Jan-Philipp Steghöfer
 *
 */
public class MobstrTIMAdapterTest {

	private static final String CLASS_A_NAME = "A";
	private static final String CLASS_B_NAME = "B";

	private static final String MODEL_A_FILENAME = "modelA.ecore";
	private static final String MODEL_B_FILENAME = "modelB.ecore";

	private static final String MODEL_A_NAME = "modelA";
	private static final String MODEL_B_NAME = "modelB";

	private static final String TEST_PROJECT_NAME = "TestProject";

	@Before
	public void cleanup() throws CoreException {
		clearWorkspace();
		resetSelectionView();
	}

	@Test
	public void testCreateRelatedToTrace() throws CoreException, IOException {
		SelectionView.getOpenedView().clearSelection();

		// Create a project
		createSimpleProject(TEST_PROJECT_NAME);
		assertTrue(projectExists(TEST_PROJECT_NAME));

		// Create two models and persist them
		IProject testProject = getProject(TEST_PROJECT_NAME);
		EPackage a = TestHelper.createEcoreModel(MODEL_A_NAME);
		createEClassInEPackage(a, CLASS_A_NAME);
		save(testProject, a);

		EPackage b = createEcoreModel(MODEL_B_NAME);
		createEClassInEPackage(b, CLASS_B_NAME);
		save(testProject, b);

		// Load them, choose two elements
		ResourceSet rs = new ResourceSetImpl();

		EPackage _a = load(testProject, MODEL_A_FILENAME, rs);
		assertEquals(_a.getName(), MODEL_A_NAME);
		EClass _A = (EClass) _a.getEClassifier(CLASS_A_NAME);

		EPackage _b = load(testProject, MODEL_B_FILENAME, rs);
		assertEquals(_b.getName(), MODEL_B_NAME);
		EClass _B = (EClass) _b.getEClassifier(CLASS_B_NAME);

		// Add them to the selection view
		assertTrue(SelectionView.getOpenedView().getSelection().isEmpty());
		SelectionView.getOpenedView().dropToSelection(_A);
		SelectionView.getOpenedView().dropToSelection(_B);
		assertFalse(SelectionView.getOpenedView().getSelection().isEmpty());

		// Create a trace via the selection view
		assertFalse(thereIsATraceBetween(_A, _B));
		createTraceForCurrentSelectionOfType(TimPackage.eINSTANCE.getRelatedTo());

		// Check if trace has been created
		assertTrue(thereIsATraceBetween(_A, _B));
	}

	@Test
	public void testCreateImplementsComponentTrace() throws CoreException, IOException {
		SelectionView.getOpenedView().clearSelection();

		// Create a project
		createSimpleProject(TEST_PROJECT_NAME);
		assertTrue(projectExists(TEST_PROJECT_NAME));

		IProject testProject = getProject(TEST_PROJECT_NAME);

		// Create two models
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("ComplexTask");
		Component component = UMLFactory.eINSTANCE.createComponent();
		component.setName("FancyComponent");

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(testProject.getLocation().toString() + "/amalthea.ecore"));
		r.getContents().add(task);
		r.save(null);

		r = rs.createResource(URI.createFileURI(testProject.getLocation().toString() + "/uml.ecore"));
		r.getContents().add(component);
		r.save(null);

		// Add them to the selection view
		assertTrue(SelectionView.getOpenedView().getSelection().isEmpty());
		SelectionView.getOpenedView().dropToSelection(task);
		SelectionView.getOpenedView().dropToSelection(component);
		assertFalse(SelectionView.getOpenedView().getSelection().isEmpty());

		// Create a trace via the selection view
		assertFalse(thereIsATraceBetween(task, component));
		createTraceForCurrentSelectionOfType(TimPackage.eINSTANCE.getImplementsComponent());

		// Check if trace has been created
		assertTrue(thereIsATraceBetween(task, component));
	}

}
