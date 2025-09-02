package com.activision.entity;

import java.util.List;
import java.util.Vector;

public class Guerriers {
	
	// attributs principal de la classe 
	
	List<Guerrier> guerriers = new Vector<Guerrier>();
	
	// constructeurs
	
	public Guerriers() {
		guerriers.add(new Guerrier("Thor", 90, 25));
		guerriers.add(new Guerrier("Achille", 85, 20));
		guerriers.add(new Guerrier("Leonidas", 80, 30));
	}
	
	// méthodes pour la logique métier Service qui le métier guerrier
	
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
		for (Guerrier guerrier : guerriers) {
			System.out.println(guerrier);
		}
	}

}