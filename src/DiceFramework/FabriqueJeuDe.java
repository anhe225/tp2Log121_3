/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceFramework;

/**
 *
 * @author Romy Steve
 */
public abstract class FabriqueJeuDe {
    public FabriqueJeuDe(){
    }

    public final Jeu creerUnJeu(int nbTour, int nbJoueur, IStrategieJeu strategieJeu){
        CollectionJoueur j = creerListJoueur(nbJoueur);
        return new Jeu(j, nbTour, strategieJeu);
    }

    protected abstract CollectionDe creerDes();
    protected abstract CollectionJoueur creerListJoueur(int nbJ);
}
