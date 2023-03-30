public class Roi extends Piece{
    private boolean estEnEchec;
    private boolean aBouge;

    public Roi(boolean estEnEchec, boolean aBouge) {
        super();
        this.estEnEchec = estEnEchec;
        this.aBouge = aBouge;
    }

    public boolean isaBouge() {
        return aBouge;
    }

    public void setaBouge(boolean aBouge) {
        this.aBouge = aBouge;
    }

    public boolean isEstEnEchec() {
        return estEnEchec;
    }

    public void setEstEnEchec(boolean estEnEchec) {
        this.estEnEchec = estEnEchec;
    }

    public void roquer()
}