/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202230225
 */
public class Retiaire extends Personnage {
    
    String classPersonnage;
    
    public Retiaire(String nomP, int pointAttaque, int pointDefense, int pointDeVieP, int initiativeP) {
        super(nomP, pointAttaque, pointDefense, pointDeVieP, initiativeP);
        this.classPersonnage = "Retiaire";
    }
    
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classPersonnage);
    }
}
