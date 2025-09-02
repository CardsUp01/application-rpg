package com.activision.entity;

public class Archer extends Personnage {
	
	// Attributs de l'archer
	private int fleches;
	
	// Constructeurs
	public Archer() {
		super();
	}

	public Archer(String nomRempli, int hpRempli, int levelRempli) {
		super(nomRempli, hpRempli, levelRempli);
	}
	
	// Getters et Setters
	public int getFleches() {
		return fleches;
	}

	public void setFleches(int fleches) {
		this.fleches = fleches;
	}
	
	// Méthodes
	@Override
	public void setHp(int hp) {
		if (hp >= 0 && hp <= 40) {
			super.setHp(hp);
		} else {
			throw new IllegalArgumentException("la valeur de hp n'est pas valide");
		}
	}

	@Override
	public void attaquer(Personnage ennemi) {
		ennemi.setHp(ennemi.getHp() - 3);
	}

	@Override
	public void defendre() {
		// Défense: recul tactique, récupère 1 HP et gagne une flèche
		setHp(getHp() + 1);
		fleches += 1;
	}
	
	// Méthode statique de combat
	public static void combat(Personnage p1, Personnage p2) {
		p1.attaquer(p2);
	}
}