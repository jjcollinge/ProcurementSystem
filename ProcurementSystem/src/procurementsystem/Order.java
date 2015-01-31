package procurementsystem;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Simon
 */
public class Order {
    private ArrayList<OrderLine> orderLines;
    private Date orderDate;
    private String orderStatus;
    private String specialInstructions;
    private String site;
    
    public Order() {
        orderLines = new ArrayList<OrderLine>();
    }
    
    /**
     * Cancels the Order
     */
    public void cancelOrder() {
        
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
        
    }
    
    /**
     * Update any of the Order variables
     */
    public void amendOrder() {
        
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
     * Print the invoice of the Order
     */
    public void printInvoice() {
        
    }
    
    public ArrayList<OrderLine> getOrderLines() {
        return this.orderLines;
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
    
}
