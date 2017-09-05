package com.frankmoley.talks.spring.intro.service.domain.model;

import java.sql.Date;

public class DetailedInventoryItem  extends InventoryItem{
    private String description;
    private Double cost;
    private Date acquired;
    private String model;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAcquired() {
        return acquired;
    }

    public void setAcquired(Date acquired) {
        this.acquired = acquired;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
