package com.frankmoley.intro;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Frank P. Moley III.
 */
public class Widget implements Serializable {


    private static final long serialVersionUID = 1L;

    private final String id;
    private String name;
    private String description;
    private double cost;
    private double price;

    public Widget(){
        super();
        this.id = UUID.randomUUID().toString();
    }

    public Widget(String id){
        super();
        this.id = id;
    }

    public String getId() {
        return id;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
