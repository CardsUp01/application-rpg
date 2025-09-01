package com.activision.entity;

import java.util.ArrayList;
import java.util.List;

public class Magiciens {

    // Attribut principal : la liste de magiciens
    private List<Magicien> magiciens = new ArrayList<>();

    // ---------------------------------------------------------
    // Constructeur
    // ---------------------------------------------------------
    public Magiciens() {
        magiciens.add(new Magicien("Gandalf", 100, 10, 80));
        magiciens.add(new Magicien("Merlin", 90, 12, 70));
        magiciens.add(new Magicien("Saroumane", 95, 11, 60));
    }

    // ---------------------------------------------------------
    // Méthodes métier
    // ---------------------------------------------------------

    // Ajouter un magicien
    public void addMagicien(Magicien m) {
        magiciens.add(m);
    }

    // Supprimer un magicien
    public void removeMagicien(Magicien m) {
        magiciens.remove(m);
    }

    // Nombre de magiciens
    public int nbMagiciens() {
        return magiciens.size();
    }

    // Afficher tous les magiciens
    public void displayMagiciens() {
        for (Magicien m : magiciens) {
            System.out.println(m);
        }
    }

    // Trouver un magicien par son nom
    public Magicien findByName(String nom) {
        for (Magicien m : magiciens) {
            if (m.getNom().equalsIgnoreCase(nom)) {
                return m;
            }
        }
        return null;
    }

    // Récupérer un magicien par index
    public Magicien getMagicien(int index) {
        if (index >= 0 && index < magiciens.size()) {
            return magiciens.get(index);
        }
        return null;
    }
}

































