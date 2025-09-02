package com.activision.entity;

public abstract class Personnage {

	// ----------------------------------------
	// attributs
	// ----------------------------------------

	private String nom; // pas vide
	private int hp; // varie entre 0 et 100
	private int level; // varie entre 0 et 30 pour tous
	// private double jauge;

	// ---------------------------------------------------------
	// Constructeur = initilisation des attributs d'instance
	// -------------	-------------------------------------------- 
	// constructeur par défaut (vide)

	public Personnage() {

	}

	public Personnage(String nomRempli, int hpRempli, int levelRempli) {
		this.setNom(nomRempli);
		this.setHp(hpRempli);
		this.setLevel(levelRempli);
	}

	// --------------------------------------------------------------------------
	// GETTERS ET SETTERS accéder aux attributs et de modifier  
	// --------------------------------------------------------------------------

	public String getNom() {
		return nom;
	}

	public int getHp() {
		return hp;
	}

	public int getLevel() {
		return level;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// --------------------------------------------------------------------------
	// Méthodes métier 
	// --------------------------------------------------------------------------

	public abstract void attaquer(Personnage ennemi);
	
	public abstract void defendre();

	// --------------------------------------------------------------------------
	// toString pour décrire
	// --------------------------------------------------------------------------

	@Override
	// redéfinir la méthode pour qu'elle puisse m'(afficher le contenu des attributs initialisés
	public String toString() {
		// TODO Auto-generated method stub
		return " [nom:hp:level] " + this.nom + ":" + this.hp + ":" + this.level;
	}

}
