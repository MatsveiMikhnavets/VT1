package com.company.service;

import com.company.entity.Appliance;
import com.company.entity.criteria.Criteria;
import com.company.dao.DaoException;
import com.company.entity.criteria.SearchCriteria;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public interface ApplianceService {

    /**
     * Validates {@link SearchCriteria} and finds all {@link Appliance} that match the given search criteria.
     *
     * @param criteria {@link SearchCriteria} with which sorting occurs
     * @return {@link List<Appliance>}  list of {@link Appliance} found
     * @throws DaoException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;


    /**
     * Adds {@link Appliance} to xml-file.
     *
     * @param applianceName name of {@link Appliance}
     * @param appliance     {@link Appliance}
     * @return true when added without exception, otherwise false
     * @throws DaoException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException;

}
