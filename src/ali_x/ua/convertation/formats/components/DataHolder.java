package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.formats.collection.Collection;

public class DataHolder {

    private static final DataHolder HOLDER_INSTANCE = new DataHolder();
    private static final StringBuilder string = new StringBuilder();
    private Collection collection;

    public static DataHolder getInstance() {
        return HOLDER_INSTANCE;
    }

    public StringBuilder getString() {
        return string;
    }

    public void printString() {
        System.out.println(string);
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
