/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Damien
 */
public class CControleurTableauCartes {

    private JFrameCartes jFrameCartes;

    public void setjFrameCartes(JFrameCartes jFrameCartes) {
        this.jFrameCartes = jFrameCartes;
    }

    /**
     * Méthode qui est utiliser par le bouton pioche une carte de la jFrame.
     */
    void piocheUneCarte() {
        this.ajouterCarteTableau(Cartes.piocheUneCarte());

    }

    /**
     * Affiche la carte dans la première ligne du tableau.
     * Attention, cette ligne doit exister avant.
     * @param uneCarte 
     */
    private void afficheCarteTableauLigne0(Cartes uneCarte) {
        this.jFrameCartes.getjTableAfficheCartes().setValueAt(uneCarte.getValeur(), 0, 0);
        this.jFrameCartes.getjTableAfficheCartes().setValueAt(uneCarte.getCouleur(), 0, 1);

    }

    /**
     * Prépare le model du tableau en DefaultTableModel pour avoir accès à la méthode
     * addRow() qui ajoute l'objet correspondant à une ligne passé en paramètre.
     * @param uneCarte 
     */
    private void ajouterCarteTableau(Cartes uneCarte) {
        DefaultTableModel model = (DefaultTableModel) this.jFrameCartes.getjTableAfficheCartes().getModel();
        model.addRow(new String[]{uneCarte.getValeur(), uneCarte.getCouleur()});
    }
}
