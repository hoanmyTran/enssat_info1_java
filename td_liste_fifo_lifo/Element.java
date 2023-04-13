public class Element {
    private Element suivant;
    private int value;

    public Element(Element suivant, int value) {
        this.suivant = suivant;
        this.value = value;
    }

    public void setSuivant(Element nouveau) {
        suivant = nouveau;
    }

    public Element getSuivant() {
        return suivant;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.getValue());
    }
}