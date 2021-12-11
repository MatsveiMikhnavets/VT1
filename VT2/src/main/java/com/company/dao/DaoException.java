package com.company.dao;

/**
 * DaoException class.
 * This class needed to throw exceptions on the DAO layer.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class DaoException extends Exception {

    /**
     * Parameterless {@link DaoException} constructor
     */
    public DaoException() {
        super();
    }

    /**
     * {@link DaoException} constructor with parameter
     *
     * @param message message
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * {@link DaoException} constructor with parameters
     *
     * @param message message
     * @param e       {@link Exception}
     */
    public DaoException(String message, Exception e) {
        super(message, e);
    }

    /**
     * {@link DaoException} constructor with parameter
     *
     * @param e {@link Exception}
     */
    public DaoException(Exception e) {
        super(e);
    }

}
