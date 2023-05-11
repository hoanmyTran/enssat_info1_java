public class NomVilleException extends Exception {
    public NomVilleException(String nom) {
        super("Le nom de la ville ne doit pas avoir moins de 5 caractères et plus de 15 : " + nom);
    }
}
