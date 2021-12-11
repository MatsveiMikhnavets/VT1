package com.company.dao;

import com.company.dao.impl.ApplianceDAOImpl;

/**
 * DAOFactory class with properties <b>instance</b> and <b>applianceDAO</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public final class DAOFactory {
    /**
     * Field instance - instance of {@link DAOFactory}
     */
    private static final DAOFactory instance = new DAOFactory();
    /**
     * Field applianceDAO - {@link ApplianceDAOImpl}
     */
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * Private constructor to close the ability of instantiating {@link DAOFactory}.
     */
    private DAOFactory() {
    }

    /**
     * Gets {@link ApplianceDAO}
     *
     * @return {@link ApplianceDAO}
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets instance of {@link DAOFactory}
     *
     * @return {@link DAOFactory}
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
