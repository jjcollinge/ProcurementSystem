package com.ps.model;

import com.ps.model.Order;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import com.ps.app.DataAccessObject;

/**
 *
 * @author Simon
 */
public class SetOfOrders implements Serializable {
    private ArrayList<Order> orders;
    private static SetOfOrders singleton;
    private final String filename = "setOfOrders.ser";
    
    private SetOfOrders() {
        orders = (ArrayList<Order>)DataAccessObject.Deserialize(filename);
        if(orders == null) {
            System.out.println("Couldn't load orders file, creating a new set");
            orders = new ArrayList<Order>();
        }
    }
    
    public static SetOfOrders getInstance() {
        if(singleton == null) {
            singleton = new SetOfOrders();     
        }
        return singleton;
    }
    
    /**
     * Filter orders by Date
     * n.b. unspecified parameters
     */
    public ArrayList<Order> filterByDate(Date date) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        for(Order order : orders) {
            if(order.hasSameDate(date)){
                tmp.add(order);
            }
        }
        return tmp;
    }
    
    /**
     * Filter by site
     * n.b. unspecified parameters
     */
    public ArrayList<Order>  filterBySite(String site) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        for(Order order : orders) {
            if(order.getOrderDate().equals(site)) {
                tmp.add(order);
            }
        }
        return tmp;
    }
    
    /**
     * Filter by supplier
     * n.b. unspecified parameters
     */
    public ArrayList<Order>  filterBySupplier(String supplier) {
        ArrayList<Order> tmp = new ArrayList<Order>();
        for(Order order : orders) {
            if(order.getOrderDate().equals(supplier)) {
                tmp.add(order);
            }
        }
        return tmp;
    }
    
    /**
     * Add Order to orders
     * n.b. unspecified parameters
     */
    public void addOrder(Order order) {
        orders.add(order);
        DataAccessObject.Serialize(orders, filename);
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
            if(order.getOrderStatus().equalsIgnoreCase("Pending")) {
                openOrders.add(order);
            }
        }
        return openOrders;
    }
}
