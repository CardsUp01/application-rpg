package com.activision;

import java.util.Scanner;
import com.activision.entity.*;

public class GameMain {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("=== Bienvenue dans le RPG ===\n");
		
		// Création des personnages
		Personnage joueur = creerPersonnage();
		Personnage ennemi = creerEnnemiAleatoire();
		
		System.out.println("\n=== Combat ===\n");
		System.out.println("Votre personnage: " + joueur);
		System.out.println("Ennemi: " + ennemi);
		
		// Combat simple
		combatSimple(joueur, ennemi);
		
		scanner.close();
	}
	
	/**
	 * Permet au joueur de créer son personnage
	 */
	private static Personnage creerPersonnage() {
		System.out.println("Choisissez votre classe:");
		System.out.println("1. Guerrier");
		System.out.println("2. Voleur");
		System.out.println("3. Archer");
		System.out.println("4. Magicien");
		System.out.print("Votre choix (1-4): ");
		
		int choix = scanner.nextInt();
		scanner.nextLine(); // Consommer la ligne
		
		System.out.print("Nom de votre personnage: ");
		String nom = scanner.nextLine();
		
		switch (choix) {
			case 1:
				return new Guerrier(nom, 60, 1);
			case 2:
				return new Voleur(nom, 40, 1);
			case 3:
				return new Archer(nom, 40, 1);
			case 4:
				return new Magicien(nom, 50, 1);
			default:
				System.out.println("Choix invalide, Guerrier par défaut.");
				return new Guerrier(nom, 60, 1);
		}
	}
	
	/**
	 * Crée un ennemi aléatoire
	 */
	private static Personnage creerEnnemiAleatoire() {
		int type = (int) (Math.random() * 4) + 1;
		String[] noms = {"Gobelin", "Orc", "Bandit", "Sorcier"};
		
		switch (type) {
			case 1:
				return new Guerrier(noms[0], 50, 1);
			case 2:
				return new Voleur(noms[1], 35, 1);
			case 3:
				return new Archer(noms[2], 35, 1);
			case 4:
				return new Magicien(noms[3], 45, 1);
			default:
				return new Guerrier("Ennemi", 50, 1);
		}
	}
	
	/**
	 * Combat simple entre deux personnages
	 */
	private static void combatSimple(Personnage joueur, Personnage ennemi) {
		while (joueur.getHp() > 0 && ennemi.getHp() > 0) {
			System.out.println("\n--- Tour de combat ---");
			System.out.println("Votre HP: " + joueur.getHp());
			System.out.println("HP ennemi: " + ennemi.getHp());
			
			System.out.println("\n1. Attaquer");
			System.out.println("2. Défendre");
			System.out.print("Votre choix: ");
			
			int choix = scanner.nextInt();
			
			if (choix == 1) {
				System.out.println("Vous attaquez!");
				joueur.attaquer(ennemi);
			} else {
				System.out.println("Vous vous défendez!");
				joueur.defendre();
			}
			
			if (ennemi.getHp() <= 0) {
				break;
			}
			
			// Ennemi attaque
			System.out.println("L'ennemi vous attaque!");
			ennemi.attaquer(joueur);
		}
		
		if (joueur.getHp() > 0) {
			System.out.println("\nVous avez gagné!");
		} else {
			System.out.println("\nVous avez perdu...");
		}
	}
}