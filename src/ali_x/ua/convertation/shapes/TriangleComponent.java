package ali_x.ua.convertation.shapes;

/**
 * Created by Ali-X on 09.07.2017.
 */
public class TriangleComponent extends ShapeComponent {

    private double a;
    private double b;
    private double c;
    private double h;
    private String name = "Triangle";

    public TriangleComponent(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getArea() {
        return (a * h) / 2;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String getName() {
        return name;
    }
}
