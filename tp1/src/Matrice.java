import java.util.Arrays;
import java.util.Random;

public class Matrice {
    private int[][] valeurs;
    public static final Random r = new Random();
    public static final int ROWS_SIZE = 3;
    public static final int MAX_VALUE = 9;
    public static final int MAX_RANDOM = 1000;
    public Matrice() {
        this.valeurs = new int[ROWS_SIZE][];
        int i, j, length;
        for (i = 0; i < ROWS_SIZE; i++) {
            length = 1 + r.nextInt(MAX_VALUE);
            this.valeurs[i] = new int[length];
            for (j = 0; j < length; j++) {
                this.valeurs[i][j] = 1000 + r.nextInt(MAX_RANDOM);
            }
        }
    }

    public int[][] getValeurs() {
        return this.valeurs;
    }

    public void setValeurs(int[][] valeurs) {
        this.valeurs = valeurs;
    }

    public void trierMatrice() {
        for (int i = 0; i < ROWS_SIZE; i++) {
            this.valeurs[i] = Tableau.trierTableau(this.valeurs[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < ROWS_SIZE; i++) {
            s.append(Arrays.toString(this.valeurs[i]));
            if (i + 1 == ROWS_SIZE) {
                s.append("]");
            } else {
                s.append(", ");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Matrice m = new Matrice();
        System.out.println("La matrice non triée : "+m); // Méthode toString appelée implicitement
        m.trierMatrice();
        System.out.println("La matrice triée : "+m);
    }
}
