package com.company.service.validation.impl;

import com.company.entity.Color;
import com.company.service.validation.CriteriaValidator;

/**
 * ColorValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class ColorValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
