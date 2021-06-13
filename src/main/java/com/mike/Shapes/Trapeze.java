package com.mike.Shapes;

/**
 * The {@code Trapeze} class represents model of trapeze.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class Trapeze extends Shape{

    /** Side A of trapeze */
    private double sideA;

    /** Side A of trapeze */
    private double sideB;

    /** Side A of trapeze */
    private double sideC;

    /** Side D of trapeze (base of trapeze) */
    private double sideD;

    /** Height of trapeze */
    private double height;

    /** Length of projection side C to side B */
    private double projectionC = sideB - Math.sqrt(Math.pow(sideA, 2)
            - Math.pow(height, 2));

    /**
     * Creates trapeze with given parameters.
     *
     * @param sideAValue - given length of side A.
     * @param heightValue - given height of trapeze.
     * @param sideDValue - given length of trapeze's base.
     * @param colorValue - given color.
     */
    Trapeze(double sideAValue, double heightValue, double sideDValue, Color colorValue) {
        sideA = sideAValue;
        height = heightValue;
        sideD = sideDValue;
        color = colorValue;
        double projectionD = (sideA - sideD) / 2;
        sideB = sideC = Math.sqrt(Math.pow(projectionD, 2) + Math.pow(height, 2));
        area = (0.5 * (sideA + sideD) * height);
    }

    /**
     * Returns height value.
     *
     * @return - height value.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates area of current shape.
     *
     * @return - {@code double} value of area.
     */
    @Override
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
        return "трапеция";
    }

    /**
     * Represents information about current shape.
     *
     * @return - {@code String} with state information.
     */
    @Override
    public String showState() {
        return ("Фигура: трапеция, площадь: " + area + " кв. ед., высота: " + height + "ед., цвет: " + color.getName());
    }
}
