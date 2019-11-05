package Tests;

import DiceFramework.CollectionDe;
import DiceFramework.De;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * @author anhe Pascal
 * @version 1.0
 */

public class CollectionDeTest  {

    private CollectionDe tabDe = new CollectionDe();


    /**
     * Cette methode  va tester
     * la methode calculer de la classe
     * CollectionDe
     * @throws Exception
     */

    @Test
    public void TestCalculer() throws Exception{

      for (int i= 0 ; i < 20 ; i++){
          tabDe.ajouter(new De(6));
          tabDe.ajouter(new De(7));
      }

        assertTrue(tabDe.getTabDe().length>10);
    }
}
