package com.company.service.validation;

import com.company.entity.criteria.SearchCriteria;

/**
 * CriteriaValidator interface.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public interface CriteriaValidator {

    /**
     * Validate value of {@link SearchCriteria}
     * In the implementation of this method, an exception is not thrown if the data is invalid,
     * but return false, since it is more convenient to process boolean in {@link Validator} with a lambda expression.
     *
     * @param value value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
