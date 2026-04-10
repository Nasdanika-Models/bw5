package org.nasdanika.models.tibco.bw.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class TibcoBwResourceFactory extends ResourceFactoryImpl {
		
	@Override
	public Resource createResource(URI uri) {
		return new TibcoBwResource(uri);
	}
	
}
