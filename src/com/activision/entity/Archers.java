package com.activision.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Archers {
	
	
	// attributs pricipal de la classe 
	
	//List<Archer> archers = new ArrayList();
	
	List<Archer> archers = new Vector();
	
	// contructeurs
	
	public Archers() {
		archers.add(new Archer("Robin des bois",23,0 ));
		archers.add(new Archer("Legolas",23,0 ));
		archers.add(new Archer("Hawkeye",23,0 ));
	}
	
	// méthodes pour la logique métier Service qui le métier archer
	
	public void addArcher(Archer a) {
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