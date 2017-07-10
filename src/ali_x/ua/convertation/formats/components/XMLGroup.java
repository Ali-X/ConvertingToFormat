package ali_x.ua.convertation.formats.components;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class XMLGroup extends SerializationComponent {

    ArrayList xmlComponents = new ArrayList();

    public void add(SerializationComponent newSerializationComponent) {
        xmlComponents.add(newSerializationComponent);
    }

    public void getInfo() {
        System.out.println("<group>");
        Iterator xmlIterator = xmlComponents.iterator();
        while (xmlIterator.hasNext()) {
            SerializationComponent shape = (SerializationComponent) xmlIterator.next();
            shape.getInfo();
        }
        System.out.println("</group>");
    }
}

