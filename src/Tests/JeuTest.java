package Tests;

import DiceFramework.CollectionDe;
import DiceFramework.De;
import DiceFramework.Jeu;
import DiceFramework.Joueur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JeuTest {

    private Jeu jeu = new Jeu();
    private CollectionDe cDe = new CollectionDe();

    private Joueur joueur ;

    @Test
    void incrementnbTours() {
        cDe.setTabDe(getTabDe());
        joueur= new Joueur(cDe);
        int x =jeu.getTourCourant();
        assertTrue(x >1);
    }

    @org.junit.jupiter.api.Test
    void estFini() {
    }

    @org.junit.jupiter.api.Test
    void getnbTours() {
    }

    @org.junit.jupiter.api.Test
    void getListJoueur() {
    }

    @org.junit.jupiter.api.Test
    void calculerScoreTour() {
    }

    @org.junit.jupiter.api.Test
    void calculerLeVainqueur() {
    }

    public De [] getTabDe (){
        De [] tabde  = new De[6];
        for (int i=0;i < 6;i++){
            tabde[i]= new De(i+1);
        }

        return  tabde;


    }
}