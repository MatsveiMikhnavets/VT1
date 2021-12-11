package com.company.dao.appliance_matcher.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_matcher.ApplianceMatcherFactory;
import com.company.entity.Appliance;
import com.company.entity.Refrigerator;
import com.company.entity.criteria.SearchCriteria;

/**
 * RefrigeratorMatcher class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class RefrigeratorMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        return switch (SearchCriteria.RefrigeratorWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> refrigerator.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> refrigerator.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> refrigerator.getPrice() == (double) value;
            case NAME -> ApplianceTagName.REFRIGERATOR.equals(value);
            case POWER_CONSUMPTION -> (double) value == refrigerator.getPowerConsumption();
            case WEIGHT -> refrigerator.getWeight() == (double) value;
            case FREEZER_CAPACITY -> refrigerator.getFreezerCapacity() == (double) value;
            case OVERALL_CAPACITY -> refrigerator.getOverallCapacity() == (double) value;
            case HEIGHT -> refrigerator.getHeight() == (double) value;
            case WIDTH -> refrigerator.getWidth() == (double) value;
        };
    }
}
