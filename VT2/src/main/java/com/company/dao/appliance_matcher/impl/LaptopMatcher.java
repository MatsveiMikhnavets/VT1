package com.company.dao.appliance_matcher.impl;

import com.company.dao.appliance_matcher.ApplianceMatcherFactory;
import com.company.dao.constant.ApplianceTagName;
import com.company.entity.Appliance;
import com.company.entity.CPU;
import com.company.entity.Laptop;
import com.company.entity.OS;
import com.company.entity.criteria.SearchCriteria;

/**
 * LaptopMatcher class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class LaptopMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Laptop laptop = (Laptop) appliance;

        return switch (SearchCriteria.LaptopWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> laptop.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> laptop.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> laptop.getPrice() == (double) value;
            case NAME -> ApplianceTagName.LAPTOP.equals(value);
            case BATTERY_CAPACITY -> laptop.getBatteryCapacity() == (double) value;
            case OS -> laptop.getOs().equals(OS.valueOf((String) value));
            case MEMORY_ROM -> laptop.getMemoryRom() == (double) value;
            case CPU -> laptop.getCpu().equals(CPU.valueOf((String) value));
            case DISPLAY_INCHES -> laptop.getDisplayInches() == (double) value;
        };
    }
}
