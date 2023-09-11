/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author 202230225
 */
public class Mirmillon extends Personnage {
    
    String classPersonnage;

    public Mirmillon(String nomP, int pointAttaque, int pointDefense, int pointDeVieP, int initiativeP) {
        super(nomP, pointAttaque, pointDefense, pointDeVieP, initiativeP);
        this.classPersonnage = "Mirmillon";
    }
    
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classPersonnage);
    }
    
    @Override
    public void setNewInitiativeRandom() {
        
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;
        int nbRand = rand.nextInt(maxValue - minValue) + minValue;
        this.initiative = nbRand;
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
            
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPointDeVie() > 0){
            super.frapperPersonnage(personnageCible);
        }
        else{
            System.out.println("Bob décapite Igor avec son arme !!");
        }
    }
}

   
