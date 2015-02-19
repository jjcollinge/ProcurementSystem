package com.ps.model;

import java.io.Serializable;

/**
 * Provides a quantity of items for a specific
 * order.
 * @author JCollinge
 */
public class OrderLine implements Serializable {
    private Item item;
    private int quantity;
    
    /**
     * Default constructor
     * @param item
     * @param quantity
     */
    public OrderLine(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    /**
     * Delete Item from OrderLine
     */
    public void deleteItem() {
        
    }
    
    /**
     * Update the quantity
     */
    public void changeQuantity() {
        
    }

    /**
     * Get the item
     * @return 
     */
    public Item getItem() {
        return item;
    }

    /**
     * Get the quantity
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }
    
}
