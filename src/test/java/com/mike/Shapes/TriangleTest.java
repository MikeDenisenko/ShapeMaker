package com.mike.Shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void initTest() {
        triangle = new Triangle(5, 5, 4.33, Color.YELLOW);
    }

    @Test
    public void shouldReturnExpectedHypotenuse() {
        assertEquals(5.0, triangle.getHypotenuse(), 0.1);
    }

    @Test
    public void shouldReturnExpectedArea() {
        assertEquals(10.825, triangle.getArea(), 0.1);
    }

    @Test
    public void shouldReturnExpectedName() {
        assertEquals("треугольник", triangle.draw());
    }

    @Test
    public void shouldReturnExpectedDescription() {
        assertEquals("Фигура: треугольник, площадь: 10.825 кв. ед., гипотенуза: 5.0ед., цвет: желтый",
                triangle.showState());
    }
}