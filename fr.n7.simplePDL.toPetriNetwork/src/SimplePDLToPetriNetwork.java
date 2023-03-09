
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Need;
import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;

import petrie.PetriNet;
import petrie.PetrinetFactory;
import petrie.PetrinetPackage;
import petrie.ArcSimple;
import petrie.Place;
import petrie.Transition;
import petrie.Node;

public class SimplePDLtoPetrieNetwork {

	public static Process loadProcess(String modelPath) {

		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant être ouverte à
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modèle)
		URI modelURI = URI.createURI(modelPath);
		Resource resource = resSet.getResource(modelURI, true);
		
		// Récupérer le premier élément du modèle (élément racine)
		return (Process) resource.getContents().get(0);
	}
	
	public static void generatePetrie(Process process, String modelPath) {

		// Charger le package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetrinetPackage packageInstance = PetriePackage.eINSTANCE;
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (le modèle)
		ResourceSet resSet = new ResourceSetImpl();
		
		// Définir la ressource (le modèle)
		URI modelURI = URI.createURI(modelPath);
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les éléments de PetriNet
	    PetrinetFactory myFactory = PetrinetFactory.eINSTANCE;
	    
		 // Créer un élément PetriNet
 		PetriNet petrie = myFactory.createPetrie();
 		petrie.setName(process.getName());
 		
 		resource.getContents().add(petrie);
 		
 		process.getProcessElements().stream().forEach(pe -> {
 			if (pe instanceof WorkDefinition) {		// WorkDefinition
				WorkDefinition wd = (WorkDefinition) pe;
 				

 				// WorkDefinition Places
 				Place ready = myFactory.createPlace();
 	 			ready.setName(wd.getName() + "_ready");
 	 			ready.setMarking(1);
 	 			ready.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(ready);
 	 			
 	 			Place running = myFactory.createPlace();
 	 			running.setName(wd.getName() + "_running");
 	 			running.setMarking(0);
 	 			running.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(running);
 	 			
 	 			Place started = myFactory.createPlace();
 	 			started.setName(wd.getName() + "_started");
 	 			started.setMarking(0);
 	 			started.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(started);
 	 			
 	 			Place finished = myFactory.createPlace();
 	 			finished.setName(wd.getName() + "_finished");
 	 			finished.setMarking(0);
 	 			finished.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(finished);
 	 			
				
 	 			// WorkDefinition Transitions
 	 			Transition start = myFactory.createTransition();
 	 			start.setName(wd.getName() + "_start");
 	 			start.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(start);
 	 			
 	 			Transition finish = myFactory.createTransition();
 	 			finish.setName(wd.getName() + "_finish");
 	 			finish.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(finish);
 	 			
				
 	 			// WorkDefinition Arcs
 	 			ArcSimple ready2start = myFactory.createArc();
 	 			ready2start.setWeight(1);
 	 			ready2start.setSource(ready);
 	 			ready2start.setTarget(start);
 	 			ready2start.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(ready2start);
 	 			
 	 			ArcSimple start2running = myFactory.createArc();
 	 			start2running.setWeight(1);
 	 			start2running.setSource(start);
 	 			start2running.setTarget(running);
 	 			start2running.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(start2running);
 	 			
 	 			ArcSimple start2started = myFactory.createArc();
 	 			start2started.setWeight(1);
 	 			start2started.setSource(start);
 	 			start2started.setTarget(started);
 	 			start2started.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(start2started);
 	 			
 	 			ArcSimple running2finish = myFactory.createArc();
 	 			running2finish.setWeight(1);
 	 			running2finish.setSource(running);
 	 			running2finish.setTarget(finish);
 	 			running2finish.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(running2finish);
 	 			
 	 			ArcSimple finish2finished = myFactory.createArc();
 	 			finish2finished.setWeight(1);
 	 			finish2finished.setSource(finish);
 	 			finish2finished.setTarget(finished);
 	 			finish2finished.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(finish2finished);
 			} else if (pe instanceof WorkSequence) {		// WorkSequence
 				WorkSequence ws = (WorkSequence) pe;
 				
 				ArcRead aws = myFactory.createArc();
 	 			
 	 			aws.setSource((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 					.equals(ws.getPredecessor().getName() + (ws.getLinkType() == WorkSequenceType.START_TO_START
 	 					|| ws.getLinkType() == WorkSequenceType.START_TO_FINISH ? "_started" : "_finished")) ).toArray()[0]);
 	 			aws.setTarget((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 					.equals(ws.getSuccessor().getName() + (ws.getLinkType() == WorkSequenceType.START_TO_START
 	 					|| ws.getLinkType() == WorkSequenceType.FINISH_TO_START ? "_start" : "_finish")) ).toArray()[0]);
 	 			aws.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(aws);
 			} else if (pe instanceof simplepdl.Resource) {		// Resources
 				simplepdl.Resource rs = (simplepdl.Resource) pe;
 				
 				Place prs = myFactory.createPlace();
 				prs.setName(rs.getName() + "_resource");
 				prs.setMarking(rs.getNbAvailableResources());
 				prs.setPetrinet(petrie);
 				petrie.getPetriElements().add(prs);
 				
 				for (Need ne : rs.getNeeds()) {		// Needs
 					ArcSimple anLoad = myFactory.createArc();
 	 				anLoad.setWeight(ne.getNbResources());
 	 				
 	 				anLoad.setSource(prs);
 	 				anLoad.setTarget((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 	 					.equals(ne.getWorkdefinition().getName() + "_start")).toArray()[0]);
 	 				anLoad.setPetrinet(petrie);
 	 				petrie.getPetriElements().add(anLoad);
 	 				
 	 				ArcSimple anRelease = myFactory.createArc();
 	 				anRelease.setWeight(ne.getNbResources());
 	 				anRelease.setSource((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 	 					.equals(ne.getWorkdefinition().getName() + "_finish")).toArray()[0]);
 	 				anRelease.setTarget(prs);
 	 				anRelease.setPetrinet(petrie);
 	 				petrie.getPetriElements().add(anRelease);
 				}
 			}
 		});
 		
 		// Sauver la ressource
	    try {
	    	resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
 		
	}
	
	public static void main(String[] args) {
		if (args.length != 2)
			throw new IllegalArgumentException("Usage: java SimplePDLtoPetrieEMF <simplepdl_model_path> <petrie_model_path>");
		
		Process process = loadProcess(args[0]);
		
		generatePetrie(process, args[1]);
	}

}