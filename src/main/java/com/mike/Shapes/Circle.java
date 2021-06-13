package com.mike.Shapes;

/**
 * The {@code Circle} class represents model of circle.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class Circle extends Shape {

    /** Radius of circle */
    private double radius;

    /**
     * Creates circle with given parameters.
     *
     * @param radiusValue - length of radius.
     */
    Circle(double radiusValue, Color colorValue){
        radius = radiusValue;
        color = colorValue;
        area = Math.pow(radius, 2) * 3.14;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Calculates area of current shape.
     *
     * @return - {@code double} value of area.
     */
    public double getArea() {
        return area;
    }

    /**
     * Returns shapes name.
     *
     * @return - name of shape.
     */
    @Override
    public String draw() {
        return "круг";
    }

    /**
     * Represents information about current shape.
     *
     * @return - {@code String} with state information.
     */
    public String showState() {
        return ("Фигура: круг, площадь: " + area + " кв. ед., радиус: " + 5 + "ед., цвет: " + color.getName());
    }
}
