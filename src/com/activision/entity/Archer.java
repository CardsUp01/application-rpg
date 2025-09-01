package com.activision.entity;

public class Archer extends Personnage{
	
	// attributs de l'archer
	private int fleches;
	
	// hp est compris 0 et 25

	public Archer() {
		super();
		
	}

	public Archer(String nomRempli, int hpRempli, int levelRempli) {
		super(nomRempli, hpRempli, levelRempli);
		// spécialisation du personnage de type Archer
		//this.fleches = fleches;
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
		ennemi.setHp(ennemi.getHp()-3);
		
	}

	@Override
	public void defendre() {
		// TODO Auto-generated method stub
		
	}
	
	//création d'une méthode sans passer par l'instance qui fait combattre un personnage contre autre
	
	public static void combat(Personnage p1, Personnage p2) {
		p1.attaquer(p2);
	}

}