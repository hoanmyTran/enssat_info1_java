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

    public void afficherListe() {
        System.out.println(this);
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
