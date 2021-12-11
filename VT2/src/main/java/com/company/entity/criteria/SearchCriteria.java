package com.company.entity.criteria;

/**
 * SearchCriteria class.
 * Contains all search criteria.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public final class SearchCriteria {

    /**
     * Contains {@link General} search criteria
     */
    public enum General {
        NAME
    }

    /**
     * Contains {@link com.company.entity.Oven} search criteria
     */
    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Contains {@link com.company.entity.Laptop} search criteria
     */
    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    /**
     * Contains {@link com.company.entity.Refrigerator} search criteria
     */
    public enum Refrigerator {
        PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Contains {@link com.company.entity.VacuumCleaner} search criteria
     */
    public enum VacuumCleaner {
        PRICE, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Contains {@link com.company.entity.TabletPC} search criteria
     */
    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Contains {@link com.company.entity.Speakers} search criteria
     */
    public enum Speakers {
        PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH
    }

    /**
     * Contains {@link PriceFilter} search criteria
     */
    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }


    /*
     * ApplianceSearchCriteria enums with PriceFilter for ApplianceMatcherFactory.
     */


    /**
     * Contains {@link Oven} and {@link PriceFilter} search criteria
     */
    public enum OvenWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    /**
     * Contains {@link Laptop} and {@link PriceFilter} search criteria
     */
    public enum LaptopWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    /**
     * Contains {@link Refrigerator} and {@link PriceFilter} search criteria
     */
    public enum RefrigeratorWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    /**
     * Contains  {@link VacuumCleaner} and {@link PriceFilter} search criteria
     */
    public enum VacuumCleanerWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    /**
     * Contains {@link TabletPC} and {@link PriceFilter} search criteria
     */
    public enum TabletPCWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    /**
     * Contains {@link Speakers} and {@link PriceFilter} search criteria
     */
    public enum SpeakersWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH
    }

    /**
     * Private constructor to close the ability of instantiating SearchCriteria.
     */
    private SearchCriteria() {
    }
}

