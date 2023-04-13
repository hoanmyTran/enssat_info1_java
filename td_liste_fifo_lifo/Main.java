public class Main {
    public static void main(String[] args) {
        System.out.println("LISTE FIFO");
        ListeFIFO lFIFO = new ListeFIFO();
        for (int i = 0; i < 5; i++) {
            lFIFO.empiler(new Element(null, i));
        }
        lFIFO.afficherListe();
        for (int i = 0; i < 2; i++) {
            lFIFO.depiler();
        }

        lFIFO.afficherListe();

        for (int i = 0; i < 5; i++) {
            lFIFO.empiler(new Element(null, i));
        }
        lFIFO.afficherListe();

        while (!lFIFO.estVide()) {
            lFIFO.depiler();
        }

        lFIFO.afficherListe();

        System.out.println("---------------------------------------------");
        System.out.println("LISTE LIFO");
        ListeLIFO lLIFO= new ListeLIFO();
        for (int i = 0; i < 5; i++) {
            lLIFO.empiler(new Element(null, i));
        }
        lLIFO.afficherListe();
        for (int i = 0; i < 2; i++) {
            lLIFO.depiler();
        }

        lLIFO.afficherListe();

        for (int i = 0; i < 5; i++) {
            lLIFO.empiler(new Element(null, i));
        }
        lLIFO.afficherListe();

        while (!lLIFO.estVide()) {
            lLIFO.depiler();
        }

        lLIFO.afficherListe();
    }
}
