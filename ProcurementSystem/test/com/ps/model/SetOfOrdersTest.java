
package com.ps.model;

import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class SetOfOrdersTest {
    
    public static Order order;
    public static SetOfOrders setOfOrders;
    
    public SetOfOrdersTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        order = new Order();
        setOfOrders = SetOfOrders.getInstance();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInstance method, of class SetOfOrders.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SetOfOrders expResult = null;
        SetOfOrders result = SetOfOrders.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterByDate method, of class SetOfOrders.
     */
    @Test
    public void testFilterByDate() {
        System.out.println("filterByDate");
        Date date = null;
        SetOfOrders instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.filterByDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterBySite method, of class SetOfOrders.
     */
    @Test
    public void testFilterBySite() {
        System.out.println("filterBySite");
        String site = "";
        SetOfOrders instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.filterBySite(site);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterBySupplier method, of class SetOfOrders.
     */
    @Test
    public void testFilterBySupplier() {
        System.out.println("filterBySupplier");
        String supplier = "";
        SetOfOrders instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.filterBySupplier(supplier);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrder method, of class SetOfOrders.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addDelivery");
        setOfOrders.addOrder(order);
        boolean expectedAdd = true;
        boolean actuallyAdd = setOfOrders.getAllOrders().contains(order);
        assertEquals(expectedAdd, actuallyAdd);
    }

    /**
     * Test of getOrder method, of class SetOfOrders.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        SetOfOrders instance = null;
        Order expResult = null;
        Order result = instance.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllOrders method, of class SetOfOrders.
     */
    @Test
    public void testGetAllOrders() {
        System.out.println("getAllOrders");
        SetOfOrders instance = null;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getAllOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenOrders method, of class SetOfOrders.
     */
    @Test
    public void testGetOpenOrders() {
        System.out.println("getOpenOrders");
        SetOfOrders instance = null;
        SetOfOrders expResult = null;
        //SetOfOrders result = instance.getOpenOrders();
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
