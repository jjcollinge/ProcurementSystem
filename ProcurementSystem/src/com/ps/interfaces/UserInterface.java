package com.ps.interfaces;

/**
 * Parent class for all individual user interfaces.
 * Should encapsulate common data and process.
 * @author JC
 */
public abstract class UserInterface extends javax.swing.JFrame {
    
    /**
     * File to store set of orders
     */
    protected static final String SetOfOrdersFile = "setOfOrders.ser";
    
    /**
     * In the design document this is here, but 
     * this should be overridden in each UI specialisation.
     * This could be an interface class which extends
     * Runnable.
     */
    
    /**
     * Wrapper method to invoke the JFrame thread
     */
    public abstract void Run();
    
    public abstract void setPosition(int x, int y);
}
