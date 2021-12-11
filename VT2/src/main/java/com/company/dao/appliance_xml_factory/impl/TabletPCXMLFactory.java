package com.company.dao.appliance_xml_factory.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_xml_factory.ApplianceXMLFactory;
import com.company.entity.Appliance;
import com.company.entity.TabletPC;
import com.company.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * TabletPCXMLFactory class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class TabletPCXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        Element tabletPCElement = document.createElement(ApplianceTagName.TABLET_PC.name().toLowerCase().replace('_', '-'));

        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.PRICE.name(), tabletPC.getPrice()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), tabletPC.getBatteryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.DISPLAY_INCHES.name(), tabletPC.getDisplayInches()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.MEMORY_ROM.name(), tabletPC.getMemoryRom()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), tabletPC.getFlashMemoryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.COLOR.name(), tabletPC.getColor()));
        return tabletPCElement;
    }
}
