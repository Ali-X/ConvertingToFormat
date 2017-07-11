package ali_x.ua.convertation.formats.collection;

import java.util.ArrayList;
import java.util.List;

public class XMLCollection implements Collection {

    List<String> xmlCollection = new ArrayList<>();

    public XMLCollection() {
        xmlCollection.add(0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xmlCollection.add(1, "");
        xmlCollection.add(2, "<name>");
        xmlCollection.add(3, "</name>");
        xmlCollection.add(4, "<area>");
        xmlCollection.add(5, "</area>");
        xmlCollection.add(6, "<perimeter>");
        xmlCollection.add(7, "</perimeter>");
        xmlCollection.add(8, "<shape>");
        xmlCollection.add(9, "</shape>");
        xmlCollection.add(10, "<group>");
        xmlCollection.add(11, "</group>");
        xmlCollection.add(12, "\n");
    }

    @Override
    public String getHead() {
        return xmlCollection.get(0);
    }

    @Override
    public String getBottom() {
        return xmlCollection.get(1);
    }

    @Override
    public String getFigureNameStartTag() {
        return xmlCollection.get(2);
    }

    @Override
    public String getFigureNameEndTag() {
        return xmlCollection.get(3);
    }

    @Override
    public String getFigureAreaStartTag() {
        return xmlCollection.get(4);
    }

    @Override
    public String getFigureAreaEndTag() {
        return xmlCollection.get(5);
    }

    @Override
    public String getFigurePerimeterStartTag() {
        return xmlCollection.get(6);
    }

    @Override
    public String getFigurePerimeterEndTag() {
        return xmlCollection.get(7);
    }

    @Override
    public String getFigureInfoStartTag() {
        return xmlCollection.get(8);
    }

    @Override
    public String getFigureInfoEndTag() {
        return xmlCollection.get(9);
    }

    @Override
    public String getFigureGroupStartTag() {
        return xmlCollection.get(10);
    }

    @Override
    public String getFigureGroupEndTag() {
        return xmlCollection.get(11);
    }

    @Override
    public String getComma() {
        return "";
    }

    @Override
    public String getNewLine() {
        return xmlCollection.get(12);
    }
}
