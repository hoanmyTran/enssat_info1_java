/**
 * Classe Cercle
 * @author tran
 */
public class Cercle {

    /**
     * Rayon d'un cercle
     */
    private float rayon;
    public static final float PI = 3.1415f;
    /**
     * Constructeur
     * @param rayon d'un cercle
     */
    public Cercle(float rayon) {
        this.rayon = rayon;
    }

    /**
     * Récupère le rayon
     * @return rayon
     */
    public float getRayon() {
        return this.rayon;
    }

    /**
     * Affecte la valeur de rayon
     * @param rayon
     */
    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    /**
     * Calculer l'aire d'un cercle
     * @return aire
     */
    public float calculAire() {
        return Cercle.PI*this.getRayon()*this.getRayon();
    }

    /**
     * Calculer circonférence d'un cercle
     * @return circonférence
     */
    public float calculCirconference() {
        return Cercle.PI*this.getRayon()*2;
    }

    public static void main(String[] args) {
        /**
         * S'il y n'a pas d'arguments ou plus que 2 arguments, afficher erreur
         */
        if (args.length != 1) {
            System.out.println("Erreur: vous devez indiquer en paramètre le rayon du cercle");
            System.exit(0);
        }
        float rayon = Float.parseFloat(args[0]); // parse argument (String) en float
        Cercle cercle = new Cercle(rayon); // instanciation d'objet cercle
        System.out.println("L'aire du cercle de rayon "+rayon+" est : "+cercle.calculAire());
        System.out.println("La circonférence du cercle de rayon "+rayon+" est : "+cercle.calculCirconference());
    }
}
