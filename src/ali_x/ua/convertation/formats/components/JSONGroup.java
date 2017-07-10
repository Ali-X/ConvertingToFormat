package ali_x.ua.convertation.formats.components;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class JSONGroup extends SerializationComponent {

    ArrayList jsonComponents = new ArrayList();

    public void add(SerializationComponent newSerializationComponent) {
        jsonComponents.add(newSerializationComponent);
    }

    public void getInfo() {
        System.out.println("\"group\": {");
        Iterator jsonIterator = jsonComponents.iterator();
        while (jsonIterator.hasNext()) {
            SerializationComponent shape = (SerializationComponent) jsonIterator.next();
            shape.getInfo();
            if (jsonIterator.hasNext()) System.out.println(",");
        }
        System.out.print("}");
    }
}

