package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Refrigerator class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>weight</b>, <b>freezerCapacity</b>, <b>overallCapacity</b>, <b>height</b>,
 * <b>width</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Refrigerator extends Appliance implements Serializable {
    /**
     * Field powerConsumption of {@link Refrigerator}
     */
    private double powerConsumption;
    /**
     * Field weight of {@link Refrigerator}
     */
    private double weight;
    /**
     * Field freezerCapacity of {@link Refrigerator}
     */
    private double freezerCapacity;
    /**
     * Field overallCapacity of {@link Refrigerator}
     */
    private double overallCapacity;
    /**
     * Field height of {@link Refrigerator}
     */
    private double height;
    /**
     * Field width of {@link Refrigerator}
     */
    private double width;

    /**
     * Parameterless {@link Refrigerator} constructor
     */
    public Refrigerator() {
    }

    /**
     * {@link Refrigerator} constructor with parameters
     *
     * @param price            price
     * @param powerConsumption power consumption
     * @param weight           weight
     * @param freezerCapacity  freezer capacity
     * @param overallCapacity  overall capacity
     * @param height           height
     * @param width            width
     */
    public Refrigerator(double price, double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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
     * Gets weight value
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets freezerCapacity value
     *
     * @return freezerCapacity
     */
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Gets overallCapacity value
     *
     * @return overallCapacity
     */
    public double getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Gets height value
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets width value
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 && Double.compare(that.weight, weight) == 0 && Double.compare(that.freezerCapacity, freezerCapacity) == 0 && Double.compare(that.overallCapacity, overallCapacity) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
