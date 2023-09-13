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
public class Retiaire extends Personnage {
    
    String classPersonnage;
    boolean possedeFilet = true;
    
    public Retiaire(String nomP, int pointAttaque, int pointDefense, int pointDeVieP, int initiativeP) {
        super(nomP, pointAttaque, pointDefense, pointDeVieP, initiativeP);
        this.classPersonnage = "Retiaire";
    }
    
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classPersonnage);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
            
        if (possedeFilet == true){
            System.out.println("Igor l'empaleur lance son filet...");
            Random rand = new Random();
            int minValue = 0;
            int maxValue = 10;
            int nbRand = rand.nextInt(maxValue - minValue) + minValue;
            if (nbRand == 5){
                System.out.println("Son filet attrape Bob le malchanceux et il l’empale sauvagement avec sa lance !");
                personnageCible.setPointDeVie(0);
            } 
            else{
                System.out.println("Le filet n'atteint pas sa cible ...");
                possedeFilet = false;
            }
        }
        else{
            System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
            possedeFilet = true;
        }
    }
}
