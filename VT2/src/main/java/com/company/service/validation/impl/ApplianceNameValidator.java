package com.company.service.validation.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.service.validation.CriteriaValidator;

/**
 * ApplianceNameValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class ApplianceNameValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            ApplianceTagName.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
