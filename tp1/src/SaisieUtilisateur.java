import java.util.Scanner;

public abstract class SaisieUtilisateur {

    private static Scanner input = new Scanner(System.in);

    public static void saisieChaineCaractere() {
        System.out.println("Saisir une chaine de caractere :");
        String info = input.next();
        System.out.println(info);
    }

    public static void saisieEntiers() {
        int[] array = new int[2];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Saisir un entier :");
            array[i] = input.nextInt();
        }
        System.out.println(array[0]+"*"+array[1]+" = "+(array[0]*array[1]));
        System.out.println(array[0]+"/"+array[1]+" = "+(float)(array[0]/array[1]));
    }
    public static void main(String[] args) {
        SaisieUtilisateur.saisieEntiers();
        SaisieUtilisateur.saisieChaineCaractere();
    }
}
