public class Triangle2D {
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    public Triangle2D(Point2D p1, Point2D p2, Point2D p3) {
        int d1 = distance(p1, p2);
        int d2 = distance(p2, p3);
        int d3 = distance(p3, p1);
        if (!(d1 + d2 > d3 && d2 + d3 > d1 && d3 + d1 > d2)) {
            System.err.println("Les points ne forme pas un triangle");
            System.exit(-1);
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public static int distance(Point2D p1, Point2D p2) {
        int distance = new Segment2D(p1, p2).norme();
        try {
            if (distance < 1) {
                throw new LongueurSegmentException(distance);
            }
        } catch (LongueurSegmentException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return distance;
    }

    public boolean estIsocele() {
        return distance(p1, p2) == distance(p2, p3) || distance(p1, p2) == distance(p1, p3) || distance(p2, p3) == distance(p1, p3);
    }

    public boolean estEquilateral() {
        return distance(p1, p2) == distance(p2, p3) && distance(p1, p2) == distance(p1, p3);
    }

    public boolean estRectangle() {
        return Math.pow(distance(p1, p2), 2) == (Math.pow(distance(p2, p3), 2) + Math.pow(distance(p1, p3), 2))
                || Math.pow(distance(p1, p3), 2) == (Math.pow(distance(p2, p3), 2) + Math.pow(distance(p1, p2), 2))
                || Math.pow(distance(p2, p3), 2) == (Math.pow(distance(p1, p3), 2) + Math.pow(distance(p1, p2), 2));
    }

    public int aire() {
        if (!estRectangle())
            return 0;
        int d1 = distance(p1, p2);
        int d2 = distance(p2, p3);
        int d3 = distance(p1, p3);
        int p = (d1 + d2 + d3) / 2;
        return (int)Math.sqrt(p*(p-d1)*(p-d2)*(p-d3)); // heron's formula
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(-2, 1);
        Point2D p3 = new Point2D(3, 1);
        Triangle2D t = new Triangle2D(p1, p2, p3);
        System.out.println(distance(p1, p2));
        System.out.println(distance(p2, p3));
        System.out.println(distance(p1, p3));
        System.out.println(t.aire());
    }
}
