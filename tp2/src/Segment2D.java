import java.lang.Math;

public class Segment2D {
    private Point2D p1;
    private Point2D p2;

    public Segment2D(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point2D getP1() {
        return p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public double norme() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Segment2D)) {
            return false;
        }

        Segment2D s = (Segment2D) o;

        return (p1.equals(s.getP1()) && p2.equals(s.getP2())) || (p1.equals(s.getP2()) && p2.equals(s.getP1()));
    }
}
