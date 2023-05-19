import java.util.Date;

public abstract class CompteBancaire {
    private double solde;
    private int numeroCompte;
    private Date dateOuverture;
    private Client client;

    public CompteBancaire(double solde, int numeroCompte, Date dateOuverture, Client client) {
        this.solde = solde;
        this.numeroCompte = numeroCompte;
        this.dateOuverture = dateOuverture;
        this.client = client;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public Client getClient() {
        return client;
    }

    public abstract void credit(double montant);
    public abstract void debit(double montant);

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getNumeroCompte())
                .append(" ")
                .append(solde)
                .append(" ")
                .append(getDateOuverture())
                .append(" ")
                .append(getClient())
                .toString();
    }

    public static void main(String[] args) {
        Client c = new Client(1, "Toto", "Titi", 2, "rue", "Lannion", 22300);
    }
}
