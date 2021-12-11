package com.company.service.validation.impl;

import com.company.entity.OS;
import com.company.service.validation.CriteriaValidator;

/**
 * OSValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class OSValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
