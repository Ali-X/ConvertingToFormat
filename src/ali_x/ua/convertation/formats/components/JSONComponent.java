package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.shapes.ShapeComponent;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class JSONComponent extends SerializationComponent {

    ShapeComponent shape;

    public JSONComponent(ShapeComponent shape) {
        this.shape = shape;
    }

    public void getName() {
        String string = "\"name\": \"";
        string += shape.getName();
        string += "\"";
        System.out.print(string);
    }

    public void getArea() {
        String string = "\"area\": \"";
        string += shape.getArea();
        string += "\"";
        System.out.print(string);
    }

    public void getPerimeter() {
        String string = "\"perimeter\": \"";
        string += shape.getPerimeter();
        string += "\"";
        System.out.print(string);
    }

    public void getInfo() {
        System.out.println("\"shape\": {");
        getName();
        System.out.println(", ");
        getArea();
        System.out.println(", ");
        getPerimeter();
        System.out.print("\n}");
    }

}
