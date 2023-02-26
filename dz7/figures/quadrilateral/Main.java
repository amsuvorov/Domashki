package figures.quadrilateral;

public class Main {
    public static void main(String[] args) {
        Square q1 = new Square(10);
        System.out.println(q1.getSide2());

        Rectangle r1 = new Rectangle(12, 20);
        System.out.println(r1.getCorner4());
        System.out.println(r1.getSide3());

        Parallelogram p1 = new Parallelogram(12, 10, 10);
        System.out.println(p1.getCorner1());

        Romb r4 = new Romb(12, 89);
        System.out.println(r4.getCorner1());

        Trapezium y2 = new Trapezium(12, 12, 15, 1);
        y2.setName("ura dz gotov");
        System.out.println(y2.getName());
    }
}
