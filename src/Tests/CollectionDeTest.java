package Tests;

import DiceFramework.CollectionDe;
import DiceFramework.De;
import junit.framework.TestCase;

/**
 * @author anhe Pascal
 * @version 1.0
 */

public class CollectionDeTest extends TestCase {

    private CollectionDe tabDe = new CollectionDe();


    /**
     * Cette methode  va tester
     * la methode calculer de la classe
     * CollectionDe
     * @throws Exception
     */

    public void TestCalculer() throws Exception{

      for (int i= 0 ; i < 20 ; i++){
          tabDe.ajouter(new De(6));
          tabDe.ajouter(new De(7));
      }
    }
}
