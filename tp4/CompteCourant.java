import java.util.Date;

public class CompteCourant extends CompteBancaire{

    private int decouvertAutorise;
    private boolean chequier;
    private Carte carte;

    public CompteCourant(double solde, int numeroCompte, Date dateOuverture, Client client, int decouvertAutorise, boolean chequier, Carte carte) {
        super(solde, numeroCompte, dateOuverture, client);
        this.decouvertAutorise = decouvertAutorise;
        this.chequier = chequier;
        this.carte = carte;
    }

    public int getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public boolean isChequier() {
        return chequier;
    }

    public String getCarte() {
        return carte.getType();
    }

    public void setDecouvertAutorise(int decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public void setChequier(boolean chequier) {
        this.chequier = chequier;
    }

    public void setCarte(String carte) {
        switch (carte) {
            case "VISA" -> this.carte = Carte.VISA;
            case "MAESTRO" -> this.carte = Carte.MAESTRO;
            case "MASTERCARD" -> this.carte = Carte.MASTERCARD;
            default -> throw new IllegalStateException("Unexpected value: " + carte);
        }
    }

    @Override
    public void credit(double montant) {
        System.out.println("Compte courant crédite");
        this.setSolde(this.getSolde() - montant);
    }

    @Override
    public void debit(double montant) {
        System.out.println("Compte courante débite");
        this.setSolde(this.getSolde() + montant);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(" ")
                .append(getDecouvertAutorise())
                .append(" ")
                .append(isChequier())
                .append(" ")
                .append(getCarte().getType())
                .toString();
    }

    public static void main(String[] args) {
        Client c = new Client(1, "Toto", "Titi", 2, "rue", "Lannion", 22300);
        CompteBancaire cb = new CompteCourant(1000, 1, new Date(), c, 7000, true, Carte.VISA);
        System.out.println(cb);
    }
}
