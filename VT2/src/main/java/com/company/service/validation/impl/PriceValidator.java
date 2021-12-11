package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * PriceValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class PriceValidator implements CriteriaValidator {
    private final static double MIN_PRICE = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_PRICE;
        } else
            return false;
    }
}
