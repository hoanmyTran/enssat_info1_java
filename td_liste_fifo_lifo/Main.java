public class Main {
    public static void main(String[] args) {
        ListeFIFO l = new ListeFIFO();
        for (int i = 0; i < 5; i++) {
            l.empiler(new Element(null, i));
        }
        l.afficherListe();
        for (int i = 0; i < 2; i++) {
            l.depiler();
        }

        l.afficherListe();

        for (int i = 0; i < 5; i++) {
            l.empiler(new Element(null, i));
        }
        l.afficherListe();

        while (!l.estVide()) {
            l.depiler();
        }

        l.afficherListe();
    }
}
