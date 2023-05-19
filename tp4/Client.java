public class Client {
    private int numero;
    private String nom;
    private String prenom;
    private int numeroDePorte;
    private int codePostalClient;
    private String rueClient;
    private String villeClient;

    public String getNomClient() {
        return nom;
    }

    public String getPrenomClient() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "";
    }

    public static void main(String[] args) {

    }
}
