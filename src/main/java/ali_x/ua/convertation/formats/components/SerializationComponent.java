package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.formats.collection.Collection;
import ali_x.ua.convertation.shapes.ShapeComponent;

public abstract class SerializationComponent {

    DataHolder dataHolder;
    Collection collection;
    ShapeComponent shape;
    StringBuilder string;

    public SerializationComponent() {
        this.dataHolder = DataHolder.getInstance();
        this.collection = dataHolder.getCollection();
        string = dataHolder.getString();
    }

    public void getName() {
        string.append(collection.getFigureNameStartTag());
        string.append(shape.getName());
        string.append(collection.getFigureNameEndTag());
    }

    public void getArea() {
        string.append(collection.getFigureAreaStartTag());
        string.append(shape.getArea());
        string.append(collection.getFigureAreaEndTag());
    }

    public void getPerimeter() {
        string.append(collection.getFigurePerimeterStartTag());
        string.append(shape.getPerimeter());
        string.append(collection.getFigurePerimeterEndTag());
    }

    public void add(SerializationComponent newSerializationComponent) {
    }

    public void getInfo() {
    }

    public void Serialize() {
        string.append(collection.getHead());
        string.append(collection.getNewLine());
        getInfo();
        string.append(collection.getBottom());
    }

}
