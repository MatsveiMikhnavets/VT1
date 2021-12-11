package com.company.dao.appliance_xml_factory.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_xml_factory.ApplianceXMLFactory;
import com.company.entity.Appliance;
import com.company.entity.Oven;
import com.company.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * OvenXMLFactory class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class OvenXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Oven oven = (Oven) appliance;
        Element ovenElement = document.createElement(ApplianceTagName.OVEN.name().toLowerCase().replace('_', '-'));

        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.PRICE.name(), oven.getPrice()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.POWER_CONSUMPTION.name(), oven.getPowerConsumption()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.WEIGHT.name(), oven.getWeight()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.CAPACITY.name(), oven.getCapacity()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.DEPTH.name(), oven.getDepth()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.HEIGHT.name(), oven.getHeight()));
        ovenElement.appendChild(createElement(document, SearchCriteria.Oven.WIDTH.name(), oven.getWidth()));
        return ovenElement;
    }
}
