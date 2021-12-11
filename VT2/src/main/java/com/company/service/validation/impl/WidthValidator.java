package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * WidthValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class WidthValidator implements CriteriaValidator {
    private final static double MIN_WIDTH = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WIDTH;
        } else {
            return false;
        }
    }
}
