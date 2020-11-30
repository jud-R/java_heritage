package com.company;

// la classe n'est pas abstraite, nous pouvons donc créer des objets de type Voiture
public class Voiture extends VehiculeTerrestre  {

    //////////////
    //  ATTRIBUT(S) //
    //  en plus de ceux de //
    //  la classe parente//
    //////////////
    protected int nbPorte;

    //////////////
    //  CONSTRUCTEURS //
    //////////////
    // constructeur par défaut
    public Voiture() {
        super();
    }

    // constructeur avec paramètres
    // pour les explications sur le mot clé super, voir la classe VehiculeTerrestre
    // Dans notre constructeur, nous souhaitons ajouter l'utilisation de notre nouvel attribut nbPorte
    // Nous le passons donc en paramètre de notre contructeur Voiture
    // Dans la définition de notre constructeur Voiture, nous faisons appel au constructeur de la classe parente
    // en lui passant les paramètres attendus à savoir une marque, une puissance et un poids.
    // Nous ajoutons ensuite le nouvel attribut comme nous le faisons habituellement this.nbPorte = nbPorte;
    public Voiture(String marque, double poids, String puissance, int nbPorte) {
        super(marque, poids, puissance);
        this.nbPorte = nbPorte;
    }

    //////////////
    //  GETTER && SETTER //
    //////////////
    public int getNbPorte() {
        return nbPorte;
    }

    public void setNbPorte(int nbPorte) {
        this.nbPorte = nbPorte;
    }

    // une classe fille peut bien sûr définir de nouvelles méthodes
    // méthode propre à la classe Voiture (et ses classe filles si la classe voiture venait à en avoir)
    public static void coucou() {
        System.out.println("coucou");
    }

    // comme pour la classe VehiculeTerrestre réécriture de la méthode seDeplacer() qui récupère la méthode
    //  de la classe parente avec le mot clé super ==> super.seDeplacer() et y ajoute une instruction
    @Override
    protected void seDeplacer() {
        super.seDeplacer();
        System.out.println(" et j'abime mes pneus");
    }
}
