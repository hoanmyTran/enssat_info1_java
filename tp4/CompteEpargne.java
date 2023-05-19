import java.util.Date;

public class CompteEpargne extends CompteBancaire{

    private double remuneration;
    private boolean fiscalite;

    public CompteEpargne(double solde, int numeroCompte, Date dateOuverture, Client client, double remuneration, boolean fiscalite) {
        super(solde, numeroCompte, dateOuverture, client);
        this.remuneration = remuneration;
        this.fiscalite  = fiscalite;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public boolean isFiscalite() {
        return fiscalite;
    }

    public void setFiscalite(boolean fiscalite) {
        this.fiscalite = fiscalite;
    }

    public double calculInteret() {
        //TODO
        return 0;
    }

    @Override
    public void credit(double montant) {
        System.out.println("Compte épargne crédite");
        this.setSolde(this.getSolde() - montant);
    }

    @Override
    public void debit(double montant) {
        System.out.println("Compte épargne débite");
        this.setSolde(this.getSolde() + montant);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(" ")
                .append(getRemuneration())
                .append(" ")
                .append(isFiscalite())
                .toString();
    }

    public static void main(String[] args) {
        Client c = new Client(1, "Toto", "Titi", 2, "rue", "Lannion", 22300);
        CompteEpargne ce = new CompteEpargne(1000, 1, new Date(), c, 7000, true);
        System.out.println(ce);
    }
}
