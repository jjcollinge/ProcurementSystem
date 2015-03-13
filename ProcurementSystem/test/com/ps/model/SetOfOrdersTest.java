package com.ps.model;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test suite to test the methods in the setOfOrders class
 * @author Group B
 */
public class SetOfOrdersTest {
    public static SetOfOrders setOfOrders;
    public static ArrayList<Order> orders;
    public static Item concrete;
    public static Item bolts;
    public static Item bricks;
    
    /**
     * Set up objects needed for the test suite to run.
     */
    @BeforeClass
    public static void setUpClass() {
        SetOfOrders.setOutput("testSetOfOrders.ser");
        
        // get instance of setOfOrders
        setOfOrders = SetOfOrders.getInstance();
        
        // define some items
        concrete = new Item("Concrete", 3.00, "Bag");
        bolts = new Item("Bolts", 4.50, "Sack"); 
        bricks = new Item("Bricks", 10.00, "Pallet");
      
    }
    
    /**
     * Set up objects needed for each test.
     */
    @Before
    public void setUpTest() {        
        Order order1 = new Order();
        order1.addItem(bricks, 2);
        order1.addItem(concrete, 10);
        Date yesterday = new Date(System.currentTimeMillis()-24*60*60*1000);
        order1.setOrderDate(yesterday);
        order1.setSite("testSite");
        
        Order order2 = new Order();
        order2.addItem(bolts, 1);
        order2.addItem(bricks, 10);
        
        setOfOrders.addOrder(order1);
        setOfOrders.addOrder(order2);
    }
    
    /**
     * Clean up objects after each test.
     */
    @After
    public void tearDownTest() {
        setOfOrders.clear();
    }

    /**
     * Test that the singleton method returns the correct instance.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SetOfOrders singleton = SetOfOrders.getInstance();             
        assertTrue(singleton.getClass().toString()
                .equalsIgnoreCase(com.ps.model.SetOfOrders.class.toString()));
    }

    /**
     * Test that the filterByDate method filters orders correctly.
     */
    @Test
    public void testFilterByDate() {
        System.out.println("filterByDate");
        Date date = new Date();
        ArrayList<Order> filteredOrders = setOfOrders.filterByDate(date);
        assertTrue(filteredOrders.size() == 1);
    }
    
    /**
     * test that filterByDate can handle a null value.
     */
    @Test
    public void testFilterByNullDate() {
        System.out.println("testFilterByNullDate");
        Date date = null;
        ArrayList<Order> filteredOrders = setOfOrders.filterByDate(date);
        assertNotNull(filteredOrders);
    }
    
    /**
     * Test that filterBySite can handle correct values.
     */
    @Test
    public void testFilterBySite() {
        System.out.println("filterBySite");
        String site = "testSite";
        ArrayList<Order> filteredOrders = setOfOrders.filterBySite(site);
        assertTrue(filteredOrders.size() == 1);
    }
    
    /**
     * Test that filterBySite can handle a null value.
     */
    @Test
    public void testFilterByNullSite() {
        System.out.println("testFilterByNullSite");
        String site = null;
        ArrayList<Order> emptyArray = new ArrayList<Order>();
        ArrayList<Order> filteredOrders = setOfOrders.filterBySite(site);
        assertEquals(emptyArray, filteredOrders);
    }
    
    /**
     * Test that filterBySite works correctly using a site that returns
     * no values.
     */
    @Test
    public void testFilterByNonMatchingSite() {
        System.out.println("testFilterByNonMatchingSite");
        String site = "123";
        ArrayList<Order> filteredOrders = setOfOrders.filterBySite(site);
        ArrayList<Order> emptyArray = new ArrayList<Order>();
        assertEquals(emptyArray, filteredOrders);
    }

    /**
     * Test that addOrder adds orders correctly.
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
     * Test that addOrder works even if the order has no items.
     */
    @Test
    public void testPlaceOrderWithNoItems() {
        System.out.println("placeOrderWithNoItems");
        Order order = new Order();
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().contains(order));
    }
    
    /**
     * Test that addOrder can handle nulls orders.
     */
    @Test
    public void testPlaceNullOrder() {
        System.out.println("placeNullOrder");
        Order order = null;
        setOfOrders.addOrder(order);
        assertFalse(setOfOrders.getAllOrders().contains(order));
    }
    
    /**
     * Test that addOrder can handle duplicate orders.
     */
    @Test
    public void testPlaceDuplicateOrder() {
        System.out.println("placeDuplicateOrder");
        Order order = new Order();
        order.addItem(bolts, 1);
        order.addItem(bricks, 10);
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().contains(order));
        int size = setOfOrders.getAllOrders().size();
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().size() == size);
    }  
    
    /**
     * Test that addOrder can handle identical unique orders.
     */
    @Test
    public void testPlaceMultipleIdenticalOrders() {
        System.out.println("placeMultipleIdenticalOrders");
        Order order = new Order();
        order.addItem(bolts, 1);
        order.addItem(bricks, 10);
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().contains(order));
        int size = setOfOrders.getAllOrders().size();
        Order order1 = new Order();
        order1.addItem(bolts, 1);
        order1.addItem(bricks, 10);
        setOfOrders.addOrder(order1);
        assertTrue(setOfOrders.getAllOrders().size() == size + 1);
    }  
    
    /**
     * Test that addOrder can handle cancelled orders.
     */
    @Test
    public void testPlaceCancelledOrder() {
        System.out.println("placeCancelledOrder");
        Order order = new Order();
        order.addItem(bolts, 1);
        order.addItem(bricks, 10);
        order.cancelOrder();
        setOfOrders.addOrder(order);
        assertTrue(setOfOrders.getAllOrders().contains(order));
    }  

    /**
     * Test that getOrder returns an order.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        Order order = setOfOrders.getOrder(0);
        assertNotNull(order);
    }

    /**
     * Test that get all orders returns all orders.
     */
    @Test
    public void testGetAllOrders() {
        System.out.println("getAllOrders");
        ArrayList<Order> allOrders = setOfOrders.getAllOrders();
        assertTrue(allOrders.size() == 2);
    }

    /**
     * Test that view existing orders will return the correct list of orders.
     */
    @Test
    public void testViewExistingOrders() {
        System.out.println("viewExistingOrders");
        
        assertTrue(setOfOrders.getAllOrders().size() == 2);
        
        // Add some orders to set of orders
        Order order3 = new Order();
        order3.addItem(bolts, 1);
        order3.addItem(bricks, 10);
        setOfOrders.addOrder(order3);
        
        Order order4 = new Order();
        order4.addItem(bolts, 1);
        order4.addItem(concrete, 20);
        setOfOrders.addOrder(order4);
        
        Order order5 = new Order();
        order5.addItem(bricks, 10);
        order5.addItem(concrete, 20);
        setOfOrders.addOrder(order5);
        
        assertTrue(setOfOrders.getAllOrders().size() == 5);
        assertTrue(setOfOrders.getAllOrders().contains(order3));
        assertTrue(setOfOrders.getAllOrders().contains(order4));
        assertTrue(setOfOrders.getAllOrders().contains(order5));
        assertTrue(setOfOrders.getOrder(2).getOrderLines().get(0).getItem().equals(bolts));
    }
}
