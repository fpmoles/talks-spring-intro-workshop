package com.frankmoley.talks.spring.intro.exersize5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Item Entity represents a specific inventory item for a person. No inventory item can be stored without a person.
 */
@Entity
@Table(name="ITEM")
public class ItemEntity {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="MANUFACTURER")
    private String manufacturer;
    @Column(name="MODEL")
    private String model;
    @Column(name="QUANTITY")
    private int quantity;
    @Column(name="PERSON_ID")
    private long  personId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemEntity{");
        sb.append("description='").append(description).append('\'');
        sb.append(", id=").append(id);
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", personId=").append(personId);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
