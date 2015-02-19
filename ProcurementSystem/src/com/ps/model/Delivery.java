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
    
    /**
     * Ctor
     */
    public Delivery() {
        
    }
    
    /**
     * Updates the current deliveryStatus
     * @param status status to set
     */
    public void updateDeliveryStatus(String status) {
        deliveryStatus = status;
    }
    
    /**
     * Sets the approval boolean to true
     */
    public void approveDelivery() {
        approval = true;
        approvedBy = "Kumar Kalla";
    }

    /**
     * Change the delivery status
     * @param deliveryStatus 
     */
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
    /**
     * Sets the order of the Delivery
     * @param order
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Returns whether or no the delivery has been approved
     * @return 
     */
    public Boolean getApproval() {
        return approval;
    }

    /**
     * Set the approval state of this delivery
     * @param approval 
     */
    public void setApproval(Boolean approval) {
        this.approval = approval;
    }
    
    
}
