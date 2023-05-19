public class Client {
    private int numero;
    private String nom;
    private String prenom;
    private int numeroDePorte;
    private int codePostalClient;
    private String rueClient;
    private String villeClient;

    public Client(int numero, String nom, String prenom, int numeroDePorte, String rueClient, String villeClient, int codePostalClient) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDePorte = numeroDePorte;
        this.rueClient = rueClient;
        this.villeClient = villeClient;
        this.codePostalClient = codePostalClient;
    }

    public String getNomClient() {
        return nom;
    }

    public String getPrenomClient() {
        return prenom;
    }

    public String getAdresseClient() {
        return new StringBuilder()
                .append(numeroDePorte)
                .append(" ")
                .append(rueClient)
                .append(" ")
                .append(villeClient)
                .append(" ")
                .append(codePostalClient)
                .toString();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(numero)
                .append(" ")
                .append(getNomClient())
                .append(" ")
                .append(getPrenomClient())
                .append(" ")
                .append(getAdresseClient())
                .toString();
    }

    public static void main(String[] args) {
        Client c = new Client(1, "Toto", "Titi", 2, "rue", "Lannion", 22300);
        System.out.println(c);
    }
}
