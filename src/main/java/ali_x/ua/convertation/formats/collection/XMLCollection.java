package ali_x.ua.convertation.formats.collection;

import java.util.HashMap;
import java.util.Map;

public class XMLCollection implements Collection {

    Map<String, String> xmlCollection = new HashMap<String, String>();

    public XMLCollection() {
        xmlCollection.put("head", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlCollection.put("empty", "");
        xmlCollection.put("nameStart", "<name>");
        xmlCollection.put("nameEnd", "</name>");
        xmlCollection.put("areaStart", "<area>");
        xmlCollection.put("areaEnd", "</area>");
        xmlCollection.put("perimeterStart", "<perimeter>");
        xmlCollection.put("perimeterEnd", "</perimeter>");
        xmlCollection.put("shapeStart", "<shape>");
        xmlCollection.put("shapeEnd", "</shape>");
        xmlCollection.put("groupStart", "<group>");
        xmlCollection.put("groupEnd", "</group>");
        xmlCollection.put("newLine", "\n");
    }

    @Override
    public String getHead() {
        return xmlCollection.get("head");
    }

    @Override
    public String getBottom() {
        return xmlCollection.get("empty");
    }

    @Override
    public String getFigureNameStartTag() {
        return xmlCollection.get("nameStart");
    }

    @Override
    public String getFigureNameEndTag() {
        return xmlCollection.get("nameEnd");
    }

    @Override
    public String getFigureAreaStartTag() {
        return xmlCollection.get("areaStart");
    }

    @Override
    public String getFigureAreaEndTag() {
        return xmlCollection.get("areaEnd");
    }

    @Override
    public String getFigurePerimeterStartTag() {
        return xmlCollection.get("perimeterStart");
    }

    @Override
    public String getFigurePerimeterEndTag() {
        return xmlCollection.get("perimeterEnd");
    }

    @Override
    public String getFigureInfoStartTag() {
        return xmlCollection.get("shapeStart");
    }

    @Override
    public String getFigureInfoEndTag() {
        return xmlCollection.get("shapeEnd");
    }

    @Override
    public String getFigureGroupStartTag() {
        return xmlCollection.get("groupStart");
    }

    @Override
    public String getFigureGroupEndTag() {
        return xmlCollection.get("groupEnd");
    }

    @Override
    public String getComma() {
        return "";
    }

    @Override
    public String getNewLine() {
        return xmlCollection.get("newLine");
    }
}
