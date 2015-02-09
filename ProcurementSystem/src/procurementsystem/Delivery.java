package procurementsystem;

import java.io.Serializable;

/**
 *
 * @author Simon
 */
public class Delivery implements Serializable {
    private Order order;
    private String deliveryStatus;
    private Boolean approval;
    private String approvedBy;
    
    public Delivery() {
        
    }
    
    /**
     * Updates the current deliveryStatus
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
}
