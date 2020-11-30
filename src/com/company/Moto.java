package com.company;

// la classe n'est pas abstraite, nous pouvons donc créer des objets de type Moto
public class Moto extends VehiculeTerrestre {

    //////////////
    //  ATTRIBUT(S) //
    //  en plus de ceux de //
    //  la classe parente//
    //////////////
    protected int bequille;


    //////////////
    //  GETTER && SETTER //
    //////////////
    public int getBequille() {
        return bequille;
    }

    public void setBequille(int bequille) {
        this.bequille = bequille;
    }

    //////////////
    //  CONSTRUCTEURS //
    //////////////

    // Ici on ne redéfinit que le constructeur avec paramètres
    public Moto(String marque, double poids, String puissance, int bequille) {
        super(marque, poids, puissance);
        this.bequille = bequille;
    }

    // aucun traitement sur la méthode seDeplacer, c'est donc la méthode de la classe parente qui sera appelée

}
