package com.activision.entity;

import java.util.List;
import java.util.Vector;

public class Guerriers {
	
	// attributs pricipal de la classe 
	
		//List<Voleur> voleurs = new ArrayList();
		
		List<Guerrier> guerriers = new Vector();
		
		// contructeurs
		
		public Guerriers() {
			guerriers.add(new Guerrier("Guerrier 1",23,0 ));
			guerriers.add(new Guerrier("Robin des bois",23,0 ));
			guerriers.add(new Guerrier("Petit Jean",23,0 ));
		}
		
		// méthodes pour la logique métier Service qui le métier voleur
		
		public void addGuerrier(Guerrier g) {
			guerriers.add(g);
		}
		
		public int nbGuerriers() {
			return guerriers.size();
		}
		
		
		public void removeVoleur(Guerrier g) {
			guerriers.remove(g);
		}
		
		public void displayVoleurs() {
			for(Guerrier g: guerriers) {
				System.out.println(g);
			}
		}


	}



