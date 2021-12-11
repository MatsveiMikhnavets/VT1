package com.company.service;

import com.company.service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class with properties <b>instance</b> and <b>ApplianceService</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public final class ServiceFactory {
    /**
     * Field instance - instance of {@link ServiceFactory}
     */
    private static final ServiceFactory instance = new ServiceFactory();

    /**
     * Field applianceService - {@link ApplianceServiceImpl}
     */
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    /**
     * Private constructor to close the ability of instantiating {@link ServiceFactory}.
     */
    private ServiceFactory() {
    }

    /**
     * Gets {@link ApplianceService}
     *
     * @return {@link ApplianceService}
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets instance of {@link ServiceFactory}
     *
     * @return {@link ServiceFactory} instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
