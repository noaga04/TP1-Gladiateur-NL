package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>
    String nom;
    int pointDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    
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
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    // TODO : Les setters
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
