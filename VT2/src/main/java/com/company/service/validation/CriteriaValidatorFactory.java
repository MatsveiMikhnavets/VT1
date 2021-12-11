package com.company.service.validation;

import com.company.entity.criteria.SearchCriteria;
import com.company.service.constant.ServiceExceptionMessage;
import com.company.service.validation.impl.*;
import com.company.service.validation.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * CriteriaValidatorFactory class with properties <b>instance</b> and <b>validators</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class CriteriaValidatorFactory {
    /**
     * Field instance - instance of {@link CriteriaValidatorFactory}
     */
    private static final CriteriaValidatorFactory instance = new CriteriaValidatorFactory();
    /**
     * Field validators - {@link HashMap} of validators
     */
    private final Map<String, CriteriaValidator> validators = new HashMap<>();

    //In future plans, this initialization of validators will be
    // changed by pattern, for example - Chain of Responsibility.
    {
        validators.put(SearchCriteria.General.NAME.name(), new ApplianceNameValidator());
        validators.put(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.PriceFilter.EQUAL_CURRENT_PRICE.name(), new PriceValidator());

        validators.put(SearchCriteria.Laptop.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Laptop.OS.name(), new OSValidator());
        validators.put(SearchCriteria.Laptop.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.Laptop.CPU.name(), new CPUValidator());
        validators.put(SearchCriteria.Laptop.DISPLAY_INCHES.name(), new DisplayInchesValidator());

        validators.put(SearchCriteria.Oven.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Oven.WEIGHT.name(), new WeightValidator());
        validators.put(SearchCriteria.Oven.CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Oven.DEPTH.name(), new DepthValidator());
        validators.put(SearchCriteria.Oven.HEIGHT.name(), new HeightValidator());
        validators.put(SearchCriteria.Oven.WIDTH.name(), new WidthValidator());

        validators.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Refrigerator.WEIGHT.name(), new WeightValidator());
        validators.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Refrigerator.HEIGHT.name(), new HeightValidator());
        validators.put(SearchCriteria.Refrigerator.WIDTH.name(), new WidthValidator());

        validators.put(SearchCriteria.Speakers.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(), new NumberOfSpeakersValidator());
        validators.put(SearchCriteria.Speakers.CORD_LENGTH.name(), new CordLengthValidator());

        validators.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.DISPLAY_INCHES.name(), new DisplayInchesValidator());
        validators.put(SearchCriteria.TabletPC.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.COLOR.name(), new ColorValidator());

        validators.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.name(), new FilterTypeValidator());
        validators.put(SearchCriteria.VacuumCleaner.WAND_TYPE.name(), new WandTypeValidator());
        validators.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(), new MotorSpeedRegulationValidator());
        validators.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name(), new CleaningWidthValidator());
    }

    /**
     * Private constructor to close the ability of instantiating {@link CriteriaValidatorFactory}.
     */
    private CriteriaValidatorFactory() {
    }

    /**
     * Gets instance of {@link CriteriaValidatorFactory}
     *
     * @return {@link CriteriaValidatorFactory} instance
     */
    public static CriteriaValidatorFactory getInstance() {
        return instance;
    }

    /**
     * Gets {@link CriteriaValidator} for a specific {@link SearchCriteria}
     * If there is no such {@link SearchCriteria}, an {@link IllegalArgumentException} is thrown.
     *
     * @param criteriaName criteriaName to get validator
     * @return {@link CriteriaValidator}  specific validator
     */
    public CriteriaValidator getValidator(String criteriaName) {
        if (validators.containsKey(criteriaName)) {
            return validators.get(criteriaName);
        }
        throw new IllegalArgumentException(ServiceExceptionMessage.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG.getMessage());
    }

}
