public class ListeFIFO {
    public Element debut;

    public ListeFIFO() {
        this.debut = null;
    }

    public boolean estVide() {
        return debut == null;
    }

    public void empiler(Element nouveau) {
        if (this.estVide())
            debut = nouveau;
        else {
            Element element = this.debut;
            while(element.getSuivant() != null) {
                element = element.getSuivant();
            }
            element.setSuivant(nouveau);
        }
    }

    public Element depiler() {
        Element e = null;
        if (!estVide()) {
            e = debut;
            debut = debut.getSuivant();
        }
        return e;
    }

    public void afficherListe() {
        System.out.println(this);
    }

    public int longueur() {
        Element courant = this.debut;
        int longueur = 0;
        while(courant != null) {
            courant = courant.getSuivant();
            longueur++;
        }
        return longueur;
    }
    @Override
    public String toString() {
        if (this.estVide()) {
            return "Liste vide";
        } else {
            Element e = this.debut;
            StringBuilder s = new StringBuilder(e.toString());
            while(e.getSuivant() != null) {
                e = e.getSuivant();
                s.append(" | ");
                s.append(e);
            }
            return s.toString();
        }
    }
}
