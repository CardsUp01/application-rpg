package com.activision.entity;

public class Magicien extends Personnage {

	public Magicien(String nomRempli, int hpRempli, int levelRempli) {
		super(nomRempli, hpRempli, levelRempli);
	}

	@Override
	public void attaquer(Personnage ennemi) {
		// Attaque magique simple: 3 dégâts
		ennemi.setHp(ennemi.getHp() - 3);
	}

	@Override
	public void defendre() {
		// Défense magique: récupère 3 HP
		setHp(getHp() + 3);
	}
}
