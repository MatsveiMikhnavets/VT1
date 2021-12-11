package com.company.dao.appliance_matcher;

import com.company.dao.appliance_matcher.impl.*;
import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_matcher.impl.*;
import com.company.entity.Appliance;

/**
 * ApplianceMatcherFactory abstract class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public abstract class ApplianceMatcherFactory {
    /**
     * Criterion match method.
     *
     * @param appliance    specific {@link Appliance}
     * @param criteriaName name of criteria by which the comparison will be made
     * @param value        value to compare by criteria
     * @return true if appliance matches the given criteriaName and value. Otherwise, it returns false.
     */
    public abstract boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value);

    /**
     * Gets {@link ApplianceMatcherFactory} of {@link Appliance} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of {@link Appliance}
     * @return {@link ApplianceMatcherFactory}
     */
    public static ApplianceMatcherFactory getMatcher(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopMatcher();
                case OVEN -> new OvenMatcher();
                case REFRIGERATOR -> new RefrigeratorMatcher();
                case SPEAKERS -> new SpeakersMatcher();
                case TABLET_PC -> new TabletPCMatcher();
                case VACUUM_CLEANER -> new VacuumCleanerMatcher();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }

}
