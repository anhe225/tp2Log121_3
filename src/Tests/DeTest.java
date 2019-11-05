package Tests;

import DiceFramework.De;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DeTest  {

    private De monDe;
    private  int nbFace = 6;
    public DeTest(){
        monDe = new De(nbFace);

    }


    @Test
    public void TestroulerDe () throws Exception{
        int valeur = monDe.getValeurCourantDe();
        monDe.roulerDe();
        assertTrue(monDe.getValeurCourantDe()!= valeur);
    }


    @Test
    public void TestgetNbreDeFaces() throws Exception {
        assertTrue(monDe.getNbreDeFaces()> 0 && monDe.getNbreDeFaces()<7);
    }
}
