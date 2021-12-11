package com.company.dao.appliance_matcher.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.dao.appliance_matcher.ApplianceMatcherFactory;
import com.company.entity.Appliance;
import com.company.entity.Speakers;
import com.company.entity.criteria.SearchCriteria;

/**
 * SpeakersMatcher class.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class SpeakersMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Speakers speakers = (Speakers) appliance;

        return switch (SearchCriteria.SpeakersWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> speakers.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> speakers.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> speakers.getPrice() == (double) value;
            case NAME -> ApplianceTagName.SPEAKERS.equals(value);
            case POWER_CONSUMPTION -> (double) value == speakers.getPowerConsumption();
            case NUMBER_OF_SPEAKERS -> (int) value == speakers.getNumberOfSpeakers();
            case CORD_LENGTH -> (double) value == speakers.getCordLength();
        };
    }
}
