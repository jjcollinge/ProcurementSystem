package com.ps.model;

import com.ps.app.ObjectMapper;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Represents an in system order. Hold data
 * relevant to ordering a product.
 * @author JCollinge
 */
public class Order implements Serializable {
    private ArrayList<OrderLine> orderLines;
    private Date orderDate;
    private String orderStatus;
    private String specialInstructions;
    private String site;
    
    /**
     * Ctor
     */
    public Order() {
        orderLines = new ArrayList<OrderLine>();
        this.orderStatus = "Pending";
        this.specialInstructions = "";
        this.site = "";
        this.orderDate = new Date();
    }
    
    /**
     * Cancels the Order
     */
    public void cancelOrder() {
        orderLines.clear();
    }

    /**
     * Set the order status
     * @param orderStatus 
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        
    }

    /**
     * Set the order site
     * @param site 
     */
    public void setSite(String site) {
        this.site = site;
    }
    
    /**
     * Returns the orderDate
     * @return Date
     */
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    /**
     * Set specialInstructions String
     * @param instructions 
     */
    public void addSpecialInstructions(String instructions) {
        this.specialInstructions = instructions;
    }
    
    /**
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
     * Return audit trail
     */
    public void getAuditTrail() {
        
    }

    /**
     * Set the order date
     * @param orderDate 
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    /**
     * Print the invoice of the Order
     */
    public void printInvoice() {
        
    }
    
    /**
     * Get all order lines for this order
     * @return 
     */
    public ArrayList<OrderLine> getOrderLines() {
        return this.orderLines;
    }

    /**
     * Get the special instructions for this order
     * @return 
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Get the site of this order
     * @return 
     */
    public String getSite() {
        return site;
    }
    
    /**
     * Add an Item to Order
     * @param item
     * @param quantity 
     */
    public void addItem(Item item, int quantity) {
        OrderLine orderLine = new OrderLine(item, quantity);
        orderLines.add(orderLine);
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("HH:mm dd/M/yyyy").format(orderDate) + " - \"" + specialInstructions.substring(0, 25) + "...\" : " + orderStatus;
    }
    
    /**
     * Compare dates for equality
     * @param date
     * @return success
     */
    public boolean hasSameDate(Date date) {
        if(this.orderDate.getYear() == date.getYear() &&
            this.orderDate.getMonth() == date.getMonth() &&
                this.orderDate.getDay() == date.getDay()) {
                    return true;
                }
        return false;
    }
}
