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

    OrderLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Delete Item from OrderLine
     */
    public void deleteItem(Item item) {
        this.item = null;
    }
    
    /**
     * Update the quantity
     */
    public void changeQuantity(int qty) {
        this.quantity = qty;
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
