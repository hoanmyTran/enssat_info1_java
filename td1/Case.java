public class Case {
    private char couleur;
    private int range;
    private char colonne;
    private Piece piece;
    public Case(char[] couleur, int[] range, char[] colonne, Piece piece) {
        this.couleur = couleur;
        this.range = range;
        this.colonne = colonne;
        this.piece = piece;
    }

    public char getColonne() {
        return colonne;
    }

    public char getCouleur() {
        return couleur;
    }

    public int getRange() {
        return range;
    }

    public void setColonne(char colonne) {
        this.colonne = colonne;
    }

    public void setCouleur(char couleur) {
        this.couleur = couleur;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}