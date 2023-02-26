package figures.triangle;

public class Main {
    public static void main(String[] args) {

        RightTriangle t1 = new RightTriangle();
        t1.setName("t1");
        System.out.println(t1.getName());
        System.out.println(t1.getCorner());

        IsoscelesTriangle t2 = new IsoscelesTriangle(30);
        System.out.println(t2.getCorner2());

        EquilateralTriangle t3 = new EquilateralTriangle();
        System.out.println(t3.getCorner2());
    }
}
