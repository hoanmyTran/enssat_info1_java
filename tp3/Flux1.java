import java.io.File;
import java.util.Scanner;

public class Flux1 {
    public static void main(String[] args) {
        File f = new File("monFichier.txt");
        System.out.println("Chemin = " + f.getPath());
        System.out.println("Chemin = " + f.getAbsolutePath());
        System.out.println("Lecture? : " +f.canRead());
        System.out.println("Ecriture? : "+f.canWrite());
        System.out.println("Longueur = "+f.length());
        Scanner sc = new Scanner(System.in);
        String fileName, nomVille, nbHabitant, paysAppartenance = null;
        System.out.println("--------liste des villes--------");
        System.out.println("Nom ville (tabulation) nbHab (tabulation) pays");
        /*for (int i = 0; i < 3; i++) {
            System.out.println("Nom du fichier à créer :");
            fileName = sc.nextLine();
            System.out.println("Saisir nom de la ville :");
            nomVille = sc.nextLine();
            System.out.println("Saisir nb d'habitant :");
            nbHabitant = sc.nextLine();
            System.out.println("Saisie le pays d'appartenance :");
            paysAppartenance = sc.nextLine();
            System.out.println(fileName);
            System.out.println(nomVille);
            System.out.println(nbHabitant);
            System.out.println(paysAppartenance);
        }*/

        System.out.println("--------fin liste des villes--------");
        sc.close();
    }
}
