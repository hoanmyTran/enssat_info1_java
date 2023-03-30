import java.util.ArrayList;
public class Echiquier{
    private String matiere;
    private int taille;
    private ArrayList<Case> cases;

    public Echiquier(String matiere, int taille, ArrayList<Case> cases) {
        this.matiere = matiere;
        this.taille = taille;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }
}