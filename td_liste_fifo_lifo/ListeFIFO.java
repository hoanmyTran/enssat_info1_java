public class ListeFIFO {
    public Element debut;

    public ListeFIFO() {
        this.debut = null;
    }

    public boolean estVide() {
        return debut == null;
    }
}
