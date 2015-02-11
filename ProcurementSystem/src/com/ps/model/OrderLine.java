package com.ps.model;

import java.io.Serializable;

/**
 *
 * @author Simon
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

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
    
}