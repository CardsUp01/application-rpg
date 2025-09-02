package com.activision.entity;

import java.util.List;
import java.util.Vector;

public class Magiciens {
	
	// attributs principal de la classe 
	
	List<Magicien> magiciens = new Vector<Magicien>();
	
	// constructeurs
	
	public Magiciens() {
		magiciens.add(new Magicien("Saruman", 65, 35));
		magiciens.add(new Magicien("Radagast", 55, 40));
		magiciens.add(new Magicien("Elrond", 70, 45));
	}
	
	// méthodes pour la logique métier Service qui le métier magicien
	
	public void addMagicien(Magicien m) {
		magiciens.add(m);
	}
	
	public int nbMagiciens() {
		return magiciens.size();
	}
	
	
	public void removeMagicien(Magicien m) {
		magiciens.remove(m);
	}
	
	public void displayMagiciens() {
		for (Magicien magicien : magiciens) {
			System.out.println(magicien);
		}
	}

}