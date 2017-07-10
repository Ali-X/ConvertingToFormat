package ali_x.ua.convertation.formats.print;

import ali_x.ua.convertation.formats.components.SerializationComponent;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class XMLPrint extends Print {

    SerializationComponent component;

    public XMLPrint(SerializationComponent component) {
        this.component = component;
        getInfo();
    }

    public void getInfo() {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        component.getInfo();
    }

}
