public abstract class Piece {
    private char couleur;
    private Case caseActuel;

    public Piece(char couleur, Case caseActuel) {
        this.couleur = couleur;
        this.caseActuel = caseActuel;
    }

    public char getCouleur() {
        return couleur;
    }

    public void setCouleur(char couleur) {
        this.couleur = couleur;
    }

    public void estSur(Case caseActuel) {
        this.caseActuel = caseActuel;
    }

    public Case getCaseActuel() {
        return caseActuel;
    }

    public void seDeplacer(Case c) {}
}