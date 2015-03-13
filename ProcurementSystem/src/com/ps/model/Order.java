package com.ps.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Represents an in system order. Hold data
 * relevant to ordering a product.
 * @author Group B
 */
public class Order implements Serializable {
    
    private ArrayList<OrderLine> orderLines;
    private Date orderDate;
    private String orderStatus;
    private String specialInstructions;
    private String site;
    
    /**
     * Constructor
     */
    public Order() {
        orderLines = new ArrayList<OrderLine>();
        this.orderStatus = "Pending";
        this.specialInstructions = "";
        this.site = "";
        this.orderDate = new Date();
    }
    
    /**
     * Cancel the Order
     */
    public void cancelOrder() {
        orderLines.clear();
    }

    /**
     * Set the order status
     * @param orderStatus a new order status for the order
     */
    public void setOrderStatus(String orderStatus) {
        if(orderStatus != null) {
            this.orderStatus = orderStatus;
        }
    }

    /**
     * Set the order site
     * @param site a new site for the order
     */
    public void setSite(String site) {
        if(site != null) {
            this.site = site;
        }
    }

    /**
     * Set the order date
     * @param orderDate a new order date for the order
     */
    public void setOrderDate(Date orderDate) {
        if(orderDate != null) {
            this.orderDate = orderDate;
        }
    }
    
    /**
     * Set specialInstructions String
     * @param instructions new instructions for the order
     */
    public void addSpecialInstructions(String instructions) {
        if(instructions != null) {
           this.specialInstructions = instructions;
        }
    }
    
    /**
     * Returns the orderDate
     * @return Date the order date of the order
     */
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    /**
     * WARNING: In Class diagram but use not clear.
     * Update any of the Order variables
     */
    public void amendOrder() {
        
    }
    
    /**
     * Remove an item from the order
     */
    public void removeItem(Item item, int qty) {
        Iterator iter = orderLines.iterator();
        while(iter.hasNext()) {
            OrderLine ol = (OrderLine) iter.next();
            if(ol.getItem().equals(item)) {
                if(this.orderLines.remove(ol)) {
                    System.out.println("Successfully delete item from order");
                    return;
                } else {
                    System.out.println("Couldn't delete item from order");
                }
            }
        }
    }
    
    /**
     * Return orderStatus
     * @return String
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }
    
    /**
     * WARNING: In class diagram but we didn't know what needed to be
     * included in the audit trail
     */
    public void getAuditTrail() {
        
    }
    
    /**
     * WARNING: In Class diagram but use not clear.
     * Print the invoice of the Order
     */
    public void printInvoice() {
        
    }
    
    /**
     * Get all order lines for this order
     * @return ArrayList a list of orders orderlines
     */
    public ArrayList<OrderLine> getOrderLines() {
        return this.orderLines;
    }

    /**
     * Get the special instructions for this order
     * @return String special instructions
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Get the site of this order
     * @return String order site
     */
    public String getSite() {
        return site;
    }
    
    /**
     * Add an Item to Order
     * @param item an instance of the item class
     * @param quantity a quantity attached to this item
     */
    public void addItem(Item item, int quantity) {
        if(item != null && quantity > 0) {
            boolean itemExists = false;
            for (OrderLine oL : orderLines) {
                if (oL.getItem().getName().equals(item.getName())) {
                    itemExists = true;
                }
            }
            
            if(!itemExists) {
                OrderLine orderLine = new OrderLine(item, quantity);
                orderLines.add(orderLine);
            }
        }
    }

    /**
     * Override toString method to output the date of the order
     * @return String formatted date
     */
    @Override
    public String toString() {
        return new SimpleDateFormat("HH:mm dd/M/yyyy").format(orderDate) 
                + " - \"" 
                + specialInstructions.substring(0, 25) 
                + "...\" : " + orderStatus;
    }
    
    /**
     * Compare dates for equality
     * @param date a different instance of the date class
     * @return boolean indicating success
     */
    public boolean hasSameDate(Date date) {
        if(date != null) {
            if(this.orderDate.getYear() == date.getYear() &&
            this.orderDate.getMonth() == date.getMonth() &&
                this.orderDate.getDay() == date.getDay()) {
                    return true;
                }
        }
        return false;
    }
    
}
