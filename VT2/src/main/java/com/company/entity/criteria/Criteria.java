package com.company.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class with properties <b>criteriaMap</b>, <b>groupSearchName</b>.
 * Contains a criteriaMap of SearchCriteria for further filtering using it.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public class Criteria {
    /**
     * Field criteriaMap contains {@link SearchCriteria} for further filtering
     */
    private final Map<String, Object> criteriaMap = new HashMap<>();
    /**
     * Field groupSearchName
     */
    private final String groupSearchName;

    /**
     * {@link Criteria} constructor with parameters
     *
     * @param groupSearchName group search name
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    /**
     * Gets groupSearchName
     *
     * @return groupSearchName
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Gets criteriaMap
     *
     * @return criteriaMap
     */
    public Map<String, Object> getCriteriaMap() {
        return criteriaMap;
    }

    /**
     * Adds new {@link SearchCriteria} with value to criteriaMap
     */
    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }
}
