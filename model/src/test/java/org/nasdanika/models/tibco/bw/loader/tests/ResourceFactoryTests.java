package org.nasdanika.models.tibco.bw.loader.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.models.tibco.bw.graph.Factory;
import org.nasdanika.models.tibco.bw.graph.ProcessDefinitionNode;

public class ResourceFactoryTests {
	
	@Test
	public void testLoadProcess() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File processFile = new File("src/test/resources/sample-process.process").getCanonicalFile();
		Resource resource = resourceSet.getResource(URI.createFileURI(processFile.getAbsolutePath()), true);		
		resource.getAllContents().forEachRemaining(e -> {
			System.out.println(e.eClass().getName());
		});				
	}	
	
	@Test
	public void testCreateGraph() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File processFile = new File("src/test/resources/sample-process.process").getCanonicalFile();
		Resource resource = resourceSet.getResource(URI.createFileURI(processFile.getAbsolutePath()), true);		
		
		Factory factory = new Factory();
		
		resource.getContents().forEach(e -> {
			Element pdGraph = factory.apply(e);
			assertTrue(pdGraph instanceof ProcessDefinitionNode);
			((ProcessDefinitionNode) pdGraph).stream().forEach(ge -> {
				System.out.println(ge.getClass().getName());
				if (ge instanceof Node node) {
					System.out.println("\t" + node.getIncomingConnections());
					System.out.println("\t" + node.getOutgoingConnections());
				}
				if (ge instanceof Connection connection) {
					System.out.println("\t" + connection.getSource());
					System.out.println("\t" + connection.getTarget());
				}
				
			});
		});
	}		

}
