import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.tibco.bw.ecore.ECoreGenTibcoBwProcessorsCapabilityFactory;

module org.nasdanika.models.tibco.bw.ecore {
		
	requires transitive org.nasdanika.models.tibco.bw;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.tibco.bw.ecore;
	opens org.nasdanika.models.tibco.bw.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenTibcoBwProcessorsCapabilityFactory; 		
	
}
