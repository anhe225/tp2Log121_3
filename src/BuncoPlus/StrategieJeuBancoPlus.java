/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuncoPlus;

import DiceFramework.*;
import java.util.ArrayList;

/**
 *
 * @author Romy Steve
 */
public class StrategieJeuBancoPlus implements IStrategieJeu {

    @Override
    public void calculerScoreTour(Jeu jeu) {
        Boolean passerLaMain = false;
        int score = 0;
        if (jeu == null) {
            throw new IllegalStateException("Le jeu n'a pas encore commencé");
        }
        Iterator listeJoueurIterator = jeu.getListJoueur().creerIterateur();

        while (listeJoueurIterator.hasnext()) {
            Joueur joueur = (Joueur) listeJoueurIterator.next();
            do {
                Iterator listeDeIterator = joueur.roulerLesDes().creerIterateur();
                int[] tabNbFaceEgaux = this.nbFaceDesEgaux(listeDeIterator);
                if (tabNbFaceEgaux[0] == 1 && tabNbFaceEgaux[1] == jeu.getnbTours()) {
                    score += 1;
                    passerLaMain = false;
                } else if (tabNbFaceEgaux[0] == 2 && tabNbFaceEgaux[1] == jeu.getnbTours()) {
                    score += 2;
                    passerLaMain = false;
                } else if (tabNbFaceEgaux[0] == 3 && tabNbFaceEgaux[1] == jeu.getnbTours()) {
                    System.out.println("BUNCO!!!!");
                    score += 21;
                    passerLaMain = false;
                } else {
                    score += 0;
                    passerLaMain = true;
                }

                joueur.setPointJoueur(score);
            } while (!passerLaMain);
        }

    }

    private int[] nbFaceDesEgaux(Iterator listDes) {
        int nbFaceEgaux = 0;
        int noFace = 0;
        int[] tabNbFaceEgaux = new int[2];
        ArrayList arrListDe = new ArrayList<De>();
        while (listDes.hasnext()) {
            De de = (De) listDes.next();
            arrListDe.add(de);
        }
        if (arrListDe.size() > 0) {
            nbFaceEgaux = 1;
            De de = (De) arrListDe.get(0);
            for (int i = 1; i < arrListDe.size(); i++) {
                if (de.compareTo((De) arrListDe.get(i)) == 0) {
                    nbFaceEgaux++;
                    noFace = (int) de.getValeurCourantDe();
                }
            }
        }
        tabNbFaceEgaux[0] = nbFaceEgaux;
        tabNbFaceEgaux[1] = noFace;
        return tabNbFaceEgaux;
    }

    @Override
    public Joueur calculerLeVainqueur(Jeu jeu) {
        Joueur vainqueur = null;
        Iterator listeJoueurIterator = jeu.getListJoueur().creerIterateur();
        ArrayList arrListJoueur = new ArrayList<Joueur>();
        while (listeJoueurIterator.hasnext()) {
            Joueur joueur = (Joueur) listeJoueurIterator.next();
            arrListJoueur.add(joueur);
        }
        if (arrListJoueur.size() > 0) {
            vainqueur = (Joueur) arrListJoueur.get(0);
            for (int i = 1; i < arrListJoueur.size(); i++) {
                if (vainqueur.compareTo((Joueur) arrListJoueur.get(i)) == 1) {
                    vainqueur = (Joueur) arrListJoueur.get(i);
                }
            }
        }

        return vainqueur;
    }

}
