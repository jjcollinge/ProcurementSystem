
package com.ps.model;

import com.ps.app.ObjectMapper;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class SetOfOrdersTest {
    //setofOrders
    public static SetOfOrders setOfOrders;
    public static ArrayList<Order> orders;
    public static Item concrete;
    public static Item bolts;
    public static Item bricks;
    
    public SetOfOrdersTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //get instance of setOfOrders
        setOfOrders = SetOfOrders.getInstance();
        //add test orders to setOfOrders
        concrete = new Item("Concrete", 3.00, "Bag");
        bolts = new Item("Bolts", 4.50, "Sack"); 
        bricks = new Item("Bricks", 10.00, "Pallet");
        
        Order order1 = new Order();
        order1.addItem(bricks, 2);
        order1.addItem(concrete, 10);
        
        Order order2 = new Order();
        order2.addItem(bolts, 1);
        order2.addItem(bricks, 10);
        
        setOfOrders.addOrder(order1);
        setOfOrders.addOrder(order2);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDownTest() {
        setOfOrders.clear();
    }

    /**
     * Test of getInstance method, of class SetOfOrders.
     */
    @Test //test singleton
    public void testGetInstance() {
        System.out.println("getInstance");
        SetOfOrders expResult = SetOfOrders.getInstance();
        assertNotNull(expResult);
    }

    /**
     * Test of filterByDate method, of class SetOfOrders.
     */
    @Test
    public void testFilterByDate1() {
        System.out.println("filterByDate");
        Date date = new Date();
        System.out.println(date);
        for (Order o : setOfOrders.getAllOrders())
        {
            System.out.println(o);
        }
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.filterByDate(date); //doesn't work when values are null
        assertNotNull(expResult);
    }
    
    @Test (expected = NullPointerException.class)
    public void testFilterByDate2() {
        System.out.println("filterByDate");
        Date date = null;
        System.out.println(date);
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.filterByDate(date); //doesn't work when values are null
        assertNotNull(expResult);
    }
    
    /**
     * Test of filterBySite method, of class SetOfOrders.
     */
    @Test
    public void testFilterBySite1() {
        System.out.println("filterBySite");
        String site = "testSite";
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = new ArrayList<Order>();
        ArrayList<Order> result = instance.filterBySite(site);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFilterBySite2() {
        System.out.println("filterBySite");
        String site = null;
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = new ArrayList<Order>();
        ArrayList<Order> result = instance.filterBySite(site);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFilterBySite3() {
        System.out.println("filterBySite");
        String site = "123";
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.filterBySite(site);
        assertNotNull(expResult);
    }

    /**
     * Test of filterBySupplier method, of class SetOfOrders.
     */
    @Test //method not implemented
    public void testFilterBySupplier1() {
        System.out.println("filterBySupplier");
        String supplier = "testSupplier";
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = new ArrayList<Order>();
        ArrayList<Order> result = instance.filterBySupplier(supplier);
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testFilterBySupplier2() {
        System.out.println("filterBySupplier");
        String supplier = null;
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = new ArrayList<Order>();
        ArrayList<Order> result = instance.filterBySupplier(supplier);
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrder method, of class SetOfOrders.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Order order = new Order();
        order.addItem(bolts, 1);
        order.addItem(bricks, 10);
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().contains(order));
    }

    /**
     * Test of getOrder method, of class SetOfOrders.
     */
    @Test//method returns null
    public void testGetOrder() {
        System.out.println("getOrder");
        SetOfOrders instance = setOfOrders;
        Order expResult = instance.getOrder();
        assertNull(expResult);
    }

    /**
     * Test of getAllOrders method, of class SetOfOrders.
     */
    @Test
    public void testGetAllOrders() {
        System.out.println("getAllOrders");
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.getAllOrders();
        assertNotNull(expResult);
    }

    /**
     * Test of getOpenOrders method, of class SetOfOrders.
     */
    @Test
    public void testGetOpenOrders() {
        System.out.println("getOpenOrders");
        ArrayList<Order> expResult = setOfOrders.getOpenOrders(); //doesn't work when values are null
        assertNotNull(expResult);
    }
    
    /**
     * Test find existing orders
     */
    @Test
    public void testViewExistingOrders() {
        System.out.println("viewExistingOrders");
        
        // Add some orders to set of orders
        Order order1 = new Order();
        order1.addItem(bolts, 1);
        order1.addItem(bricks, 10);
        setOfOrders.addOrder(order1);
        
        Order order2 = new Order();
        order2.addItem(bolts, 1);
        order2.addItem(concrete, 20);
        setOfOrders.addOrder(order2);
        
        Order order3 = new Order();
        order3.addItem(bricks, 10);
        order3.addItem(concrete, 20);
        setOfOrders.addOrder(order3);
        
        assertTrue(setOfOrders.getAllOrders().size() == 3);
        assertTrue(setOfOrders.getAllOrders().contains(order1));
        assertTrue(setOfOrders.getAllOrders().contains(order2));
        assertTrue(setOfOrders.getAllOrders().contains(order3));
        assertTrue(setOfOrders.getAllOrders().get(0).getOrderLines().get(0).getItem().equals(bolts));
    }
}
