package tp1;

import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Tableau {
    private int[] valeurs;
    public static final Random r = new Random();
    public static final int ARRAY_SIZE = 10;
    public static final int MAX_RANDOM = 1000;

    public Tableau() {
        this.valeurs = IntStream.range(0, Tableau.ARRAY_SIZE)
                .map(i -> 1000 + Tableau.r.nextInt(Tableau.MAX_RANDOM))
                .toArray();
        /*
        Classique méthode pour initialiser un tableau d'entiers de taille ARRAY_SIZE
        this.valeurs = new int[Tableau.ARRAY_SIZE];
        for(int i = 0; i < Tableau.ARRAY_SIZE; i++) {
            this.valeurs[i] = 1000 + Tableau.r.nextInt(Tableau.MAX_RANDOM);
        }*/
    }
    public Tableau(int[] valeurs) {
        this.valeurs = valeurs;
    }

    public int[] getValeurs() {
        return this.valeurs;
    }

    public void setValeurs(int[] valeurs) {
        this.valeurs = valeurs;
    }

    public static int[] trierTableau(int[] tableau) {
        Arrays.sort(tableau);
        return tableau;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getValeurs());
    }

    public static void main(String[] args) {
        Tableau t = new Tableau();
        System.out.println("Le tableau non trié : "+t); // Méthode toString appelée implicitement
        System.out.println("Le tableau trié : "+Arrays.toString(Tableau.trierTableau(t.getValeurs())));
    }
}
