package com.ps.model;

import com.ps.model.Order;
import java.io.Serializable;

/**
 * A delivery encapsulates an order and meta data about the delivery.
 * @author JCollinge
 */
public class Delivery implements Serializable {
    private Order order;
    private String deliveryStatus;
    private Boolean approval;
    private String approvedBy;
    private final int maxSize = 32;
    private final int minSize = 3;
    
    /**
     * Ctor
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
     * Sets the approval boolean to true
     */
    public void approveDelivery() {
        approval = true;
        approvedBy = "Kumar Kalla";
    }
    
    /**
     * Rest the delivery status
     */
    public void resetDelivery() {
        approval = false;
        deliveryStatus = "Pending";
    }
    
    /**
     * Gets the order of the delivery
     * @return 
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Returns whether or no the delivery has been approved
     * @return 
     */
    public Boolean getApproval() {
        return approval;
    }

    /**
     * Get delivery status
     * @return 
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Get who the delivery was approved by
     * @return 
     */
    public String getApprovedBy() {
        return approvedBy;
    }
    
    /**
     * Sets the order of the Delivery
     * @param order
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    
}
