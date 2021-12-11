package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * WeightValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class WeightValidator implements CriteriaValidator {
    private final static double MIN_WEIGHT = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WEIGHT;
        } else {
            return false;
        }
    }
}
