package com.ps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;
import java.text.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Simon
 */
public class OrderTest {
    
    public static Order order;
    public Item concrete;
    public Item bolts;
    public String exampleSite = "Test Site";
    public String exampleOrderStatus = "Pending";
    public String exampleSpecialInstructions = "Some Instructions";
            
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        order = new Order();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setupTest() {
        concrete = new Item("Concrete", 3.00, "Bag");
        bolts = new Item("Bolts", 4.50, "Sack"); 
        Date dNow = new Date( );
        order.setOrderDate(dNow);
        order.setSite(exampleSite);
        order.setOrderStatus(exampleOrderStatus);
        order.addSpecialInstructions(exampleSpecialInstructions);
    }
    
    @After
    public void tearDownTest() {
        order.cancelOrder();
    }
    
    /**
     * Test of addItem method, of class Order.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        order.addItem(concrete, 1);
        assertTrue(order.getOrderLines().get(0).getItem().equals(concrete));
    }
    
    /**
     * Test of addItem method, that it inserts the correct order
     */
    @Test
    public void testAddItemToFail() {
        System.out.println("addItemToFail");
        order.addItem(concrete, 1);
        assertFalse(order.getOrderLines().get(0).getItem().equals(bolts));
    }
    
    /**
     * Test that addItem method handles null items
     */
    @Test
    public void testAddNullItem() {
        System.out.println("addNullItem");
        int previousSize = order.getOrderLines().size();
        order.addItem(null, 2);
        assertTrue(order.getOrderLines().size() == previousSize);
    }
    
    /**
     * Test that addItem method handles duplicate items
     */
    @Test
    public void testAddDuplicateItem() {
        System.out.println("addDuplicateItem");
        int quantity = 3;
        order.addItem(bolts, quantity);
        int sizeAfterOneItem = order.getOrderLines().size();
        order.addItem(bolts, 4);
        assertTrue(order.getOrderLines().size() == sizeAfterOneItem);
        assertTrue(order.getOrderLines().get(0).getQuantity() == quantity);
    }

    @Test
    public void testHasSameDate() {
        System.out.println("hasSameDate");
        Date date = new Date();
        boolean expResult = true;
        boolean result = order.hasSameDate(date);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasSameDateWithNull() {
        System.out.println("hasSameDateWithNull");
        Date date = null;
        boolean expResult = false;
        boolean result = order.hasSameDate(date);
        assertTrue(result == false);
    }

    @Test
    public void testSetOrderStatus() {
        System.out.println("setOrderStatus");
        String orderStatus = "Delivered";
        order.setOrderStatus(orderStatus);
        assertTrue(order.getOrderStatus().equals(orderStatus));
    }
    
    @Test
    public void testSetOrderStatusToNull() {
        System.out.println("setOrderStatusToNull");
        String orderStatus = null;
        order.setOrderStatus(orderStatus);
        assertTrue(order.getOrderStatus().equals(exampleOrderStatus));
    }

    /**
     * Test of addSpecialInstructions method, of class Order.
     */
    @Test
    public void testAddSpecialInstructions() {
        System.out.println("addSpecialInstructions");
        String instructions = "I am a special instruction";
        order.addSpecialInstructions(instructions);
        assertTrue(order.getSpecialInstructions().equals(instructions));
    }
    
    @Test
    public void testAddSpecialInstructionsNull() {
        System.out.println("testAddSpecialInstructionsNull");
        String instructions = null;
        order.addSpecialInstructions(instructions);
        assertTrue(order.getSpecialInstructions().equals(exampleSpecialInstructions));
    }

    @Test
    public void testSetOrderDate() {
        System.out.println("setOrderDate");
        Date yesterday = new Date(System.currentTimeMillis()-24*60*60*1000);
        order.setOrderDate(yesterday);
        assertEquals(order.getOrderDate(), yesterday);
    }
    
    @Test
    public void testSetOrderDateToNull() {
        System.out.println("setOrderDateToNull");
        Date nullDate = null;
        order.setOrderDate(nullDate);
        assertEquals(order.getOrderDate(), new Date());
    }
    
    /**
     * Test of getSite method, of class Order.
     */
    @Test
    public void testSetSite() {
        System.out.println("setSite");
        String site = "Sheffield";
        order.setSite(site);
        assertEquals(order.getSite(), site);
    }
    
    @Test
    public void testSetSiteToNull() {
        System.out.println("setSiteToNull");
        String site = null;
        order.setSite(site);
        assertTrue(order.getSite().equals(exampleSite));
    }
}