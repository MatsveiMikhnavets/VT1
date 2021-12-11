package com.company.dao.appliance_xml_factory.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_xml_factory.ApplianceXMLFactory;
import com.company.entity.Appliance;
import com.company.entity.Laptop;
import com.company.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * LaptopXMLFactory class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class LaptopXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        Element laptopElement = document.createElement(ApplianceTagName.LAPTOP.name().toLowerCase().replace('_', '-'));

        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.PRICE.name(), laptop.getPrice()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.BATTERY_CAPACITY.name(), laptop.getBatteryCapacity()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.OS.name(), String.valueOf(laptop.getOs())));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.MEMORY_ROM.name(), laptop.getMemoryRom()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.CPU.name(), laptop.getCpu()));
        laptopElement.appendChild(createElement(document, SearchCriteria.Laptop.DISPLAY_INCHES.name(), laptop.getDisplayInches()));
        return laptopElement;
    }

}
