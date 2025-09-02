package com.activision.entity;

import java.util.List;
import java.util.Vector;

public class Voleurs {
	
	
	// attributs pricipal de la classe 
	
	//List<Voleur> voleurs = new ArrayList();
	
	List<Voleur> voleurs = new Vector<Voleur>();
	
	// contructeurs
	
	public Voleurs() {
		voleurs.add(new Voleur("Ezio",45,12 ));
		voleurs.add(new Voleur("Altair",40,15 ));
		voleurs.add(new Voleur("Garrett",38,18 ));
	}
	
	// méthodes pour la logique métier Service qui le métier voleur
	
	public void addVoleur(Voleur v) {
		voleurs.add(v);
	}
	
	public int nbVoleurs() {
		return voleurs.size();
	}
	
	
	public void removeVoleur(Voleur v) {
		voleurs.remove(v);
	}
	
	public void displayVoleurs() {
		for(Voleur v: voleurs) {
			System.out.println(v);
		}
	}


}
