package com.mike.Shapes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * The {@code Main} class provides methods for executing operations with shapes
 * and contains entry point.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class Main {

    /** org.apache.logging.log4j.Logger */
    final static private Logger LOG = LogManager.getLogger(Main.class);

    /**
     * Creates random shapes and puts them to array.
     *
     * @return - array of random shapes.
     */
    public Shape[] createShapeArray() {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(10)];
        ShapeFactory shapeFactory = new ShapeFactory();

        try {
            for (int i = 0; i < shapes.length; i++) {
                shapes[i] = shapeFactory.createShape(random.nextInt(3));
                shapes[i].getArea();
            }
        }catch (InvalidShapeTypeException ex) {
            LOG.info(ex.message);
        }

        return shapes;
    }

    /**
     * Sorts array by an shapes area value.
     * @param shapes - given array.
     * @return - sorted array.
     */
    public Shape[] sortArrayByArea(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            Shape tempShape;
            for (int j = 0; j < shapes.length; j++) {
                if(shapes[i].area > shapes[j].area){
                    tempShape = shapes[i];
                    shapes[i] = shapes[j];
                    shapes[j] = tempShape;
                }
            }
        }
        return shapes;
    }

    /**
     * Displays all shapes in given array.
     * @param shapes - given array.
     */
    public void showShapeArray(Shape[] shapes) {
        for (Shape shape: shapes) {
            LOG.info(shape.showState());
        }
    }

    /**
     * Method entry point.
     *
     * @param args - properties.
     */
    public static void main(String[] args) {
        Main mainShape = new Main();

        Shape[] shapes = mainShape.createShapeArray();

        shapes = mainShape.sortArrayByArea(shapes);

        mainShape.showShapeArray(shapes);
    }
}
