package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.shapes.ShapeComponent;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class XMLComponent extends SerializationComponent {

    ShapeComponent shape;

    public XMLComponent(ShapeComponent shape) {
        this.shape = shape;
    }

    public void getName() {
        String string = "<name>";
        string += shape.getName();
        string += "</name>";
        System.out.println(string);
    }

    public void getArea() {
        String string = "<area>";
        string += shape.getArea();
        string += "</area>";
        System.out.println(string);
    }

    public void getPerimeter() {
        String string = "<perimeter>";
        string += shape.getPerimeter();
        string += "</perimeter>";
        System.out.println(string);
    }

    public void getInfo() {
        System.out.println("<shape>");
        getName();
        getArea();
        getPerimeter();
        System.out.println("</shape>");
    }


}
