import java.util.ArrayList;
public class Joueur {
    private ArrayList<Piece> pieces;
    private String nom;
    private String prenom;
    private int classement;

    public Joueur(String nom, String prenom, int classement, ArrayList<Piece> pieces) {
        this.nom = nom;
        this.prenom = prenom;
        this.classement = classement;
        this.pieces = pieces;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public int getClassement() {
        return classement;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}