package com.ps.interfaces;

/**
 * Parent class for all individual user interfaces.
 * Should encapsulate common data and process.
 * @author Group B
 */
public abstract class UserInterface extends javax.swing.JFrame {
    
    /**
     * File to store set of orders
     */
    protected static final String SetOfOrdersFile = "setOfOrders.ser";
    
    /**
     * Wrapper method to invoke the JFrame thread
     */
    public abstract void Run();
    
    /**
     * Method to keep all ui's in the same position 
     * when navigating through
     * @param x
     * @param y 
     */
    public abstract void setPosition(int x, int y);
}
