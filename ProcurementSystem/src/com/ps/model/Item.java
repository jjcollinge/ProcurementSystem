package com.ps.model;

import java.io.Serializable;

/**
 * An item represents a physical item or product and encapsulates
 * data relevant to that product.
 * @author Group B
 */
public class Item implements Serializable, Comparable<Item> {
    
    // guessed these variable types as not on class diagram
    private String name;
    private double price;
    private String type;

    /**
     * Constructor
     * @param name item name
     * @param price item price
     * @param type item type
     */
    public Item(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    /**
     * Set the item price
     * @param price new price of the item
     */
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    /**
     * Set the item name
     * @param name new name of the item
     */
    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    /**
     * Set the item type
     * @param type new type of the item
     */
    public void setType(String type) {
        if(type != null) {
            this.type = type;
        }
    }

    /**
     * Get the item name
     * @return String item name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the item price
     * @return double item price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the item type
     * @return String item type
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
    
    /**
     * Override
     * Overriding object compare to to check if an item is the same as
     * another item
     * @param otherItem a different instance of the item class
     * @return int indicator code if it matches
     */
    @Override
    public int compareTo(Item otherItem) {
        if(otherItem != null) {
            int nameDiff = name.compareToIgnoreCase(otherItem.name);
            return nameDiff;
        }
        return 0;
    }
    
}
