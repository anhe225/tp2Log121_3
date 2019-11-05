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
public class JoueursIterator implements Iterator {
    
    Joueur[] joueurs;
    int position= 0;
    
    public JoueursIterator(Joueur[] listjoueurs){
        this.joueurs = listjoueurs;
    }
    
    
    @Override
    public Boolean hasnext() {
        if(this.position>= this.joueurs.length || this.joueurs[this.position] == null){   
            return false;
        } else {
            return true; 
        }
    }

    @Override
    public Object next() {
        Joueur j = this.joueurs[this.position];
        this.position = this.position+ 1;
        return j;
    }
    
}
