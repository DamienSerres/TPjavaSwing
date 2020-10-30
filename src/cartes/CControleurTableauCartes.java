/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartes;

/**
 *
 * @author Damien
 */
public class CControleurTableauCartes {
    private JFrameCartes jFrameCartes;

    public void setjFrameCartes(JFrameCartes jFrameCartes) {
        this.jFrameCartes = jFrameCartes;
    }

    void piocheTableau() {
        this.afficheCarteTableauLigne0(Cartes.piocheUneCarte());
        
    }

    private void afficheCarteTableauLigne0(Cartes uneCarte) {
        this.jFrameCartes.getjTableAfficheCartes().setValueAt(uneCarte.getValeur(), 0, 0);
        this.jFrameCartes.getjTableAfficheCartes().setValueAt(uneCarte.getCouleur(), 0, 1);
        
    }
    
    
    
}
