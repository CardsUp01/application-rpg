package com.activision.entity;

public class Voleur extends Personnage{
	
	// attributs du voleur
	private int bourse;
	
	// hp est compris 0 et 25

	public Voleur() {
		super();
		
	}

	public Voleur(String nomRempli, int hpRempli, int levelRempli) {
		super(nomRempli, hpRempli, levelRempli);
		// spécialisation du personnage de type Voleur
		this.bourse = 10; // Initialisation de la bourse
	}
	
	// Getter pour la bourse
	public int getBourse() {
		return bourse;
	}
	
	@Override
	public void setHp(int hp) {
		if(hp>=0 && hp<=40) {
		      super.setHp(hp);
		}else {
			throw new IllegalArgumentException("la valeur de hp n'est pas valide");
		}
	}

	@Override
	public void attaquer(Personnage ennemi) {
		ennemi.setHp(ennemi.getHp()-2);
		
	}

	@Override
	public void defendre() {
		// Défense simple: récupère 1 HP et augmente la bourse
		setHp(getHp() + 1);
		bourse += 1;
	}
	
	//création d'une méthode sans passer par l'instance qui fait combattre un personnage contre autre

}
