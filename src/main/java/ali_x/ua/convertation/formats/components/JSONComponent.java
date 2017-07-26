package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.shapes.ShapeComponent;

public class JSONComponent extends SerializationComponent {

    public JSONComponent(ShapeComponent shape) {
        super.shape = shape;
    }

    public void getInfo() {
        string.append(collection.getFigureInfoStartTag());
        string.append(collection.getNewLine());
        getName();
        string.append(collection.getComma());
        string.append(collection.getNewLine());
        getArea();
        string.append(collection.getComma());
        string.append(collection.getNewLine());
        getPerimeter();
        string.append(collection.getFigureInfoEndTag());
    }

}
