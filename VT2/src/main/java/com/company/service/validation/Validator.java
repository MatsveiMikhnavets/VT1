package com.company.service.validation;

import com.company.entity.criteria.Criteria;
import com.company.entity.criteria.SearchCriteria;

/**
 * Validator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Validator {

    /**
     * Validates criteria by its {@link SearchCriteria}.
     *
     * @param criteria {@link Criteria} to validate
     * @return true if criteria is valid. Otherwise, false.
     */
    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}