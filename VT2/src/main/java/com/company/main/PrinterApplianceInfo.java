package com.company.main;

import com.company.entity.Appliance;

import java.util.List;

/**
 * PrinterApplianceInfo class.
 * Class for printing info about found appliances.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class PrinterApplianceInfo {
    private static final String APPLIANCES_LIST_NULL_EXCEPTION_MSG = "AppliancesList is null.\nAppliancesList cannot be null!";
    private static final String APPLIANCES_LIST_EMPTY_MSG = "AppliancesList is empty (appliances not found).";

    /**
     * Prints the information about all found appliances.
     * Prints APPLIANCES_LIST_NULL_EXCEPTION_MSG if list is null.
     * Prints APPLIANCES_LIST_EMPTY_MSG if list is empty.
     *
     * @param appliances {@link List<Appliance>}
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            throw new NullPointerException(APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(APPLIANCES_LIST_EMPTY_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}
