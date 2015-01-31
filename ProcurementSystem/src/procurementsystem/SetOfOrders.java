package procurementsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class SetOfOrders implements Serializable {
    private ArrayList<Order> orders;
    
    /**
     * Filter orders by Date
     * n.b. unspecified parameters
     */
    public void filterByDate() {
        
    }
    
    /**
     * Filter by site
     * n.b. unspecified parameters
     */
    public void filterBySite() {
        
    }
    
    /**
     * Filter by supplier
     * n.b. unspecified parameters
     */
    public void filterBySupplier() {
        
    }
    
    /**
     * Add Order to orders
     * n.b. unspecified parameters
     */
    public void addOrder() {
        
    }
    
    /**
     * Get Order
     * n.b. shouldn't return null
     * @return Order
     */
    public Order getOrder() {
        return null;
    }
    
    /**
     * Return all orders
     * n.b. shouldn't return null
     * @return SetOfOrders
     */
    public SetOfOrders getAllOrders() {
        return null;
    }
    
    /**
     * Return open orders
     * n.b. shouldn't return null
     * @return SetOfOrders
     */
    public SetOfOrders getOpenOrders() {
        return null;
    }
}
