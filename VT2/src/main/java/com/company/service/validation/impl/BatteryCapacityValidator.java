package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * BatteryCapacityValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class BatteryCapacityValidator implements CriteriaValidator {
    private final static double MIN_BATTERY_CAPACITY = 0.0;
    private final static double MAX_BATTERY_CAPACITY = 200000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double batteryCapacity = (Double) value;
            return ((batteryCapacity > MIN_BATTERY_CAPACITY) && (batteryCapacity < MAX_BATTERY_CAPACITY));
        } else {
            return false;
        }
    }
}
