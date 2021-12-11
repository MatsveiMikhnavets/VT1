package com.company.service;

/**
 * ServiceException class.
 * This class needed to throw exceptions on the service layer.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class ServiceException extends Exception {

    /**
     * Parameterless {@link ServiceException} constructor
     */
    public ServiceException() {
        super();
    }

    /**
     * {@link ServiceException} constructor with parameter
     *
     * @param message message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * {@link ServiceException} constructor with parameters
     *
     * @param message message
     * @param e       {@link Exception}
     */
    public ServiceException(String message, Exception e) {
        super(message, e);
    }

    /**
     * {@link ServiceException} constructor with parameter
     *
     * @param e {@link Exception}
     */
    public ServiceException(Exception e) {
        super(e);
    }

}
