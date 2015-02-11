package com.ps.model;

import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class Item implements Serializable, Comparable<Item> {
    
    //guessed these variable types as not on class diagram
    private String name;
    private double price;
    private String type;

    public Item(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    /**
     * Set the price
     * @param price 
     */
    public void setPrice(double price) {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
    
    
    /**
     * Output information
     * @return String
     */
    @Override
    public String toString() {
        return name + " : " + type;
    }

    @Override
    public int compareTo(Item otherItem) {
        int nameDiff = name.compareToIgnoreCase(otherItem.name);
        return nameDiff;
    }
    
}
