package com.ps.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import com.ps.app.ObjectMapper;

/**
 * Collection class for orders. Holds all orders
 * currently in the system.
 * @author Group B
 */
public class SetOfOrders implements Serializable {
    
    private ArrayList<Order> orders;
    private static SetOfOrders singleton;
    private static String filename = "setOfOrders.ser";
    
    /**
     * private Constructor
     */
    private SetOfOrders() {
        orders = (ArrayList<Order>)ObjectMapper.Deserialize(filename);
        if(orders == null) {
            System.out.println("Couldn't load orders file, creating a new set");
            orders = new ArrayList<Order>();
        }
    }
    
    /**
     * Lazy load and get the singleton instance
     * @return 
     */
    public static SetOfOrders getInstance() {
        if(singleton == null) {
            singleton = new SetOfOrders();     
        }
        return singleton;
    }
    
    /**
     * Set the output for serialization
     * @param fname a new filename
     */
    public static void setOutput(String fname) {
        filename = fname;
    }
    
    /**
     * Filter orders by Date
     * n.b. unspecified parameters
     * @param date to filter by
     * @return ArrayList filtered list
     */
    public ArrayList<Order> filterByDate(Date date) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        for(Order order : orders) {
            if(order != null) {
                if(order.getOrderDate() != null) {
                    if(order.hasSameDate(date)){
                        tmp.add(order);
                    }
                }
            }
        }
        return tmp;
    }
    
    /**
     * Filter by site
     * n.b. unspecified parameters
     * @param site to filter by
     * @return ArrayList filtered list
     */
    public ArrayList<Order>  filterBySite(String site) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        if(site != null) { 
            for(Order order : orders) {
                if(order != null) {
                    if(order.getSite() != null) {
                        if(order.getSite().equalsIgnoreCase(site)) {
                            tmp.add(order);
                        }
                    } 
                }
            }
        }
        return tmp;
    }
    
    /**
     * Filter orders by supplier
     * n.b. unspecified parameters
     * @param supplier to filter by
     * @return ArrayList filtered list
     */
    public ArrayList<Order>  filterBySupplier(String supplier) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        for(Order order : orders) {
            // filter by supplier doesnt exist
        }
        return tmp;
    }
    
    /**
     * Add Order to orders
     * n.b. unspecified parameters 
     */
    public void addOrder(Order order) {
        if(order != null) {
            if(!orders.contains(order)) {
                orders.add(order);
                ObjectMapper.Serialize(orders, filename);
            }
        }
    }
    
    /**
     * Get Order
     * @return Order
     */
    public Order getOrder(int index) {
        return orders.get(index);
    }
    
    /**
     * Serialize data when updating the orders
     */
    public void onUpdate() {
        ObjectMapper.Serialize(orders, filename);
    }
    
    /**
     * Return all orders
     * n.b. changed from returning SetOfOrders as that would return an instance 
     * of the class not a list of orders
     * @return SetOfOrders
     */
    public ArrayList<Order> getAllOrders() {
        return orders;
    }
    
    /**
     * Return open orders
     * n.b. shouldn't return null
     * @return SetOfOrders
     */
    public ArrayList<Order> getOpenOrders() {
        ArrayList<Order> openOrders = new ArrayList<>();
        for(Order order : orders) {
            if (order != null)
            {
            if(order.getOrderStatus().equalsIgnoreCase("Pending")) {
                openOrders.add(order);
            }
            }
        }
        return openOrders;
    }
    
    /**
     * Clear the orders in set of orders
     */
    public void clear() {
        orders.clear();
    }
    
}
