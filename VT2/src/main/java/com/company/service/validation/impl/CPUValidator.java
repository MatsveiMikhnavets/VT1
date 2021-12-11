package com.company.service.validation.impl;

import com.company.entity.CPU;
import com.company.service.validation.CriteriaValidator;

/**
 * CPUValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class CPUValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
