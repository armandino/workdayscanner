package com.infa.products.ldm.scanners.workdayscanner.model;

public class WService {

    private String name;
    private String description;

    public WService(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
