package com.company.service.validation.impl;

import com.company.entity.FilterType;
import com.company.service.validation.CriteriaValidator;

/**
 * FilterTypeValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class FilterTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
