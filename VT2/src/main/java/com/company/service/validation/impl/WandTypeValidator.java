package com.company.service.validation.impl;

import com.company.entity.WandType;
import com.company.service.validation.CriteriaValidator;

/**
 * WandTypeValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class WandTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            WandType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
