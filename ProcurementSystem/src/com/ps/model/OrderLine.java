package com.ps.model;

import java.io.Serializable;

/**
 * Provides a quantity of items for a specific
 * order.
 * @author Group B
 */
public class OrderLine implements Serializable {
    
    private Item item;
    private int quantity;
    
    /**
     * Default constructor
     * @param item an instance of the item class
     * @param quantity an integer representing item quantity
     */
    public OrderLine(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    /**
     * Delete Item from OrderLine
     */
    public void deleteItem() {
        this.item = null;
    }
    
    /**
     * Update the quantity
     * @param quantity a new quantity for the orderline
     */
    public void changeQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the item
     * @return Item instance of the item class
     */
    public Item getItem() {
        return item;
    }

    /**
     * Get the quantity
     * @return integer representing quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
}
