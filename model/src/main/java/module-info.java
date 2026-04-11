import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.tibco.bw.capability.TibcoBwEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.tibco.bw.capability.TibcoBwResourceFactoryCapabilityFactory;

module org.nasdanika.models.tibco.bw {
	
	exports org.nasdanika.models.tibco.bw;
	exports org.nasdanika.models.tibco.bw.impl;
	exports org.nasdanika.models.tibco.bw.loader;
	exports org.nasdanika.models.tibco.bw.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	requires transitive java.xml;
	
	provides CapabilityFactory with 
		TibcoBwEPackageResourceSetCapabilityFactory,
		TibcoBwResourceFactoryCapabilityFactory;
	
}