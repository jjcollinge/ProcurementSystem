
package com.ps.model;

import static com.ps.model.OrderTest.order;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class SetOfDeliveriesTest {
    
    public SetOfDeliveriesTest() {
    }
    
    public static Delivery delivery;
    public static SetOfDeliveries setOfDeliveries;
    
    @BeforeClass
    public static void setUpClass() {
        delivery = new Delivery();
        SetOfDeliveries.setOutput("testSetOfDeliveries.ser");
        setOfDeliveries = SetOfDeliveries.getInstance();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of addDelivery method, of class SetOfDeliveries.
     */
    @Test
    public void testAddDelivery() {
        System.out.println("addDelivery");
        setOfDeliveries.addDelivery(delivery);
        assertTrue(setOfDeliveries.getListOdDeliveries().contains(delivery));
    }

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
