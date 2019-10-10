package no.ntnu.tdt4250.oving1.serialization;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.University;

public class StudyXmiLoaderTest {

    @Test
    public void canLoadXmi() throws Exception {
        // Given
        URL resource = getClass().getResource("study_testcase_1.xmi");
        String modelInstancePath = resource.toURI().toString();
        assert new File(resource.toURI()).exists();

        StudyXmiLoader loader = new StudyXmiLoader();

        // When
        List<Resource> resources = loader.loadFromXmi(modelInstancePath);

        // Then
        assertThat(resources.size(), is(1));
    }

    
    @Test
    public void canGetUniversity() throws Exception {
        // Given
        URL resource = getClass().getResource("study_testcase_1.xmi");
        String modelInstancePath = resource.toURI().toString();
        assert new File(resource.toURI()).exists();

        StudyXmiLoader loader = new StudyXmiLoader();

        // When
        List<Resource> resources = loader.loadFromXmi(modelInstancePath);
        University university = loader.getFirstUniversityEObject(resources.get(0));
        
        // Then        
        assertThat(university.getName(), is("NTNU"));
    }
}
