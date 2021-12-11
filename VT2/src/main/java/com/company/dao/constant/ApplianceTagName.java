package com.company.dao.constant;

/**
 * ApplianceNameConstant enum with constants <b>LAPTOP</b>, <b>OVEN</b>,
 * <b>REFRIGERATOR</b>, <b>SPEAKERS</b>, <b>TABLET_PC</b>, <b>VACUUM_CLEANER</b>.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public enum ApplianceTagName {
    LAPTOP,
    OVEN,
    REFRIGERATOR,
    SPEAKERS,
    TABLET_PC,
    VACUUM_CLEANER;

    /**
     * Private constructor to close the ability of instantiating {@link ApplianceTagName}.
     */
    private ApplianceTagName() {
    }
}
