package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * CordLengthValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class CordLengthValidator implements CriteriaValidator {
    private final static double MIN_CORD_LENGTH = 0.0;
    private final static double MAX_CORD_LENGTH = 100.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cordLength = (Double) value;
            return ((cordLength > MIN_CORD_LENGTH) && (cordLength < MAX_CORD_LENGTH));
        } else {
            return false;
        }
    }
}
