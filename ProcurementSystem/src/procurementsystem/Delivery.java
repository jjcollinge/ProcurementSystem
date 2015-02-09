package procurementsystem;

/**
 *
 * @author Simon
 */
public class Delivery {
    private Order order;
    private String deliveryStatus;
    private Boolean approval;
    private String approvedBy;
    
    public Delivery() {
        
    }
    
    /**
     * Updates the current deliveryStatus
     */
    public void updateDeliveryStatus() {
        
    }
    
    /**
     * Sets the approval boolean to true
     */
    public void approveDelivery() {
        
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
