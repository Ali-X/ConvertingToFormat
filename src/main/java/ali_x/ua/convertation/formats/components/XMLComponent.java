package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.shapes.ShapeComponent;

public class XMLComponent extends SerializationComponent {

    public XMLComponent(ShapeComponent shape) {
        super.shape = shape;
    }

    public void getInfo() {
        string.append(collection.getFigureInfoStartTag());
        string.append(collection.getNewLine());
        getName();
        string.append(collection.getNewLine());
        getArea();
        string.append(collection.getNewLine());
        getPerimeter();
        string.append(collection.getNewLine());
        string.append(collection.getFigureInfoEndTag());
        string.append(collection.getNewLine());
    }


}
