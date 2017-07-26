package ali_x.ua.convertation.main;

import ali_x.ua.convertation.formats.collection.JSONCollection;
import ali_x.ua.convertation.formats.components.DataHolder;
import ali_x.ua.convertation.formats.components.JSONComponent;
import ali_x.ua.convertation.formats.components.JSONGroup;
import ali_x.ua.convertation.formats.components.SerializationComponent;
import ali_x.ua.convertation.shapes.CircleComponent;
import ali_x.ua.convertation.shapes.SquareComponent;
import ali_x.ua.convertation.shapes.TriangleComponent;

public class Client {

    public static void main(String[] args) {

        DataHolder dataHolder = DataHolder.getInstance();
        dataHolder.setCollection(new JSONCollection());

        //xml
/*        SerializationComponent mainGroup = new XMLGroup();
        SerializationComponent subGroup1 = new XMLGroup();
        SerializationComponent subGroup2 = new XMLGroup();
        SerializationComponent subGroup3 = new XMLGroup();

        mainGroup.add(new XMLComponent(new CircleComponent(5)));
        mainGroup.add(subGroup1);
        mainGroup.add(new XMLComponent(new SquareComponent(3)));
        mainGroup.add(new XMLComponent(new TriangleComponent(4, 5, 6, 2)));

        subGroup1.add(new XMLComponent(new CircleComponent(6)));
        subGroup1.add(new XMLComponent(new SquareComponent(1)));
        subGroup1.add(subGroup2);
        subGroup1.add(new XMLComponent(new TriangleComponent(3, 6, 2, 3)));

        subGroup2.add(new XMLComponent(new CircleComponent(8)));
        subGroup2.add(new XMLComponent(new SquareComponent(2)));
        subGroup2.add(subGroup3);

        subGroup3.add(new XMLComponent(new SquareComponent(7)));*/

        //json
        SerializationComponent mainGroup = new JSONGroup();
        SerializationComponent subGroup1 = new JSONGroup();
        SerializationComponent subGroup2 = new JSONGroup();
        SerializationComponent subGroup3 = new JSONGroup();

        mainGroup.add(new JSONComponent(new CircleComponent(5)));
        mainGroup.add(subGroup1);
        mainGroup.add(new JSONComponent(new SquareComponent(3)));
        mainGroup.add(new JSONComponent(new TriangleComponent(4, 5, 6, 2)));

        subGroup1.add(new JSONComponent(new CircleComponent(6)));
        subGroup1.add(new JSONComponent(new SquareComponent(1)));
        subGroup1.add(subGroup2);
        subGroup1.add(new JSONComponent(new TriangleComponent(3, 6, 2, 3)));

        subGroup2.add(new JSONComponent(new CircleComponent(8)));
        subGroup2.add(new JSONComponent(new SquareComponent(2)));
        subGroup2.add(subGroup3);

        subGroup3.add(new JSONComponent(new SquareComponent(7)));


        mainGroup.Serialize();
        dataHolder.printString();
    }

}
