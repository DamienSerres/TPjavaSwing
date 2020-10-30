/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartes;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Damien
 */
public class Cartes {

    final static String[] valeurs
            = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet",
                "Dame", "Roi"};
    final static String[] couleurs
            = {"Pique", "Coeur", "Trèfle", "Carreau"};

    private String valeur;
    private String couleur;

    public Cartes(String valeur, String couleur) {
        this.setValeur(valeur);
        this.setCouleur(couleur);
    }

    public Cartes() {
        Random rnd = new Random();
        this.setCouleur(Cartes.couleurs[rnd.nextInt(Cartes.couleurs.length)]);
        this.setValeur(Cartes.valeurs[rnd.nextInt(Cartes.valeurs.length)]);
    }

    public void setValeur(String valeur) {
        if (Arrays.asList(Cartes.valeurs).contains(valeur)) {
            this.valeur = valeur;
        } else {
            System.out.println("Valeur impossible.");
            JOptionPane.showMessageDialog(null, "Valeur impossible.");
        }
    }

    public void setCouleur(String couleur) {
        if (Arrays.asList(Cartes.couleurs).contains(couleur)) {
            this.couleur = couleur;
        } else {
            System.out.println("Couleur impossible.");
            JOptionPane.showMessageDialog(null, "Couleur impossible.");
        }
    }

    public static Cartes piocheUneCarte() {
        return new Cartes();
    }

    @Override
    public String toString() {
        String str = this.valeur + " de " + this.couleur;
        return str;
    }

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Coucou");
        //Cartes test = new Cartes();
        //test.setValeur("2");
        //test.setValeur("68");
        //test.setCouleur("Carreau");
        //test.setCouleur("Fleur des champs");

        System.out.println(Cartes.piocheUneCarte());

    }
}
