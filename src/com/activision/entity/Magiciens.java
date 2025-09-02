package com.activision.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Magiciens {

	//Attribut principal de la classe
		//List<Larcher> Larchers = new ArrayList();
		
		List<Magicien> magiciens = new Vector();
		
		//Constructeur
		
		public Magiciens() {
			magiciens.add(new Magicien("Saruman", 65, 35));
			magiciens.add(new Magicien("Radagast", 55, 40));
			magiciens.add(new Magicien("Elrond", 70, 45));
		}

		// méthodes pour la logique métier Service qui le métier Larcher
		
		private void addArcher(Magicien m) {
			magiciens.add(m);
		}
			
			public int nbMagiciens() {
				return magiciens.size();
			}
			
			
			public void removeArcher(Magicien m) {
				magiciens.remove(m);
			}
			
			public void displayMagiciens() {
				for(Magicien m: magiciens) {
					System.out.println(m);
				}
			}		
}