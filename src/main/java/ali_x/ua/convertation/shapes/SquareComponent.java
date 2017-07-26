package ali_x.ua.convertation.shapes;

public class SquareComponent extends ShapeComponent {

    private double a;
    private String name = "Square";

    public SquareComponent(double a) {
        this.a = a;
    }

    public double getArea() {
        return Math.pow(a, 2);
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public String getName() {
        return name;
    }
}
