public class Coup {
    private int numero;
    private char couleur;

    private Piece piece;
    private Case caseDepart;
    private Case caseArrivee;
    public Coup(int numero, char couleur, Piece piece, Case cd, Case ca) {
        this.numero = numero;
        this.caseDepart = cd;
        this.caseArrivee = ca;
        if (couleur != piece.getCouleur()) {
            System.out.println("Error");
            System.exit(0);
        }
        this.couleur = couleur;
        this.piece = piece;
    }

    public void setCouleur(char couleur) {
        this.couleur = couleur;
    }

    public char getCouleur() {
        return couleur;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public Case getCaseArrivee() {
        return caseArrivee;
    }

    public Case getCaseDepart() {
        return caseDepart;
    }

    public void setCaseArrivee(Case caseArrivee) {
        this.caseArrivee = caseArrivee;
    }

    public void setCaseDepart(Case caseDepart) {
        this.caseDepart = caseDepart;
    }
}