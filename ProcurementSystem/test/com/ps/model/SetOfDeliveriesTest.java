package com.ps.model;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite to test the methods in the setOfDeliveries class
 * @author Group B
 */
public class SetOfDeliveriesTest {
    
    public static Delivery delivery;
    public static SetOfDeliveries setOfDeliveries;
    
    /**
     * Set up objects needed for the test suite to run.
     */
    @BeforeClass
    public static void setUpClass() {
        delivery = new Delivery();
        SetOfDeliveries.setOutput("testSetOfDeliveries.ser");
        setOfDeliveries = SetOfDeliveries.getInstance();
    }
    
    /**
     * Test that deliveries can be added to a set of deliveries
     */
    @Test
    public void testAddDelivery() {
        System.out.println("addDelivery");
        setOfDeliveries.addDelivery(delivery);
        assertTrue(setOfDeliveries.getListOdDeliveries().contains(delivery));
    }

    /**
     * Test that the getOrder method of delivery returns values
     * correctly.
     */
    @Test
    public void testOrderInDelivery() {
        System.out.println("addDelivery");
        Order order = new Order();
        Item concrete = new Item("Concrete", 3.00, "Bag");
        Item bolts = new Item("Bolts", 4.50, "Sack"); 
        order.addItem(concrete, 2);
        order.addItem(bolts, 10);
        
        delivery.setOrder(order);
        assertTrue(delivery.getOrder().equals(order));
    }
  
}
