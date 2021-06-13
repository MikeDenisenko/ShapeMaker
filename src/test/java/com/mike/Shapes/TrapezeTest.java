package com.mike.Shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrapezeTest {

    Trapeze trapeze;

    @Before
    public void initTest() {
        trapeze = new Trapeze(10, 10, 30, Color.RED);
    }

    @Test
    public void shouldReturnExpectedHeight() {
        assertEquals(10, trapeze.getHeight(),0.1);
    }

    @Test
    public void shouldReturnExpectedArea() {
        assertEquals(200, trapeze.getArea(), 0.1);
    }

    @Test
    public void shouldReturnExpectedName() {
        assertEquals("трапеция", trapeze.draw());
    }

    @Test
    public void shouldReturnExpectedDescription() {
        assertEquals("Фигура: трапеция, площадь: 200.0 кв. ед., высота: 10.0ед., цвет: красный", trapeze.showState());
    }
}