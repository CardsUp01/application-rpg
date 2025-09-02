package com.activision.entity;

import java.util.List;
import java.util.Vector;

public class Guerriers {
	
	// attributs pricipal de la classe 
	
		//List<Voleur> voleurs = new ArrayList();
		
		List<Guerrier> guerriers = new Vector();
		
		// contructeurs
		
		public Guerriers() {
			guerriers.add(new Guerrier("Thor", 90, 25));
			guerriers.add(new Guerrier("Achille", 85, 20));
			guerriers.add(new Guerrier("Leonidas", 80, 30));
		}
		
		// méthodes pour la logique métier Service qui le métier voleur
		
		public void addGuerrier(Guerrier g) {
			guerriers.add(g);
		}
		
		public int nbGuerriers() {
			return guerriers.size();
		}
		
		
		public void removeGuerrier(Guerrier g) {
			guerriers.remove(g);
		}
		
		public void displayGuerriers() {
			for(Guerrier g: guerriers) {
				System.out.println(g);
			}
		}


	}



