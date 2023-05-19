import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GestionCompte implements ParametresCompteEpargne {
    private Map<Integer, CompteBancaire> listeCompte;

    public GestionCompte() {
        this.listeCompte = new HashMap<Integer, CompteBancaire>();
    }

    public void creerCompteCourant(int, boolean, CarteBancaire, int, float, float, Client, Date) {
        //TODO: Implement
    }

    public void creerCompteEpargne(double, boolean, double, Date, Client, int, float) {
        //TODO: Implement
    }
}
