package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Oven class with properties <b>price</b>, <b>powerConsumption</b>,
 * <b>weight</b>, <b>capacity</b>, <b>depth</b>, <b>height</b>, <b>width</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Oven extends Appliance implements Serializable {
    /**
     * Field powerConsumption of {@link Oven}
     */
    private double powerConsumption;
    /**
     * Field weight of {@link Oven}
     */
    private double weight;
    /**
     * Field capacity of {@link Oven}
     */
    private double capacity;
    /**
     * Field depth of {@link Oven}
     */
    private double depth;
    /**
     * Field height of {@link Oven}
     */
    private double height;
    /**
     * Field width of {@link Oven}
     */
    private double width;

    /**
     * Parameterless {@link Oven} constructor
     */
    public Oven() {
    }

    /**
     * {@link Oven} constructor with parameters
     *
     * @param price            price
     * @param powerConsumption power consumption
     * @param weight           weight
     * @param capacity         capacity
     * @param depth            depth
     * @param height           height
     * @param width            width
     */
    public Oven(double price, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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
     * Gets capacity value
     *
     * @return capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Gets depth value
     *
     * @return depth
     */
    public double getDepth() {
        return depth;
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
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption && Double.compare(oven.weight, weight) == 0 && capacity == oven.capacity && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "price=" + super.getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
