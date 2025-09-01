package com.activision.test;

import com.activision.entity.Magicien;
import com.activision.entity.Magiciens;

public class TestMagiciens {

    public static void main(String[] args) {

        // Création du service de magiciens
        Magiciens serviceMagiciens = new Magiciens();

        // Nombre initial de magiciens
        System.out.println("Nombre de magiciens au départ : " + serviceMagiciens.nbMagiciens());

        // Affichage de tous les magiciens
        System.out.println("\nListe des magiciens :");
        serviceMagiciens.displayMagiciens();

        // Ajout d’un nouveau magicien
        Magicien harry = new Magicien("Harry Potter", 80, 5, 50);
        serviceMagiciens.addMagicien(harry);

        System.out.println("\nAprès ajout de Harry Potter :");
        serviceMagiciens.displayMagiciens();

        // Recherche d’un magicien par nom
        Magicien recherche = serviceMagiciens.findByName("Merlin");
        if (recherche != null) {
            System.out.println("\nRecherche de Merlin : " + recherche);
        } else {
            System.out.println("\nMerlin n’a pas été trouvé.");
        }

        // Suppression d’un magicien
        serviceMagiciens.removeMagicien(harry);
        System.out.println("\nAprès suppression de Harry Potter :");
        serviceMagiciens.displayMagiciens();

        // Test d’une attaque et d’un sort
        Magicien gandalf = serviceMagiciens.findByName("Gandalf");
        Magicien merlin = serviceMagiciens.findByName("Merlin");

        if (gandalf != null && merlin != null) {
            System.out.println("\nGandalf attaque Merlin :");
            gandalf.attaquer(merlin);

            System.out.println("\nGandalf lance un sort sur Merlin :");
            gandalf.lancerSort(merlin, "Boule de feu", 20, 30);
        }
    }
}