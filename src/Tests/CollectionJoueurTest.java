package Tests;

import DiceFramework.CollectionDe;
import DiceFramework.CollectionJoueur;
import DiceFramework.De;
import DiceFramework.Joueur;
import junit.framework.TestCase;


/**
 * @author anhe Pascal
 * @version 1.0
 */


public class CollectionJoueurTest extends TestCase {
    private CollectionJoueur tabJoueur = new CollectionJoueur();
    private Joueur j ;


    /**
     * Constructeur de la classe qui va
     * initialiser les parametres qui vont permettre de
     * tester les methodes de la classe CollectionJoeur
     */
    public CollectionJoueurTest()
    {
         CollectionDe tabDe = new CollectionDe();
        for (int i= 0 ; i < 20 ; i++){
            tabDe.ajouter(new De(6));
            tabDe.ajouter(new De(7));
        }
        j = new Joueur(tabDe);
    }


    /**
     * Cette methode  va tester
     * la methode calculer de la classe
     * CollectionJoeur
     * @throws Exception
     */


    private void TestCalculer() throws Exception{

        for (int i= 0 ; i < 7 ; i++){
            tabJoueur.ajouter(j);

        }
    }
}
