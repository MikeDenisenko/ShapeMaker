package com.mike.Shapes;

/**
 * The {@code InvalidShapeTypeException} class provides an exception that
 * appears during creating object.
 *
 * @version 1.0
 * @author Mikhail Denisenko
 */
public class InvalidShapeTypeException extends Throwable {

    /** Description of the exception */
    String message;

    /** Takes wrong code mentioned in method and forms a message */
    public InvalidShapeTypeException(int code) {
        message = "Type code are not exists" + code;
    }
}
