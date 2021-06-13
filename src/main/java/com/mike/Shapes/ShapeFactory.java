package com.mike.Shapes;

/**
 * The {@code WritingToolsFactory} provides creating new objects of writing tools.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class ShapeFactory {

    /**
     * Creates new shape objects
     * @param code - code for creating an objects of required type.
     * @return - new {@code Shape} object.
     */
    public Shape createShape(int code)
            throws InvalidShapeTypeException {
        Shape shape;
        switch (code) {
        case 0:
            shape = new Circle(2, Color.RED);
            break;
        case 1:
            shape = new Square(5, Color.BLUE);
            break;
        case 2:
            shape = new Triangle(5, 5, 4.33, Color.GREEN);
            break;
        case 3:
            shape = new Trapeze(10, 10, 30, Color.YELLOW);
            break;
        default:
            throw new InvalidShapeTypeException(code);
        }
        return shape;
    }
}
