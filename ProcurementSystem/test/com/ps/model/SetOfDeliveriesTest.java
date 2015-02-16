
package com.ps.model;

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
        boolean expectedAdded = true;
        boolean actuallyAdded = setOfDeliveries.getListOdDeliveries().contains(delivery);
        assertEquals(expectedAdded, actuallyAdded);
    }

}
