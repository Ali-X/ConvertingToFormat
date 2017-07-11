package ali_x.ua.convertation.formats.components;

import java.util.ArrayList;
import java.util.Iterator;

public class JSONGroup extends SerializationComponent {

    ArrayList jsonComponents = new ArrayList();

    public void add(SerializationComponent newSerializationComponent) {
        jsonComponents.add(newSerializationComponent);
    }

    public void getInfo() {
        string.append(collection.getFigureGroupStartTag());
        string.append(collection.getNewLine());
        Iterator jsonIterator = jsonComponents.iterator();
        while (jsonIterator.hasNext()) {
            SerializationComponent shape = (SerializationComponent) jsonIterator.next();
            shape.getInfo();
            if (jsonIterator.hasNext()) {
                string.append(collection.getComma());
                string.append(collection.getNewLine());
            }
        }
        string.append(collection.getFigureGroupEndTag());
    }
}

