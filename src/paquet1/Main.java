/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import cartes.CControleurTableauCartes;
import cartes.JFrameCartes;

/**
 *
 * @author Damien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Création des objets
        CControleurTableauCartes controleur = new CControleurTableauCartes();
        JFrameCartes jFrame = new JFrameCartes();

        //Mise en relation des objets
        jFrame.setControleurTableauCartes(controleur);
        controleur.setjFrameCartes(jFrame);
        
        jFrame.setVisible(true);
    }
    
}
