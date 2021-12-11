package com.company.dao.appliance_matcher.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_matcher.ApplianceMatcherFactory;
import com.company.entity.Appliance;
import com.company.entity.Oven;
import com.company.entity.criteria.SearchCriteria;

/**
 * OvenMatcher class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class OvenMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Oven oven = (Oven) appliance;

        return switch (SearchCriteria.OvenWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> oven.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> oven.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> oven.getPrice() == (double) value;
            case NAME -> ApplianceTagName.OVEN.equals(value);
            case POWER_CONSUMPTION -> oven.getPowerConsumption() == (double) value;
            case WEIGHT -> oven.getWeight() == (double) value;
            case CAPACITY -> oven.getCapacity() == (double) value;
            case DEPTH -> oven.getDepth() == (double) value;
            case HEIGHT -> oven.getHeight() == (double) value;
            case WIDTH -> oven.getWidth() == (double) value;
        };
    }
}
