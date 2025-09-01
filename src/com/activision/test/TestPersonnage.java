package com.activision.test;

import com.activision.entity.Archer;
import com.activision.entity.Voleur;

public class TestPersonnage {

	public static void main(String[] args) {
		// Test de la classe Archer
		System.out.println("=== Test Archer ===");
		
		// Création d'un archer
		Archer legolas = new Archer("Legolas", 35, 10);
		System.out.println("Archer créé: " + legolas);
		
		// Test des flèches
		legolas.setFleches(50);
		System.out.println("Nombre de flèches: " + legolas.getFleches());
		
		// Test de combat
		Voleur robin = new Voleur("Robin", 30, 8);
		System.out.println("\nAvant combat:");
		System.out.println("Legolas HP: " + legolas.getHp());
		System.out.println("Robin HP: " + robin.getHp());
		
		// Combat avec méthode statique
		Archer.combat(legolas, robin);
		System.out.println("\nAprès combat:");
		System.out.println("Robin HP: " + robin.getHp());
	}

}
