package com.activision.test;

import java.util.Scanner;

import com.activision.entity.Guerrier;
import com.activision.entity.Voleur;

public class PersonnageTest {

	public static void main(String[] args) {

		// Personnage perso1 = new Personnage("Perso1", 1234,45577);

		Voleur robin = new Voleur("robin des bois", 35, 45);

		System.out.println(robin);

		Voleur arsin = new Voleur("Arsin Lupin", 30, 45);

		robin.attaquer(arsin);

		System.out.println("veuillez choisir votre personnage, 0 : voleur, 1: Guerrier, 2: Magicien ");

		Scanner sc = new Scanner(System.in);
		
		int choix = sc.nextInt();
		System.out.println("hp");
		
		int hp = sc.nextInt();
		
		System.out.println("level"); 

		int level = sc.nextInt();

		String nom = sc.next();

		switch (choix) {
		case 0:
			System.out.println("instanciation d'un voleur");
			Voleur v1 = new Voleur(nom, hp, level);
			System.out.println(v1);
			break;

		case 1:
			System.out.println("instanciation d'un guerrier");
			Guerrier g1 = new Guerrier(nom, hp, level);
			System.out.println(g1);
			break;
		case 2:
			System.out.println("instanciation d'un magicien");
			break;

		default:
			break;
		}

		int choix1 = sc.nextInt();
		
		System.out.println("hp");
		
		int hp1 = sc.nextInt();
		
		System.out.println("level"); 

		int level1 = sc.nextInt();

		String nom1 = sc.next();


		switch (choix1) {
		case 0:
			System.out.println("instanciation d'un voleur");
			Voleur v1 = new Voleur(nom1, hp1, level1);
			System.out.println(v1);
			break;

		case 1:
			System.out.println("instanciation d'un guerrier");
			Guerrier g1 = new Guerrier(nom1, hp1, level1);
			System.out.println(g1);
			break;
		case 2:
			System.out.println("instanciation d'un magicien");
			break;

		default:
			break;
		}

	}

}
