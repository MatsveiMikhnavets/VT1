package com.company.dao.constant;

/**
 * ResourceConst enum with constant <b>APPLIANCES_DB_XML</b>.
 * Contains the names of the resource files.
 *
 * @author Anastasia Golyuk
 * @version 1.0
 */
public enum ResourceConst {
    APPLIANCES_DB_XML("appliances_db.xml");

    private final String fileName;

    /**
     * Private constructor to close the ability of instantiating {@link ResourceConst}.
     *
     * @param fileName name of file
     */
    private ResourceConst(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets fileName of selected enum's item
     *
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }
}
