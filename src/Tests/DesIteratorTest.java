package Tests;

import DiceFramework.De;
import DiceFramework.DesIterator;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DesIteratorTest {


    @Test
    public void TestDesIterator()
    {
         De [] tabde  = new De[6];
         for (int i=0;i < 6;i++){
            tabde[i]= new De(i+1);
         }

        DesIterator desi = new DesIterator(tabde);

        assertTrue(desi.getDes().length>0);

    }
}
