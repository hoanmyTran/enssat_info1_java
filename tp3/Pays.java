public class Pays {
    private String nom;
    private String continent;

    public Pays(String nom, String continent) {
        this.nom = nom;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public String getContinent() {
        return continent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String toString() {
        return new String("Nom du pays : " + nom + ", continent : " + continent);
    }
}
