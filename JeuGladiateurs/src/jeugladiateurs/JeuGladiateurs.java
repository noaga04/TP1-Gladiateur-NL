package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;


public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Mirmillon("Bob le malchanceux", 15, 15,70,15);
    Personnage Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();

    // </editor-fold>

    // code temporaire

    // fin code temporaire
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    while (Bob.getPointDeVie() != 0 && Igor.getPointDeVie() != 0){
        tour.afficheTour();
        for (int i = 0; i < 101; i++) {
            if (i == Bob.getInitiative()){
                Bob.frapperPersonnage(Igor);
                if ( Igor.getPointDeVie() == 0){
                    break;
                }
                Igor.frapperPersonnage(Bob);
                if ( Bob.getPointDeVie() == 0){
                    break;
                }
                break;
            }
            if (i == Igor.getInitiative()){
                Igor.frapperPersonnage(Bob);
                if ( Bob.getPointDeVie() == 0){
                    break;
                }
                Bob.frapperPersonnage(Igor);
                if ( Igor.getPointDeVie() == 0){
                    break;
                }
                break;
            }
        }
    affichage.afficherSeparateurInfosPerso();
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    Bob.setNewInitiativeRandom();
    Igor.setNewInitiativeRandom();
    tour.augmenteTour();
    affichage.afficherSeparateurDeTour();
    }

    // TODO : Après la boucle, afficher le résultat du combat
    affichage.afficheVictoire(Igor, Bob);
    // </editor-fold>
    }

}
