package com.company.dao.impl;

import com.company.dao.ApplianceDAO;
import com.company.dao.DaoException;
import com.company.dao.appliance_factory.ApplianceFactory;
import com.company.dao.appliance_matcher.ApplianceMatcherFactory;
import com.company.dao.appliance_xml_factory.ApplianceXMLFactory;
import com.company.dao.constant.ResourceConst;
import com.company.entity.Appliance;
import com.company.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplianceDAOImpl class.
 * Implements {@link ApplianceDAO}.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class ApplianceDAOImpl implements ApplianceDAO {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<Appliance> appliances = new ArrayList<>();
        try {
            Document document = getDocument(ResourceConst.APPLIANCES_DB_XML.getFileName());
            NodeList nodeList = document.getDocumentElement().getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    String modifiedNodeName = node.getNodeName().toUpperCase().replace('-', '_');
                    if (criteria.getGroupSearchName().isEmpty() || criteria.getGroupSearchName().equals(modifiedNodeName)) {
                        ApplianceFactory applianceFactory = ApplianceFactory.getApplianceFactory(modifiedNodeName);
                        Appliance appliance = applianceFactory.createAppliance(node.getChildNodes());

                        if (criteria.getCriteriaMap()
                                .entrySet()
                                .stream()
                                .allMatch(entry -> ApplianceMatcherFactory.getMatcher(modifiedNodeName).isMatchesCriteria(appliance, entry.getKey(), entry.getValue()))) {
                            appliances.add(appliance);
                        }
                    }
                }
            }
        } catch (EnumConstantNotPresentException | IllegalArgumentException e) {
            throw new DaoException(e);
        }
        return appliances;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(String applianceName, Appliance appliance) throws DaoException {
        try {
            Document document = getDocument(ResourceConst.APPLIANCES_DB_XML.getFileName());
            Element root = document.getDocumentElement();
            String modifiedApplianceName = applianceName.toUpperCase().replace('-', '_');

            root.appendChild(ApplianceXMLFactory.getApplianceXMLFactory(modifiedApplianceName).createApplianceXML(document, appliance));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            Source source = new DOMSource(document);
            StreamResult result = new StreamResult(Objects.requireNonNull(getClass().getClassLoader().getResource(ResourceConst.APPLIANCES_DB_XML.getFileName())).getFile());
            transformer.transform(source, result);
        } catch (TransformerException | EnumConstantNotPresentException e) {
            throw new DaoException(e);
        }
        return true;
    }

    /**
     * Reads the information from xml file (the name of this file
     * is from {@link ResourceConst}, it is in the resource folder).
     *
     * @param fileName name of XML-file
     * @return {@link Document}
     * @throws DaoException when throwing an exception on a DAO layer
     */
    private Document getDocument(String fileName) throws DaoException {
        Document document;
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            document = documentBuilder.parse(Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).getFile());
            document.getDocumentElement().normalize();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new DaoException(e);
        }
        return document;
    }

}