package dcll.esab;

/**
 * Created by Edouard on 25/02/2015.
 */
public class Item {
    private int nb;
    private String nom;

    public Item (int nb, String nom) {
        this.nb = nb;
        this.nom = nom;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb() {
        return nb;
    }

    public String getNom() {
        return nom;
    }
}
