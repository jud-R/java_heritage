package com.company;

// classe définie comme abstraite, elle ne pourra donc pas être instanciée. Pas d'objet de type VehiculeTerrestre
public abstract class VehiculeTerrestre extends Vehicule {
    //////////////
    //  ATTRIBUT(S) //
    //  en plus de ceux de //
    //  la classe parente//
    //////////////
    protected int nbRoues;

    //////////////
    //  CONSTRUCTEURS //
    //////////////
    // constructeur par défaut
    public VehiculeTerrestre() {
    }

    // constructeur avec paramètres
    public VehiculeTerrestre(String marque, double poids, String puissance) {
        // ici on fait appel au constructeur de la classe parente (c'est à dire de la classe Vehicule qui est la classe
        // que l'on étend  ==> public abstract class VehiculeTerrestre extends Vehicule
        // Cet appel au constructeur parent se fait par l'intermédiaire du mot clé super();
        // ici le contructeur parent prend 3 paramètres, il faut donc les fournir à la méthode super()
        // qui récupérera donc pour marque, poids et puissance les arguments passés à VehiculeTerrestre,
        // arguments qui dans notre exemple se nomment également marque poids et puissance
        // mais ce n'est pas obligatoire, les noms peuvent être différents, l'important étant la clarté du code
        super(marque, poids, puissance);
    }


    //////////////
    //  GETTER && SETTER //
    //////////////
    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }


    //////////////
    //  METHODE(S) //
    //////////////

    // Dans notre classe VehiculeTerrestre, on souhaite réécrire la méthode seDeplacer() contenue dans notre classe
    // parente.
    // On pourrait simplement changer sa définition, c'est à dire la partie entre les accolades qui explique
    // ce que doit faire la méthode. (voir classe Bateau)
    // On peut également comme c'est le cas dans notre exemple, reprendre le fonctionnement de la méthode parente
    // et y ajouter de nouveaux traitements, de nouvelles instructions.
    // Pour ce faire, il faudra faire appel à la méthode parente en utilisant une nouvelle fois le mot clé super
    // mais cette fois-ci, il faudra y accoler un point . , et préciser le nom de la méthode.
    // Dans notre exemple nous travaillons sur la méthode seDeplacer() il faut donc écrire super.seDeplacer()
    // Ensuite, nous pouvons ajouter notre ou nos nouvelle(s) instruction(s)
    // Quand on réécrit la définition d'une méthode héritée, on parle d'Override d'une méthode
    // le @Override ci dessous est une sorte de commentaire spécial offert par Java
    // Il est facultatif mais très pratique car il offre un indicateur visuel sur ce que nous avons modifié d'une
    // classe parente
    @Override
    protected void seDeplacer() {
        super.seDeplacer();
        System.out.println("mais je préfère rester sur terre perso");
    }
}
