package fr.n7.simplePDL.toPetriNetwork.EMF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import petrie.Arc;
import petrie.ArcRead;
import petrie.ArcSimple;
import petrie.PetriNet;
import petrie.PetrieFactory;
import petrie.PetriePackage;
import petrie.Place;
import petrie.Node;
import petrie.Transition;
import simplepdl.Need;
import simplepdl.Process;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
/*
 * This class is used to generate a PetriNet from a SimplePDL model.
 * @authors: Carl Andriamanjato; Kilyan Le Gallic
 * @version: 1.1
 * @date: 2023-03-16
 * For information concerning how to save an EMF Model, check https://stackoverflow.com/questions/25864816/saving-an-emf-model
 *
 * Code inspired from https://www.eclipse.org/forums/index.php/t/1078143/
 */
public class PDLtoPetrie {

	public static Process loadProcess(String modelPath) {

		
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant être ouverte à
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource
		URI modelURI = URI.createURI(modelPath);
		Resource resource = resSet.getResource(modelURI, true);
		
		// Récupérer le premier élément du modèle (élément racine)
		return (Process) resource.getContents().get(0);
	}
	
	public static void generatePetrie(Process process, String modelPath) {

		// Charger le package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetriePackage packageInstance = PetriePackage.eINSTANCE;
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (le modèle)
		ResourceSet resSet = new ResourceSetImpl();
		
		// Définir la ressource (le modèle)
		URI modelURI = URI.createURI(modelPath);
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les éléments de PetriNet
	    PetrieFactory myFactory = PetrieFactory.eINSTANCE;
	    
		 // Créer un élément PetriNet
 		PetriNet petrie = myFactory.createPetriNet();
 		petrie.setName(process.getName());
 		
 		XMIResourceImpl r_esource = new XMIResourceImpl();
 		 File source = new File("transformation"+modelPath+".xmi");
 		 try {
			r_esource.load( new FileInputStream(source), new HashMap<Object,Object>());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

 		
 		


		process.getProcessElement().stream().forEach(pe ->
		{
			if (pe instanceof WorkDefinition){
				WorkDefinition wd = (WorkDefinition) pe;

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
 	 			ArcSimple ready2start = myFactory.createArcSimple();
 	 			ready2start.setWeight(1);
 	 			ready2start.setSource(ready);
 	 			ready2start.setTarget(start);
 	 			ready2start.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(ready2start);
 	 			
 	 			ArcSimple start2running = myFactory.createArcSimple();
 	 			start2running.setWeight(1);
 	 			start2running.setSource(start);
 	 			start2running.setTarget(running);
 	 			start2running.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(start2running);
 	 			
 	 			ArcSimple start2started = myFactory.createArcSimple();
 	 			start2started.setWeight(1);
 	 			start2started.setSource(start);
 	 			start2started.setTarget(started);
 	 			start2started.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(start2started);
 	 			
 	 			ArcSimple running2finish = myFactory.createArcSimple();
 	 			running2finish.setWeight(1);
 	 			running2finish.setSource(running);
 	 			running2finish.setTarget(finish);
 	 			running2finish.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(running2finish);
 	 			
 	 			ArcSimple finish2finished = myFactory.createArcSimple();
 	 			finish2finished.setWeight(1);
 	 			finish2finished.setSource(finish);
 	 			finish2finished.setTarget(finished);
 	 			finish2finished.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(finish2finished);
			}
		});
		
		process.getProcessElement().stream().forEach(pe ->
		{
			if (pe instanceof Ressource) {		// Resources
 				Ressource rs = (Ressource) pe;
 				
 				Place prs = myFactory.createPlace();
 				prs.setName(rs.getName() + "_resource");
 				prs.setMarking(rs.getNbRessourceDisponible());
 				prs.setPetrinet(petrie);
 				petrie.getPetriElements().add(prs);
 				
 				for (Need ne : rs.getNeeds()) {		// Needs
 					ArcSimple anLoad = myFactory.createArcSimple();
 	 				anLoad.setWeight(ne.getNbRessources());
 	 				
 	 				anLoad.setSource(prs);
 	 				anLoad.setTarget((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 	 					.equals(ne.getWorkDefinition().getName() + "_start")).toArray()[0]);
 	 				anLoad.setPetrinet(petrie);
 	 				petrie.getPetriElements().add(anLoad);
 	 				
 	 				ArcSimple anRelease = myFactory.createArcSimple();
 	 				anRelease.setWeight(ne.getNbRessources());
 	 				anRelease.setSource((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 	 					.equals(ne.getWorkDefinition().getName() + "_finish")).toArray()[0]);
 	 				anRelease.setTarget(prs);
 	 				anRelease.setPetrinet(petrie);
 	 				petrie.getPetriElements().add(anRelease);
 				}
 			}
		});
		
		process.getProcessElement().stream().forEach(pe -> {
			if (pe instanceof WorkSequence) {		// WorkSequence
 				WorkSequence ws = (WorkSequence) pe;
 				
 				ArcRead aws = myFactory.createArcRead();
 	 			
 	 			aws.setSource((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 					.equals(ws.getPredecessor().getName() + (ws.getLinkType() == WorkSequenceType.START_TO_START
 	 					|| ws.getLinkType() == WorkSequenceType.START_TO_FINISH ? "_started" : "_finished")) ).toArray()[0]);
 	 			
 	 			aws.setTarget((Node) petrie.getPetriElements().stream().filter(p -> p instanceof Node).filter(n -> ((Node) n).getName()
 	 					.equals(ws.getSuccessor().getName() + (ws.getLinkType() == WorkSequenceType.START_TO_START
 	 					|| ws.getLinkType() == WorkSequenceType.FINISH_TO_START ? "_start" : "_finish")) ).toArray()[0]);
 	 			
 	 			aws.setPetrinet(petrie);
 	 			petrie.getPetriElements().add(aws);
			}
		});

		petrie.getPetriElements().stream().forEach( pe -> {
			if (pe instanceof ArcSimple) {
				ArcSimple ac = (ArcSimple) pe;
				System.out.println(ac.getSource().getName()+" -"+ac.getWeight()+"> "+ac.getTarget().getName());
			}
			if (pe instanceof ArcRead) {
				ArcRead ac = (ArcRead) pe;
				System.out.println(ac.getSource().getName()+" -"+"read"+"> "+ac.getTarget().getName());
			}
		});
//		resource.getContents().add(petrie);
// 		// Sauver la ressource
//	    try {
//	    	resource.save(resource.getContents());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("key", new XMIResourceFactoryImpl());
		ResourceSet res_Set = new ResourceSetImpl();
		Resource re_source = resSet.createResource(URI.createFileURI("transformation"+modelPath+".xmi"));
		re_source.getContents().add(petrie);
		try {
			re_source.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
