package no.ntnu.tdt4250.oving1.serialization;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.University;

public class StudyXmiLoader {

	public static final String StudyXmiFileExtension = "xmi";

	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(StudyXmiFileExtension,
				new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(StudiesPackage.eNS_URI, StudiesPackage.eINSTANCE);
	}

	/**
	 * Loads resources using globally registered factories. Study files should use
	 * {@value #StudyXmiFileExtension} file extension.
	 * 
	 * @param fileUri eg. {@code "file:/Users/hal/resource2.xmi"}
	 */
	public List<Resource> loadFromXmi(final String fileUri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI xmiUri = URI.createURI(fileUri);
		Resource resource = resourceSet.createResource(xmiUri); // loads using registry, instead of new
																// XMIResourceImpl(xmiUri)
		if (resource == null) {
			throw new IllegalArgumentException("Failed to load \"" + fileUri + "\": No factory registered");
		}
		resourceSet.getResources().add(resource);

		try {
			resource.load(null);
			for (Diagnostic error : resource.getErrors()) {
				System.out.println("XMI error: " + error.getMessage());
			}
			for (Diagnostic warning : resource.getWarnings()) {
				System.out.println("XMI warning: " + warning.getMessage());
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to load xmi \"" + fileUri + "\"", e);
		}

		return resourceSet.getResources();
	}

	public University getFirstUniversityEObject(Resource resource) {
		for (EObject object : resource.getContents()) {
			if (object instanceof University) {
				return (University) object;
			}
		}
		throw new IllegalArgumentException("No university found");
	}
}
