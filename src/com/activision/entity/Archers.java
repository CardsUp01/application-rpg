package com.activision.entity;

import java.util.List;
import java.util.Vector;
//import java.util.ArrayList;

public class Archers {
	
	//Attribut principal de la classe
	//List<Larcher> Larchers = new ArrayList();
	
	List<Archer> archers = new Vector();
	
	//Constructeur
	
	public Archers() {
		archers.add(new Archer("Artemis",35,5));
		archers.add(new Archer("Katniss",30,8));
		archers.add(new Archer("Oliver",40,3));
	}

	// méthodes pour la logique métier Service qui le métier Larcher
	
	private void addArcher(Archer a) {
		archers.add(a);
	}
		
		public int nbArchers() {
			return archers.size();
		}
		
		
		public void removeArcher(Archer a) {
			archers.remove(a);
		}
		
		public void displayArchers() {
			for(Archer a: archers) {
				System.out.println(a);
			}
		}		
	
}
