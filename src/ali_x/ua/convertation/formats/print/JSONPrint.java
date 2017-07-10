package ali_x.ua.convertation.formats.print;

import ali_x.ua.convertation.formats.components.SerializationComponent;

/**
 * Created by Ali-X on 10.07.2017.
 */
public class JSONPrint extends Print {

    SerializationComponent component;

    public JSONPrint(SerializationComponent component) {
        this.component = component;
        getInfo();
    }

    public void getInfo() {
        System.out.println("{");
        component.getInfo();
        System.out.println("}");
    }

}
