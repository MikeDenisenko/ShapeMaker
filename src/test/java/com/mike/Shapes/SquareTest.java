package com.mike.Shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square;

    @Before
    public void initTest(){
        square = new Square(5, Color.GREEN);
    }

    @Test
    public void shouldReturnExpectedSide() {
       assertEquals(5, square.getSide(), 0.1);
    }

    @Test
    public void shouldReturnExpectedArea() {
        assertEquals(25, square.getArea(), 0.1);
    }

    @Test
    public void shouldReturnExpectedName() {
        assertEquals("квадрат", square.draw());
    }

    @Test
    public void shouldReturnExpectedDescription() {
        assertEquals("Фигура: квадрат, площадь: 25.0 кв. ед., длинна стороны: 5.0ед., цвет: зеленый", square.showState());
    }
}