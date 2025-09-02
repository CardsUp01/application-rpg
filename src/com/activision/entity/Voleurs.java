package com.activision.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Voleurs {
	
	
	// attributs pricipal de la classe 
	
	//List<Voleur> voleurs = new ArrayList();
	
	List<Voleur> voleurs = new Vector();
	
	// contructeurs
	
	public Voleurs() {
		voleurs.add(new Voleur("Arsen Lupin",23,0 ));
		voleurs.add(new Voleur("Robin des bois",23,0 ));
		voleurs.add(new Voleur("Petit Jean",23,0 ));
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
