import java.util.HashSet;
import java.util.Set;

public class Ville {
    private String nom;
    private int population;
    private Pays pays;
    private Set<Ville> jumelage;

    public Ville(String nom, int population, Pays pays, Set<Ville> jumelage) {
        try {
            if (nom.length() < 5 || nom.length() > 15)
                throw new NomVilleException(nom);
            if (population < 0)
                throw new NegatifPopulationException(population);
            if (pays == null)
                throw new IllegalArgumentException("Une ville appartient obligatoirement à un pays");
        } catch (NomVilleException | NegatifPopulationException | IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        this.nom = nom;
        this.population = population;
        this.pays = pays;
        if (jumelage == null)
            this.jumelage = new HashSet<Ville>();
        else
            this.jumelage = jumelage;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    public Pays getPays() {
        return pays;
    }

    public Set<Ville> getJumelage() {
        return jumelage;
    }

    public void setNom(String nom) {
        try {
            if (nom.length() < 5 || nom.length() > 15)
                throw new NomVilleException(nom);
        } catch (NomVilleException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        this.nom = nom;
    }

    public void setPopulation(int population) {
        try {
            if (population < 0)
                throw new NegatifPopulationException(population);
        } catch (NegatifPopulationException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        this.population = population;
    }

    public void setPays(Pays pays) {
        try {
            if (pays == null)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        this.pays = pays;
    }

    public void setJumelage(Set<Ville> jumelage) {
        this.jumelage = jumelage;
    }

    public void ajoutVille(Ville v) {
        try {
            if (v == null)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        if (jumelage == null) {
            jumelage = new HashSet<Ville>();
        }
        jumelage.add(v);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Nom de Ville : " + nom + ", population : " + population + ", nom du pays : " + pays.getNom() + ", jumelage : ");
        if (jumelage == null)
            s.append("[]");
        else {
            jumelage.stream().forEach(ville -> s.append(ville.getNom() + " "));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Pays france = new Pays("France", "Europe");
        Ville paris = new Ville("Paris", 100, france, null);
        Ville lannion = new Ville("Lannion", 50, france, null);
        Ville rennes = new Ville("Rennes", 75, france, null);
        paris.ajoutVille(lannion);
        paris.ajoutVille(rennes);
        paris.setPopulation(-1);
        System.out.println(paris);

    }
}