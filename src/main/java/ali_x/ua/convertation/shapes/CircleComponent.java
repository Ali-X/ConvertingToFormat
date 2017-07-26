package ali_x.ua.convertation.shapes;

public class CircleComponent extends ShapeComponent {

    private double r;
    private String name = "Circle";

    public CircleComponent(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public String getName() {
        return name;
    }
}

