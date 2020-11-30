package com.company;

// la classe n'est pas abstraite, nous pouvons donc créer des objets de type Bateau
public class Bateau extends Vehicule {


    // Ici on n'ajoute aucun attribut
    //  ==> même attribut(s) que la classe parente

    // Ici on ne redéfinit aucun constructeur
    //  ==> les constructeurs de la classe parente seront donc utilisés car non redéfinis

    // on rédéfinit la méthode seDeplacer sans reprendre ce qui a été déclaré dans la méthode Vehicule
    // c'est à dire qu'on ne fait pas appel à la méthode super.seDeplacer();
    // on réécrit complétement sa définition, son comportement.
    @Override
    protected void seDeplacer() {
        System.out.println("l'eau ça mouille");
    }
}
