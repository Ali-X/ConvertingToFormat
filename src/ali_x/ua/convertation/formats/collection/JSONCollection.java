package ali_x.ua.convertation.formats.collection;

import java.util.ArrayList;
import java.util.List;

public class JSONCollection implements Collection {
    List<String> jsonCollection = new ArrayList<>();

    public JSONCollection() {
        jsonCollection.add(0, "{");
        jsonCollection.add(1, "}");
        jsonCollection.add(2, "\"name\": \"");
        jsonCollection.add(3, "");
        jsonCollection.add(4, "\"area\": \"");
        jsonCollection.add(5, "");
        jsonCollection.add(6, "\"perimeter\": \"");
        jsonCollection.add(7, "");
        jsonCollection.add(8, "\"shape\": {");
        jsonCollection.add(9, "\n}");
        jsonCollection.add(10, "\"group\": {");
        jsonCollection.add(11, "}");
        jsonCollection.add(12, ",");
        jsonCollection.add(13, "\n");
    }

    @Override
    public String getHead() {
        return jsonCollection.get(0);
    }

    @Override
    public String getBottom() {
        return jsonCollection.get(1);
    }

    @Override
    public String getFigureNameStartTag() {
        return jsonCollection.get(2);
    }

    @Override
    public String getFigureNameEndTag() {
        return jsonCollection.get(3);
    }

    @Override
    public String getFigureAreaStartTag() {
        return jsonCollection.get(4);
    }

    @Override
    public String getFigureAreaEndTag() {
        return jsonCollection.get(5);
    }

    @Override
    public String getFigurePerimeterStartTag() {
        return jsonCollection.get(6);
    }

    @Override
    public String getFigurePerimeterEndTag() {
        return jsonCollection.get(7);
    }

    @Override
    public String getFigureInfoStartTag() {
        return jsonCollection.get(8);
    }

    @Override
    public String getFigureInfoEndTag() {
        return jsonCollection.get(9);
    }

    @Override
    public String getFigureGroupStartTag() {
        return jsonCollection.get(10);
    }

    @Override
    public String getFigureGroupEndTag() {
        return jsonCollection.get(11);
    }

    public String getComma() {
        return jsonCollection.get(12);
    }

    @Override
    public String getNewLine() {
        return jsonCollection.get(13);
    }
}
