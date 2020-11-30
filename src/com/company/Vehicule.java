package com.company;

// classe définie comme abstraite, elle ne pourra donc pas être instanciée. Pas d'objet de type Vehicule
public abstract class Vehicule {

    //////////////
    //  ATTRIBUT(S) //
    //////////////
    protected String marque;
    protected double poids;
    protected String puissance;

    //////////////
    //  CONSTRUCTEURS //
    //////////////

    // constructeur par défaut
    public Vehicule() {
    }


    // constructeur avec paramètres
    public Vehicule(String marque, double poids, String puissance) {
        this.marque = marque;
        this.poids = poids;
        this.puissance = puissance;
    }

    //////////////
    //  GETTER && SETTER //
    //////////////

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }


    //////////////
    //  METHODE(S) //
    //////////////
    protected void seDeplacer() {

        System.out.println("je me déplace");
    }

}
