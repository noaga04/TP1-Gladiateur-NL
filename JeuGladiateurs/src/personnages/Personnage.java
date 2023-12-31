package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    String nom;
    int pointDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>
 
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointDeVie = pvs;
        this.initiative = ini;
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        this.nom = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointDeVie = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    

    public int getInitiative() {
        return initiative;
    }

    public String getNom() {
        return nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }
    
    // TODO : Les setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        
        System.out.println("\n" + nom);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Défense : " + valeurDefense);
        System.out.println("    Points de vie : " + pointDeVie);
        System.out.println("    Initiative : " + initiative);
        if ( pointDeVie <= 0){
            System.out.println("    statut : Mort");
        }
        else{
            System.out.println("    statut : Vivant");
        }
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        Random rand = new Random();
        int minValue = 0;
        int maxValue = valeurMaxAttaque;
        int attaqueRandom = rand.nextInt(maxValue - minValue) + minValue;
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return attaqueRandom;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceDeFrappe = attaqueCalcul();
        int defense = personnageCible.valeurDefense;
        int dommage = forceDeFrappe - defense;
        if (dommage < 0){
            dommage = 0;
        }
        //modifier les points de vie du personnage cible, afficher les détails
        personnageCible.pointDeVie = personnageCible.pointDeVie - dommage;
        if(personnageCible.pointDeVie < 0){
            personnageCible.pointDeVie = 0;
        }
        
        System.out.println();
        System.out.println(nom + " attaque avec la puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une défense de :" + defense);
        System.out.println("Les dommages sont donc de  : " + dommage);
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 100;
        int nbRand = rand.nextInt(maxValue - minValue) + minValue;
        this.initiative = nbRand;
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
    }
    // </editor-fold>
}
