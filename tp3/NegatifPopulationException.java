public class NegatifPopulationException extends Exception {
    public NegatifPopulationException(int population) {
        super("Une ville ne peut pas avoir moins de 0 habitans : " + population);
    }
}
