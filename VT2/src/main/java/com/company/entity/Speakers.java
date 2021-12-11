package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Speakers class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>numberOfSpeakers</b>, <b>cordLength</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Speakers extends Appliance implements Serializable {
    /**
     * Field powerConsumption of {@link Speakers}
     */
    private double powerConsumption;
    /**
     * Field numberOfSpeakers of {@link Speakers}
     */
    private int numberOfSpeakers;
    /**
     * Field cordLength of {@link Speakers}
     */
    private double cordLength;


    /**
     * Parameterless {@link Speakers} constructor
     */
    public Speakers() {
    }

    /**
     * {@link Speakers} constructor with parameters
     *
     * @param price            price
     * @param powerConsumption power consumption
     * @param numberOfSpeakers number of speakers
     * @param cordLength       cord length
     */
    public Speakers(double price, double powerConsumption, int numberOfSpeakers, double cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
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
     * Gets numberOfSpeakers value
     *
     * @return numberOfSpeakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * Gets cordLength value
     *
     * @return cordLength
     */
    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0 && numberOfSpeakers == speakers.numberOfSpeakers && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "price=" + super.getPrice() +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLength=" + cordLength +
                '}';
    }
}
