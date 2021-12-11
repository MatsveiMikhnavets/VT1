package com.company.dao.appliance_xml_factory.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_xml_factory.ApplianceXMLFactory;
import com.company.entity.Appliance;
import com.company.entity.Refrigerator;
import com.company.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * RefrigeratorXMLFactory class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class RefrigeratorXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        Element refrigeratorElement = document.createElement(ApplianceTagName.REFRIGERATOR.name().toLowerCase().replace('_', '-'));

        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.PRICE.name(), refrigerator.getPrice()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(), refrigerator.getPowerConsumption()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.WEIGHT.name(), refrigerator.getWeight()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(), refrigerator.getFreezerCapacity()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), refrigerator.getOverallCapacity()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.HEIGHT.name(), refrigerator.getHeight()));
        refrigeratorElement.appendChild(createElement(document, SearchCriteria.Refrigerator.WIDTH.name(), refrigerator.getWidth()));
        return refrigeratorElement;
    }
}
