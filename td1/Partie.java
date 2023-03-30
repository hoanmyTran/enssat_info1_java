import java.util.Date;
import java.util.LinkedList;
public class Partie {

    private Date date;
    private String resultat;
    private LinkedList<Coup> coups; // ordered
    private Joueur noirs;
    private Joueur blancs;
    public Partie(Date date, String resultat, LinkedList<Coup> coups, Joueur joueur1, Joueur joueur2) {
        this.date = date;
        this.resultat = resultat;
        this.coups = coups;
        this.noirs = joueur1;
        this.blancs = joueur2;
    }

    public Date getDate() {
        return date;
    }

    public LinkedList<Coup> getCoups() {
        return coups;
    }

    public String getResultat() {
        return resultat;
    }

    public void setCoups(LinkedList<Coup> coups) {
        this.coups = coups;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
}