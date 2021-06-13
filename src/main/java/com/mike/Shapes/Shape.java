package com.mike.Shapes;

/**
 * The {@code Shape} is the superclass of all classes representing a shapes.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public abstract class Shape {

    /** Represents area of the current shape object */
    double area;

    /** Shapes color */
    Color color;

    /**
     * Calculates area of current shape.
     *
     * @return - {@code double} value of area.
     */
    public abstract double getArea();

    /**
     * Represents information about current shape.
     *
     * @return - {@code String} with state information.
     */
    public abstract String showState();

    /**
     * Returns text representation of the shape.
     *
     * @return - name of the shape.
     */
    public abstract String draw();

}
