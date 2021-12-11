package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * VacuumCleaner class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>filterType</b>, <b>bagType</b>, <b>wandType</b>, <b>motorSpeedRegulation</b>,
 * <b>cleaningWidth</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class VacuumCleaner extends Appliance implements Serializable {
    /**
     * Field powerConsumption of {@link VacuumCleaner}
     */
    private double powerConsumption;
    /**
     * Field {@link FilterType} of {@link VacuumCleaner}
     */
    private FilterType filterType;
    /**
     * Field {@link BagType} of {@link VacuumCleaner}
     */
    private BagType bagType;
    /**
     * Field {@link WandType} of {@link VacuumCleaner}
     */
    private WandType wandType;
    /**
     * Field motorSpeedRegulation of {@link VacuumCleaner}
     */
    private double motorSpeedRegulation;
    /**
     * Field cleaningWidth of {@link VacuumCleaner}
     */
    private double cleaningWidth;

    /**
     * Parameterless {@link VacuumCleaner} constructor
     */
    public VacuumCleaner() {
    }

    /**
     * {@link VacuumCleaner} constructor with parameters
     *
     * @param price                price
     * @param powerConsumption     power consumption
     * @param filterType           {@link FilterType}
     * @param bagType              {@link BagType}
     * @param wandType             {@link WandType}
     * @param motorSpeedRegulation motor speed regulation
     * @param cleaningWidth        cleaning width
     */
    public VacuumCleaner(double price, double powerConsumption, FilterType filterType, BagType bagType, WandType wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    /**
     * Gets powerConsumption value
     *
     * @return powerConsumption
     */
    public double getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Gets {@link FilterType} value
     *
     * @return {@link FilterType}
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Gets {@link BagType} value
     *
     * @return {@link BagType}
     */
    public BagType getBagType() {
        return bagType;
    }

    /**
     * Gets {@link WandType} value
     *
     * @return {@link WandType}
     */
    public WandType getWandType() {
        return wandType;
    }

    /**
     * Gets motorSpeedRegulation value
     *
     * @return motorSpeedRegulation
     */
    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Gets cleaningWidth value
     *
     * @return cleaningWidth
     */
    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 && Double.compare(that.cleaningWidth, cleaningWidth) == 0 && filterType == that.filterType && bagType == that.bagType && wandType == that.wandType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
