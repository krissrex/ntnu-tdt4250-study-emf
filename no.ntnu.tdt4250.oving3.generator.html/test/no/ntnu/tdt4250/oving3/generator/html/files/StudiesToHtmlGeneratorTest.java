package no.ntnu.tdt4250.oving3.generator.html.files;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicMonitor;
import org.hamcrest.Matcher;
import static org.hamcrest.core.Is.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.Study;
import no.ntnu.tdt4250.oving1.studies.University;

class StudiesToHtmlGeneratorTest {

	private University uni;
	
	@BeforeEach
	void setUp() throws Exception {
		StudiesFactory factory = StudiesFactory.eINSTANCE;
		uni = factory.createUniversity();
		uni.setName("NTNU");
		
		Study mtdt = factory.createStudy();
		mtdt.setCode("mtdt");
		mtdt.setName("Datateknologi");
		uni.getStudies().add(mtdt);
	}
	

	@Test
	void shouldGenerateHtmlFromModel() throws Exception {
		// Given
		File targetFolder = new File("generated/test");
		targetFolder.mkdirs();
		System.out.println("Generating in folder: " + targetFolder.getAbsolutePath().toString());
		// When
		StudiesToHtmlGenerator generator = new StudiesToHtmlGenerator(uni, targetFolder, Collections.emptyList());
		generator.generate(new BasicMonitor());
		
		// Then
		assertThat(targetFolder.list().length, is(1));
	}

}
