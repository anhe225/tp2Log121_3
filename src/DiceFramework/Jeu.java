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
public class Jeu {
    
    
    private final CollectionJoueur joueurs;
    private final int nbTours;
    private final IStrategieJeu strategieJeu;
    private int tourCourant;
    
    public Jeu(CollectionJoueur listJoueur, int nbT, IStrategieJeu strategie){
        this.tourCourant = 1;
        this.joueurs = listJoueur;
        this.nbTours = nbT;
        this.strategieJeu = strategie;
    }
    
    public void incrementnbTours(){
        if(this.tourCourant < this.nbTours){
            this.tourCourant++;
        }
    }
    
    public Boolean estFini(){
        if(this.tourCourant == this.nbTours){
            return true;
        }
        return false;
    }
    
    public int getnbTours(){
        return this.nbTours;
    }
    
    public CollectionJoueur getListJoueur(){
        return this.joueurs;
    }
    
    public void calculerScoreTour() {
        if(estFini()){
            throw new IllegalStateException("La partie est terminée");
        }

        this.strategieJeu.calculerScoreTour(this);
        this.incrementnbTours();
    }
    
    public Joueur calculerLeVainqueur(){
        return this.strategieJeu.calculerLeVainqueur(this);
    }
    
    
    
    
    
    
    
    
}
