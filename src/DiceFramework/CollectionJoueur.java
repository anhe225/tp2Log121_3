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
public class CollectionJoueur implements CollectionsJeu {
    
    private Joueur[] tabJoueur;
    private int indFin = 0;
    private int tailleIniTabJoueur;
    
    public CollectionJoueur(){
        
        this.tailleIniTabJoueur = 10;
        this.tabJoueur = new Joueur[tailleIniTabJoueur];
    }

    
    public void ajouter(Joueur j){
        this.tabJoueur[this.indFin] = j;
        this.indFin++;
        
        if(this.indFin == this.tabJoueur.length - 1){
            Joueur[] tabJoueur2 = new Joueur[this.tabJoueur.length + this.tailleIniTabJoueur];
            System.arraycopy(this.tabJoueur,0,tabJoueur2,0,this.tabJoueur.length);
            this.tabJoueur = tabJoueur2;
        }
    }
    
    
    @Override
    public Iterator creerIterateur() {
        return new JoueursIterator(this.tabJoueur);
    }


    public Joueur[] getTabJoueur() {
        return tabJoueur;
    }

    public void setTabJoueur(Joueur[] tabJoueur) {
        this.tabJoueur = tabJoueur;
    }

    public int getIndFin() {
        return indFin;
    }

    public void setIndFin(int indFin) {
        this.indFin = indFin;
    }

    public int getTailleIniTabJoueur() {
        return tailleIniTabJoueur;
    }

    public void setTailleIniTabJoueur(int tailleIniTabJoueur) {
        this.tailleIniTabJoueur = tailleIniTabJoueur;
    }
}
