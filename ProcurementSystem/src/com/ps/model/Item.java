package com.ps.model;

import java.io.Serializable;

/**
 * An item represents a physical item or product and encapsulates
 * data relevant to that product.
 * @author JCollinge
 */
public class Item implements Serializable, Comparable<Item> {
    
    //guessed these variable types as not on class diagram
    private String name;
    private double price;
    private String type;

    /**
     * Ctor
     * @param name
     * @param price
     * @param type 
     */
    public Item(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    /**
     * Set the item price
     * @param price 
     */
    public void setPrice(double price) {
        
    }

    /**
     * Set the item name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the item type
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the item name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Get the item price
     * @return 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the item type
     * @return 
     */
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
        if(otherItem != null) {
            int nameDiff = name.compareToIgnoreCase(otherItem.name);
            return nameDiff;
        }
        return 0;
    }
    
}
