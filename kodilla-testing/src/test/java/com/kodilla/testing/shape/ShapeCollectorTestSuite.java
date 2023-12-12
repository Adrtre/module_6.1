package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {


    private ShapeCollector shapeCollector;

    @BeforeEach
    void setUp() {
        shapeCollector = new ShapeCollector();
    }

    @AfterEach
    void tearDown() {
        shapeCollector = null;
    }

    @Nested
    @DisplayName("When adding and removing shapes")
    class AddAndRemoveShapes {

        @Test
        @DisplayName("Should add shape to the collection")
        void testAddFigure1() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 5);
            Shape circle = new Circle("Circle", 3);
            //Shape triangle = new Triangle("Triangle", 5);
            //when
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            //then
            assertTrue(shapeCollector.getShapes().contains(square));
            assertTrue(shapeCollector.getShapes().contains(circle));

        }

        @Test
        @DisplayName("Should remove shape from the collection")
        void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 5);
            Shape circle = new Circle("Circle", 3);
            //when
            shapeCollector.removeFigure(square);
            shapeCollector.removeFigure(circle);
            //then
            assertFalse(shapeCollector.getShapes().contains(square));
            assertFalse(shapeCollector.getShapes().contains(circle));
        }
    }

    @Nested
    @DisplayName("When retrieving shapes from the collection")
    class GetShapes {

        @Test
        @DisplayName("Should get shape from the collection by index")
        void testGetFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 5);
            Shape circle = new Circle("Circle", 3);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            // When
            Shape retrievedSquare = shapeCollector.getFigure(0);
            Shape retrievedCircle = shapeCollector.getFigure(1);

            // Then
            assertEquals(square, retrievedSquare);
            assertEquals(circle, retrievedCircle);
        }

        @Test
        @DisplayName("Should return null when trying to get shape with invalid index")
        void testGetInvalidIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 5);
            shapeCollector.addFigure(square);

            // When
            Shape retrievedShape = shapeCollector.getFigure(1);

            // Then
            assertNull(retrievedShape);
        }
    }

    @Test
    @DisplayName("Should show names of all shapes in the collection")
    void testShowFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        // Czy tutaj można jakoś ominąć aby nie musieć podawać zmiennych int czy zawsze musze podać pełny zakres zmiennych
        Shape square = new Square("Square", 5);
        Shape circle = new Circle("Circle", 3);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        // When
        String result = shapeCollector.showFigures();

        // Then
        //Troche leniwie ale powinno być w klasie shapecollector metoda odzielająca stringi spacjami :)
        assertEquals("SquareCircle", result);
    }
}
