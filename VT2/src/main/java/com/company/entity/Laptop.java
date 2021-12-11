package com.company.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Laptop class with properties <b>price</b>, <b>batteryCapacity</b>,
 * <b>os</b>, <b>memoryRom</b>, <b>cpu</b>, <b>displayInches</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Laptop extends Appliance implements Serializable {
    /**
     * Field batteryCapacity of {@link Laptop}
     */
    private double batteryCapacity;
    /**
     * Field {@link OS} of {@link Laptop}
     */
    private OS os;
    /**
     * Field memoryRom of {@link Laptop}
     */
    private double memoryRom;
    /**
     * Field {@link CPU} of {@link Laptop}
     */
    private CPU cpu;
    /**
     * Field displayInches of {@link Laptop}
     */
    private double displayInches;

    /**
     * Parameterless {@link Laptop} constructor
     */
    public Laptop() {
    }

    /**
     * {@link Laptop} constructor with parameters
     *
     * @param price            price
     * @param battery_capacity battery capacity
     * @param os               {@link OS}
     * @param memory_rom       memory rom
     * @param cpu              {@link CPU}
     * @param displayInches    display inches
     */
    public Laptop(double price, double battery_capacity, OS os, double memory_rom, CPU cpu, double displayInches) {
        super(price);
        this.batteryCapacity = battery_capacity;
        this.os = os;
        this.memoryRom = memory_rom;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    /**
     * Gets batteryCapacity value
     *
     * @return batteryCapacity
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Gets {@link OS} value
     *
     * @return {@link OS}
     */
    public OS getOs() {
        return os;
    }

    /**
     * Gets memoryRom value
     *
     * @return memoryRom
     */
    public double getMemoryRom() {
        return memoryRom;
    }

    /**
     * Gets {@link CPU} value
     *
     * @return {@link CPU}
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * Gets displayInches value
     *
     * @return displayInches
     */
    public double getDisplayInches() {
        return displayInches;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity && memoryRom == laptop.memoryRom && Double.compare(laptop.displayInches, displayInches) == 0 && os == laptop.os && cpu == laptop.cpu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, os, memoryRom, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + super.getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                ", os=" + os +
                ", memoryRom=" + memoryRom +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
