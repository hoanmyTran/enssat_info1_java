public class ListeLIFO {
    public Element debut;

    public ListeLIFO() {
        this.debut = null;
    }

    public boolean estVide() {
        return debut == null;
    }

    public void empiler(Element nouveau) {
        if (this.estVide()) {
            debut = nouveau;
        } else {
            Element element = this.debut;
            while(element.getSuivant() != null) {
                element = element.getSuivant();
            }
            element.setSuivant(nouveau);
        }
    }

    public Element depiler() {
        if (estVide())
            return null;
        Element e = null;
        if(debut.getSuivant() == null) {
            e = debut;
            debut = null;
            return e;
        } else {
            Element precedent = debut;
            Element elt = debut.getSuivant();
            while(elt.getSuivant() != null) {
                precedent = elt;
                elt = elt.getSuivant();

            }
            e = elt;
            precedent.setSuivant(null);
            return e;
        }
    }

    public int valeurElement(Element e) {
        Element elm = this.debut;
        while (elm != null) {
            if (elm.equals(e))
                return elm.getValue();
            elm = elm.getSuivant();
        }
        return Integer.MIN_VALUE;
    }

    public void afficherListe() {
        System.out.println(this);
    }

    public int longueur() {
        Element courant = this.debut;
        int longueur = 0;
        while (courant != null) {
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
            while (e.getSuivant() != null) {
                e = e.getSuivant();
                s.append(" | ");
                s.append(e);
            }
            return s.toString();
        }
    }
}
