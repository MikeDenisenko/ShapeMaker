package com.mike.Shapes;

/**
 * The {@code Triangle} class represents model of triangle.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class Triangle extends Shape {

    /** Length of side A */
    private double sideA;

    /** Length of side H (Hypotenuse) */
    private double sideH;

    /** Length of side C */
    private double sideC;

    /** Length of height */
    private double height;

    /**
     * Creates triangle with given parameters.
     *
     * @param sideAValue - length of side A
     * @param sideBValue - length of side B
     * @param heightValue - length of altitude
     */
    Triangle(double sideAValue, double sideBValue, double heightValue, Color colorValue) {

        sideA = sideAValue;
        sideH = sideBValue;
        height = heightValue;
        color = colorValue;

        double projectionC = sideH - Math.sqrt(Math.pow(sideA, 2) - Math.pow(height, 2));
        sideC = Math.sqrt(Math.pow(projectionC, 2) + Math.pow(height, 2));
        area = (sideH * height) / 2;
    }

    /**
     * Returns hypotenuse, that represented by sideC.
     *
     * @return - hypotenuse.
     */
    public double getHypotenuse() {
        return sideH;
    }

    /**
     * Returns height of triangle.
     *
     * @return - height value.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns area of current shape.
     *
     * @return - {@code double} value of area.
     */
    public double getArea() {
        return area;
    }

    /**
     * Returns area of current shape.
     *
     * @return - name of shape.
     */
    @Override
    public String draw() {
        return "треугольник";
    }

    /**
     * Represents information about current shape.
     *
     * @return - {@code String} with state information.
     */
    public String showState() {
        return ("Фигура: треугольник, площадь: " + area + " кв. ед., гипотенуза: " + sideH + "ед., цвет: " + color.getName());
    }
}


