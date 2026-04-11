package org.nasdanika.models.tibco.bw.capability;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.models.tibco.bw.ProcessDefinition;
import org.nasdanika.models.tibco.bw.loader.BwProcessLoader;

public class TibcoBwResource extends ResourceImpl {
	
	public TibcoBwResource(URI uri) {
		super(uri);
	}
		
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		BwProcessLoader loader = new BwProcessLoader();
		try (inputStream) {
			ProcessDefinition pd = loader.load(inputStream, getURI().toString());
			getContents().add(pd);			
		} catch (XMLStreamException e) {
			throw new NasdanikaException(e);
		}
	}
			
}