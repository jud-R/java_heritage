package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("Voiture");
        System.out.println("-------------------");

        // création d'un objet Voiture avec le constructeur par défaut
        // Affectation de différentes valeurs à ses attributs
        Voiture voiture1 = new Voiture();
        voiture1.setMarque("BMW");
        voiture1.setNbRoues(4);
        voiture1.setNbPorte(5);
        voiture1.setPoids(1.2);
        voiture1.setPuissance("175cv");

        // appel  à ses fonctions
        //  ==> seDeplacer() héritée mais redéfinie dans la classe Voiture
        //  ==> coucou() qui est une fonction qui existe seulement dans la classe Voiture
        voiture1.seDeplacer();
        Voiture.coucou();


        /// avec constructeur défini dans Voiture
        Voiture voiture2 = new Voiture("VW", 1.4, "175CV", 5);
        voiture2.seDeplacer();

        System.out.println("-------------------");
        System.out.println("Moto");
        System.out.println("-------------------");

        // Instanciation d'un objet Moto
        Moto moto = new Moto("BMW", 0.4, "150cv", 1);
        // appel de la fonction seDeplacer() qui n'a pas été redéfinie dans la classe Moto
        // c'est donc la méthode telle qu'elle est définie dans la classe parente (ici la classe VehiculeTerrestre)
        //qui sera utilisée / appelée
        moto.seDeplacer();

        System.out.println("-------------------");
        System.out.println("Bateau");
        System.out.println("-------------------");

        // Instanciation d'un objet Bateau avec constructeur par défaut hérité de la classe parente Vehicule
        Bateau bateauTest = new Bateau();
        // appel de la fonction seDeplacer() qui a été réécrite dans la classe Bateau
        bateauTest.seDeplacer();

    }
}
