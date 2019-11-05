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
public class Joueur implements Comparable<Joueur> {

    private String name;
    private int point;
    private CollectionDe des;

    public Joueur(CollectionDe listdes) {
        if (des == null) {
            throw new IllegalArgumentException("Les dés n'existent pas");
        }

        this.des = listdes;
    }

    public int getPointJoueur() {
        return this.point;
    }
    
    public void setPointJoueur(int pt){
        this.point += pt;
    }

    public CollectionDe roulerLesDes() {
        Iterator DesIterator = des.creerIterateur();
        while (DesIterator.hasnext()) {
            De de = (De) DesIterator.next();
            de.roulerDe();
        }
        return des;
    }

    public void incrementPoint(int pts) {
        if (pts < 0) {
            throw new IllegalArgumentException("Les points doivent être supérieure à 1");
        }

        this.point += pts;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Compare un joueur avec un autre
     *
     * @param j Joueur à comparer
     * @return -1 si le joueur "j" a plus de point 0 si le joueur "j" a le même
     * point 1 si le joueur "j" a moins de point
     */
    @Override
    public int compareTo(Joueur j) {
        if (j == null) {
            throw new IllegalArgumentException("Le joueur j est null");
        }

        return ((Integer) this.point).compareTo(j.point);
    }

}
