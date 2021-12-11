package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

/**
 * MemoryRomValidator class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class MemoryRomValidator implements CriteriaValidator {
    private final static double MIN_MEMORY_ROM = 0.0;
    private final static double MAX_MEMORY_ROM = 100000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double memoryRom = (Double) value;
            return ((memoryRom > MIN_MEMORY_ROM) && (memoryRom < MAX_MEMORY_ROM));
        } else {
            return false;
        }
    }
}
