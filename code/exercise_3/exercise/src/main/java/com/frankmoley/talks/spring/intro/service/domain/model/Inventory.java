package com.frankmoley.talks.spring.intro.service.domain.model;

import java.util.List;

/**
 * The Inventory DTO provides information about the user and his/her inventory items
 */
public class Inventory {
    private String emailAddress;
    private String firstName;
    private long personId;
    List<InventoryItem> items;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }
}
