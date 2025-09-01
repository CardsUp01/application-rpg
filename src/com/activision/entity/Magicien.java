package com.activision.entity;

public class Magicien extends Personnage {

    // ----------------------------------------
    // Attributs spécifiques au Magicien
    // ----------------------------------------
    private int mana; // énergie magique (0 à 100)

    // ---------------------------------------------------------
    // Constructeurs
    // ---------------------------------------------------------
    public Magicien() {
        super();
        this.mana = 50; // valeur par défaut
    }

    public Magicien(String nom, int hp, int level, int mana) {
        super(nom, hp, level);
        this.setMana(mana);
    }

    // --------------------------------------------------------------------------
    // Redéfinition des méthodes abstraites
    // --------------------------------------------------------------------------

    @Override
    public void attaquer(Personnage ennemi) {
        System.out.println(getNom() + " attaque " + ennemi.getNom() + " avec une attaque magique !");
        ennemi.subirDegats(10); // attaque basique
    }

    @Override
    public void defendre() {
        System.out.println(getNom() + " se protège avec un bouclier magique !");
    }

    // --------------------------------------------------------------------------
    // Méthodes spécifiques au Magicien
    // --------------------------------------------------------------------------

    public void lancerSort(Personnage ennemi, String sort, int coutMana, int degats) {
        if (mana >= coutMana) {
            System.out.println(getNom() + " lance le sort " + sort + " sur " + ennemi.getNom() + " !");
            ennemi.subirDegats(degats);
            mana -= coutMana;
            System.out.println("Mana restant : " + mana);
        } else {
            System.out.println(getNom() + " n’a pas assez de mana pour lancer " + sort + " !");
        }
    }

    public void regenererMana(int quantite) {
        mana += quantite;
        if (mana > 100) {
            mana = 100;
        }
        System.out.println(getNom() + " régénère " + quantite + " mana ! Mana actuel : " + mana);
    }

    // --------------------------------------------------------------------------
    // Getters et Setters
    // --------------------------------------------------------------------------

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else if (mana > 100) {
            this.mana = 100;
        } else {
            this.mana = mana;
        }
    }

    // --------------------------------------------------------------------------
    // toString
    // --------------------------------------------------------------------------

    @Override
    public String toString() {
        return super.toString() + " [mana: " + this.mana + "]";
    }
}