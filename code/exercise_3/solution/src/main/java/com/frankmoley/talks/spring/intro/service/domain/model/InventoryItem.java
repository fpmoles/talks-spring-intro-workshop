package com.frankmoley.talks.spring.intro.service.domain.model;

/**
 * A specific inventory item with the base details.
 */
public class InventoryItem {
    private long itemId;
    private String name;
    private String manufacturer;
    private int quantity;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
