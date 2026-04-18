import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bw5.ecore.ECoreGenBw5ProcessorsCapabilityFactory;

module org.nasdanika.models.bw5.ecore {
		
	requires transitive org.nasdanika.models.bw5;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.bw5.ecore;
	opens org.nasdanika.models.bw5.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenBw5ProcessorsCapabilityFactory; 		
	
}
