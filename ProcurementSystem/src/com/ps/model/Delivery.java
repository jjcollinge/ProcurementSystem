package com.ps.model;

import java.io.Serializable;

/**
 * A delivery encapsulates an order and meta data about the delivery.
 * @author Group B
 */
public class Delivery implements Serializable {
    private Order order;
    private String deliveryStatus;
    private Boolean approval;
    private String approvedBy;
    
    // max and min deliverys status sizes
    private final int maxSize = 32;
    private final int minSize = 3;
    
    /**
     * Constructor
     */
    public Delivery() {
        approval = false;
        deliveryStatus = "Pending";
    }
    
    /**
     * Updates the current deliveryStatus
     * @param status status to set
     */
    public void updateDeliveryStatus(String status) {
        if(status != null && status.matches("[a-zA-Z]+") && status.length() <= maxSize && status.length() > minSize) {
            deliveryStatus = status;
        }
    }
    
    /**
     * Sets the approval boolean to true.
     */
    public void approveDelivery() {
        approval = true;
        approvedBy = "Kumar Kalla";
    }
    
    /**
     * Rest the delivery status.
     */
    public void resetDelivery() {
        approval = false;
        deliveryStatus = "Pending";
    }
    
    /**
     * Gets the order of the delivery
     * @return Order an instance of the order class
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Returns whether or no the delivery has been approved
     * @return Boolean approval
     */
    public Boolean getApproval() {
        return approval;
    }

    /**
     * Get delivery status
     * @return String delivery status
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Get who the delivery was approved by
     * @return String approved by
     */
    public String getApprovedBy() {
        return approvedBy;
    }
    
    /**
     * Sets the order of the Delivery
     * @param order an instance of the order class
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    
}
