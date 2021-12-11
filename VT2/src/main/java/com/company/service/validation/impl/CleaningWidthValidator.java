package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * CleaningWidthValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class CleaningWidthValidator implements CriteriaValidator {
    private final static double MIN_CLEANING_WIDTH = 0.0;
    private final static double MAX_CLEANING_WIDTH = 1000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double cleaningWidth = (Double) value;
            return ((cleaningWidth > MIN_CLEANING_WIDTH) && (cleaningWidth < MAX_CLEANING_WIDTH));
        } else {
            return false;
        }
    }
}
