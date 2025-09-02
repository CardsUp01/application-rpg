package com.activision.entity;

public class Guerrier extends Personnage {

	public Guerrier(String nom, int hp, int level) {
		super(nom, hp, level);
	}

	@Override
	public void attaquer(Personnage ennemi) {
		// Attaque simple: 5 dégâts
		ennemi.setHp(ennemi.getHp() - 5);
	}

	@Override
	public void defendre() {
		// Défense simple: récupère 2 HP
		setHp(getHp() + 2);
	}
}
