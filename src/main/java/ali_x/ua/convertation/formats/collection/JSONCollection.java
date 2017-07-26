package ali_x.ua.convertation.formats.collection;

import java.util.HashMap;
import java.util.Map;

public class JSONCollection implements Collection {
    Map<String, String> jsonCollection = new HashMap<String, String>();

    public JSONCollection() {
        jsonCollection.put("leftBrace", "{");
        jsonCollection.put("rightBrace", "}");
        jsonCollection.put("name", "\"name\": \"");
        jsonCollection.put("empty", "");
        jsonCollection.put("area", "\"area\": \"");
        jsonCollection.put("perimeter", "\"perimeter\": \"");
        jsonCollection.put("shapeStart", "\"shape\": {");
        jsonCollection.put("shapeEnd", "\n}");
        jsonCollection.put("newLine", "\n");
        jsonCollection.put("group", "\"group\": {");
        jsonCollection.put("comma", ",");
    }

    @Override
    public String getHead() {
        return jsonCollection.get("leftBrace");
    }

    @Override
    public String getBottom() {
        return jsonCollection.get("rightBrace");
    }

    @Override
    public String getFigureNameStartTag() {
        return jsonCollection.get("name");
    }

    @Override
    public String getFigureNameEndTag() {
        return jsonCollection.get("empty");
    }

    @Override
    public String getFigureAreaStartTag() {
        return jsonCollection.get("area");
    }

    @Override
    public String getFigureAreaEndTag() {
        return jsonCollection.get("empty");
    }

    @Override
    public String getFigurePerimeterStartTag() {
        return jsonCollection.get("perimeter");
    }

    @Override
    public String getFigurePerimeterEndTag() {
        return jsonCollection.get("empty");
    }

    @Override
    public String getFigureInfoStartTag() {
        return jsonCollection.get("shapeStart");
    }

    @Override
    public String getFigureInfoEndTag() {
        return jsonCollection.get("shapeEnd");
    }

    @Override
    public String getFigureGroupStartTag() {
        return jsonCollection.get("group");
    }

    @Override
    public String getFigureGroupEndTag() {
        return jsonCollection.get("rightBrace");
    }

    public String getComma() {
        return jsonCollection.get("comma");
    }

    @Override
    public String getNewLine() {
        return jsonCollection.get("newLine");
    }
}
