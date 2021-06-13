package com.mike.Shapes;

/**
 * The {@code Square} class represents model of square.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class Square extends Shape {

    /** Side of square */
    private double side;

    /**
     * Creates square with given parameters.
     *
     * @param sideValue - length of side.
     */
    Square(double sideValue, Color colorValue) {
        side = sideValue;
        color = colorValue;
        area = Math.pow(side, 2);
    }

    /**
     * Returns side length.
     *
     * @return - length of square's side.
     */
    public double getSide() {
        return side;
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
     * Returns name of shape.
     *
     * @return - name of shape.
     */
    @Override
    public String draw() {
        return "квадрат";
    }

    /**
     * Represents information about current shape.
     *
     * @return - {@code String} with state information.
     */
    public String showState() {
        return ("Фигура: квадрат, площадь: " + area + " кв. ед., длинна стороны: " + side + "ед., цвет: " + color.getName());
    }
}
