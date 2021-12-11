package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Appliance class with property <b>price</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Appliance implements Serializable {

    /**
     * Field price - price of {@link Appliance}
     */
    private double price;

    /**
     * Parameterless {@link Appliance} constructor
     */
    public Appliance() {
    }

    /**
     * {@link Appliance} constructor with a parameter
     *
     * @param price price
     */
    public Appliance(double price) {
        this.price = price;
    }

    /**
     * Gets price value
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                '}';
    }
}
