package com.company.service.constant;

import com.company.service.ServiceException;

/**
 * ServiceExceptionMessage enum.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public enum ServiceExceptionMessage {
    INVALID_CRITERIA_EXCEPTION_MSG("Criteria is not Valid!"),
    ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG("No such appliance search criteria exists.");

    private final String message;

    /**
     * Private constructor to close the ability of instantiating {@link ServiceExceptionMessage}.
     *
     * @param message message of {@link ServiceException}
     */
    private ServiceExceptionMessage(String message) {
        this.message = message;
    }

    /**
     * Gets message
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }
}
