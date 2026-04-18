package org.nasdanika.models.tibco.bw.loader.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.tibco.bw.Project;
import org.nasdanika.models.tibco.bw.loader.BwProjectLoader;

public class BwProjectLoaderTests {
	
	@Test
	public void testLoadProject() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		BwProjectLoader loader = new BwProjectLoader(resourceSet);		
		Project project = loader.loadProject(new File("src/test/resources/sample-project"));
		
		project.getResources().forEach(r -> {
			System.out.println(r.getProjectPath() + " : " + r.eClass().getName());
		});		
	}	

}
