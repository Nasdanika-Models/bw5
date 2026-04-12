package org.nasdanika.models.tibco.bw.graph;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Element;
import org.nasdanika.models.tibco.bw.Activity;
import org.nasdanika.models.tibco.bw.Call;
import org.nasdanika.models.tibco.bw.Group;
import org.nasdanika.models.tibco.bw.Node;
import org.nasdanika.models.tibco.bw.ProcessDefinition;
import org.nasdanika.models.tibco.bw.Transition;

public class Factory implements Function<EObject, Element> {
	
	private Map<EObject, Element> registry;
	
	public Factory(Map<EObject, Element> registry) {
		this.registry = registry;
	}
	
	public Factory() {
		this(new ConcurrentHashMap<>());
	}
	
	public Map<EObject, Element> getRegistry() {
		return registry;
	}

	@Override
	public Element apply(EObject eObj) {
		return registry.computeIfAbsent(Objects.requireNonNull(eObj), this::create);
	}
		
	protected Element create(EObject eObj) {				
		return switch (eObj) {
			case ProcessDefinition processDefinition -> new ProcessDefinitionNode(processDefinition, this);
			case Group group -> new GroupNode(group, this);
			case Activity activity -> new ActivityNode(activity, this);
			case Node node -> new BaseNode<Node>(node, this);			
			case Transition transition -> new TransitionConnection(transition, this);
			case Call call -> new CallConnection(call, this);
			default -> throw new IllegalArgumentException("Unexpected value: " + eObj);
		};
	}

}
