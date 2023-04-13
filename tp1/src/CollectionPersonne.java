import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionPersonne {
    private final ArrayList<Personne> cp;
    private static final Scanner s = new Scanner(System.in);

    public CollectionPersonne() {
        cp = new ArrayList<Personne>();
    }

    public ArrayList<Personne> getCp() {
        return cp;
    }

    public void ajouter(Personne p) {
        if (!cp.contains(p)) {
            cp.add(p);
        }
    }

    public Personne findById(String id) {
        return cp.stream()
                .filter(personne -> id.equals(personne.getId()))
                .findAny()
                .orElse(null);
    }

    public void modifier() {
        System.out.println("Saisir l'identifiant de la personne à modifier :");
        String id = s.next();
        Personne p = this.findById(id);
        System.out.println("Personne choisie = "+p);
        System.out.println("Indiquer le numéro du champ que vous voulez modifier (1: nom, 2: prenom, ville et pays ne sont pas modifiable, tout autre nombre pour quitter): ");
        int res = s.nextInt();
        if (res == 1) {
            System.out.println("Indiquer le nouveau nom : ");
        } else if (res == 2) {
            System.out.println("Indiquer le nouveau prenom : ");
        } else {
            System.out.println("Vous voulez quitter? (o/n)");

            System.out.println("Vous avez quitter");
        }
    }

    public void afficherCollection() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Personne personne : cp) {
            s.append(personne);
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("********Personne*********");
        System.out.println("*************************");
        Personne p1 = new Personne("Jean", "Dupond", "Lannion", "France");
        Personne p2 = new Personne("Jean", "Philippe", "Rennes", "France");
        Personne p3 = new Personne("Jean", "Dupond", "Lannion", "France");
        CollectionPersonne l = new CollectionPersonne();
        l.ajouter(p1);
        l.ajouter(p2);
        l.ajouter(p3);
        l.afficherCollection();
        l.modifier();
    }
}
