package org.semanticweb.cb.owlapi;

import java.io.File;

import org.semanticweb.cb.reasoner.CbOntology;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class Test {

	public static void main(String[] args) throws Exception {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLOntology ontology =
		// manager.loadOntologyFromOntologyDocument(new
		// File("/Users/ecull/Documents/workspace/full-galen.owl"));
		manager.loadOntologyFromOntologyDocument(new File(
		//     "/Users/ecull/Documents/workspace/full-galen.owl"));
		//     "/Users/ecull/Documents/workspace/not-galen.f.owl"));
				"/Users/ecull/Documents/workspace/pizza.owl"));
		CbOntology cbOntology = Converter.convert(ontology);
		cbOntology.printInfo();
		
		
	}

}
