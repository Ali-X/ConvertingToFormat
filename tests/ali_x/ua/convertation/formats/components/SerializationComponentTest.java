package ali_x.ua.convertation.formats.components;

import ali_x.ua.convertation.formats.collection.JSONCollection;
import ali_x.ua.convertation.formats.collection.XMLCollection;
import ali_x.ua.convertation.shapes.CircleComponent;
import ali_x.ua.convertation.shapes.SquareComponent;
import ali_x.ua.convertation.shapes.TriangleComponent;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class SerializationComponentTest {

    DataHolder dataHolder;

    @Before
    public void setUp() throws Exception {
        dataHolder = DataHolder.getInstance();
        dataHolder.getString().setLength(0);
    }

    @Test
    public void testTrueXml() throws IOException {
        dataHolder.getString().setLength(0);
        dataHolder.setCollection(new XMLCollection());
        String fileName = "D:\\Mate.Academy\\Projects\\HomeTask_3_1\\tests\\ali_x\\ua\\convertation\\formats\\components\\xml.xml";
        String expectedResult = new String(Files.readAllBytes(Paths.get(fileName)));
        String actualResult;

        SerializationComponent mainGroup = new XMLGroup();
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

        subGroup3.add(new XMLComponent(new SquareComponent(7)));
        mainGroup.Serialize();
        actualResult = dataHolder.getString().toString();
        assertEquals("testTrueXml", expectedResult, actualResult);
    }

    @Test
    public void testTrueJson() throws IOException {
        dataHolder.getString().setLength(0);
        dataHolder.setCollection(new JSONCollection());
        String fileName = "D:\\Mate.Academy\\Projects\\HomeTask_3_1\\tests\\ali_x\\ua\\convertation\\formats\\components\\json.json";
        String expectedResult = new String(Files.readAllBytes(Paths.get(fileName)));
        String actualResult;

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
        actualResult = dataHolder.getString().toString();
        assertEquals("testTrueJson", expectedResult, actualResult);
    }

}