package com.activision.entity;

public abstract class Personnage {

    // ----------------------------------------
    // Attributs
    // ----------------------------------------
    private String nom;   // pas vide
    private int hp;       // varie entre 0 et 100
    private int level;    // varie entre 0 et 30 pour tous

    // ---------------------------------------------------------
    // Constructeurs
    // ---------------------------------------------------------

    // Constructeur par défaut
    public Personnage() {
    }

    // Constructeur avec paramètres
    public Personnage(String nomRempli, int hpRempli, int levelRempli) {
        this.setNom(nomRempli);
        this.setHp(hpRempli);
        this.setLevel(levelRempli);
    }

    // --------------------------------------------------------------------------
    // Getters et Setters
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
        // bornes : min 0, max 100
        if (hp < 0) {
            this.hp = 0;
        } else if (hp > 100) {
            this.hp = 100;
        } else {
            this.hp = hp;
        }
    }

    public void setLevel(int level) {
        // bornes : min 0, max 30
        if (level < 0) {
            this.level = 0;
        } else if (level > 30) {
            this.level = 30;
        } else {
            this.level = level;
        }
    }

    // --------------------------------------------------------------------------
    // Méthodes métier
    // --------------------------------------------------------------------------

    public abstract void attaquer(Personnage ennemi);

    public abstract void defendre();

    // Tous les personnages peuvent subir des dégâts
    public void subirDegats(int degats) {
        this.hp -= degats;
        if (this.hp < 0) {
            this.hp = 0; // empêche d’avoir des HP négatifs
        }
        System.out.println(this.nom + " subit " + degats + " dégâts ! HP restants : " + this.hp);
    }

    // Tous les personnages peuvent être soignés
    public void soigner(int soin) {
        this.hp += soin;
        if (this.hp > 100) {
            this.hp = 100; // limite max
        }
        System.out.println(this.nom + " récupère " + soin + " HP ! HP actuels : " + this.hp);
    }

    // --------------------------------------------------------------------------
    // toString
    // --------------------------------------------------------------------------

    @Override
    public String toString() {
        return " [nom:hp:level] " + this.nom + ":" + this.hp + ":" + this.level;
    }
}
