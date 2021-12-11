package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * NumberOfSpeakersValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class NumberOfSpeakersValidator implements CriteriaValidator {
    private final static double MIN_NUMBER_OF_SPEAKERS = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > MIN_NUMBER_OF_SPEAKERS;
        } else {
            return false;
        }
    }
}
