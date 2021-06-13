package com.mike.Shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;

    @Before
    public void initTest() {
        circle = new Circle(5, Color.BLUE);
    }

    @Test
    public void shouldReturnExpectedRadius() {
        assertEquals(5, circle.getRadius(), 0);
    }

    @Test
    public void shouldReturnExpectedName() {
        assertEquals("круг", circle.draw());
    }

    @Test
    public void shouldReturnExpectedArea() {
        assertEquals(78.5, circle.getArea(), 0.1);
    }

    @Test
    public void shouldReturnExpectedDescription() {
        assertEquals("Фигура: круг, площадь: 78.5 кв. ед., радиус: 5ед., цвет: синий", circle.showState());
    }
}