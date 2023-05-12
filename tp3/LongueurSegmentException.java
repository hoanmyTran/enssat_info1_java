public class LongueurSegmentException extends Exception {
    public LongueurSegmentException(int longueur) {
        super("Deux points d’un triangle sont espacés d’au moins 1 cm : " + longueur);
    }
}
