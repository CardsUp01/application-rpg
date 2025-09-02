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
		//this.bourse = bourse;
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
		// TODO Auto-generated method stub
		
	}
	
	//création d'une méthode sans passer par l'instance qui fait combattre un personnage contre autre

}
