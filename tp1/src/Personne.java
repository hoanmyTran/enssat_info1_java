import java.util.UUID;

public class Personne {
    private final String id;
    private String nom;
    private String prenom;
    private final String paysNaissance;
    private final String villeNaissance;

    public Personne(String n, String p, String pn, String vn) {
        id = UUID.randomUUID().toString();
        nom = n;
        prenom = p;
        paysNaissance = pn;
        villeNaissance = vn;
    }

    public String getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaysNaissance() {
        return paysNaissance;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void affiche() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        return s.append("Id = ").append(this.getId()).append(", ").append(this.getNom()).append(";").append(this.getPrenom()).append(";").append(this.getVilleNaissance()).append(";").append(this.getPaysNaissance()).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Personne)) {
            return false;
        }

        Personne p = (Personne) obj;

        return this.getId().equals(p.getId()) && this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom()) && this.getVilleNaissance().equals(p.getVilleNaissance()) && this.getPaysNaissance().equals(p.getPaysNaissance());
    }

    public static void main(String[] args) {
        Personne p1 = new Personne("Jean", "Philippe", "Rennes", "France");
        Personne p2 = new Personne("Toto", "Philippe", "Rennes", "France");
        Personne p3 = new Personne("Toto", "Philippe", "Rennes", "France");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p2));
    }
}
