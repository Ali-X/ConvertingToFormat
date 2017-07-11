package ali_x.ua.convertation.formats.components;

import java.util.ArrayList;
import java.util.Iterator;

public class XMLGroup extends SerializationComponent {

    ArrayList xmlComponents = new ArrayList();

    public void add(SerializationComponent newSerializationComponent) {
        xmlComponents.add(newSerializationComponent);
    }

    public void getInfo() {
        string.append(collection.getFigureGroupStartTag());
        string.append(collection.getNewLine());
        Iterator xmlIterator = xmlComponents.iterator();
        while (xmlIterator.hasNext()) {
            SerializationComponent shape = (SerializationComponent) xmlIterator.next();
            shape.getInfo();
        }
        string.append(collection.getFigureGroupEndTag());
    }
}

