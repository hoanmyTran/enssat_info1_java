import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class CollectionPersonne {
    private final HashMap<String, Personne> cp;
    private static final Scanner s = new Scanner(System.in);

    public CollectionPersonne() {
        cp = new HashMap<String, Personne>();
    }

    public HashMap<String ,Personne> getCp() {
        return cp;
    }

    public void ajouter(Personne p) {
        String id = UUID.randomUUID().toString();
        if (!cp.containsKey(id)) {
            cp.put(id, p);
        } else {
            cp.put(UUID.randomUUID().toString(), p);
        }
    }

    public Personne findById(String id) {
        if (cp.containsKey(id)) {
            return cp.get(id);
        } else {
            return null;
        }
    }

    public void modifier() {
        afficherCollection();
        System.out.println("Saisir l'identifiant de la personne à modifier :");
        boolean q = false;
        String id = s.next();
        System.out.println("Personne choisie = "+cp.get(id));
        do {
            System.out.println("Indiquer le numéro du champ que vous voulez modifier (1: nom, 2: prenom, ville et pays ne sont pas modifiable, tout autre nombre pour quitter): ");
            int res = s.nextInt();
            s.nextLine();
            switch(res) {
                case 1:
                    System.out.println("Indiquer le nouveau nom : ");
                    cp.get(id).setNom(s.nextLine());
                    System.out.println(cp.get(id));
                    System.out.println("Modification du nom réussi!");
                    break;
                case 2:
                    System.out.println("Indiquer le nouveau prénom : ");
                    cp.get(id).setPrenom((s.nextLine()));
                    System.out.println(cp.get(id));
                    System.out.println("Modification du prénom réussi!");
                    break;
            }
            System.out.println("Voulez-vous quitter ? (o/n)");
            if (s.nextLine().equals("o")) {
                q = true;
            } else {
                System.out.println("vous avez fait une erreur de saisie. Recommencez.");
            }
        } while(!q);
        System.out.println("Vous avez quitter");
        afficherCollection();
    }

    public void supprimer() {
        String id;
        afficherCollection();
        do {
            System.out.println("Saisir l'identifiant de la personne à supprimer : ");
            id = s.nextLine();
            if (!cp.containsKey(id)) {
                System.out.println("Personne introuvable, veuillez recommencer !");
            }
        } while(!cp.containsKey(id));
        cp.remove(id);
        System.out.println("Personne (id = "+id+") supprimée");
        afficherCollection();
    }

    public void afficherCollection() {
        System.out.println("*************************");
        System.out.println("********Personne*********");
        System.out.println("*************************");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        cp.entrySet().stream()
                .forEach(input -> s.append("Id = ")
                        .append(input.getKey())
                        .append(", ")
                        .append(input.getValue()).append("\n"));
        return s.toString();
    }

    public static void main(String[] args) {
        Personne p1 = new Personne("Jean", "Dupond", "Lannion", "France");
        Personne p2 = new Personne("Jean", "Philippe", "Rennes", "France");
        Personne p3 = new Personne("Jean", "Dupond", "Lannion", "France");
        CollectionPersonne l = new CollectionPersonne();
        l.ajouter(p1);
        l.ajouter(p2);
        l.ajouter(p3);
        l.modifier();
        l.supprimer();
    }
}
