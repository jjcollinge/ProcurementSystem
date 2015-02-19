package com.ps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;
import java.text.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucy
 */
public class OrderTest {
    
    public static Order order;
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        order = new Order();
        Date dNow = new Date( );
        order.setOrderDate(dNow);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testHasSameDate1() {
        System.out.println("hasSameDate");
        Date date = new Date();
        boolean expResult = true;
        boolean result = order.hasSameDate(date);
        assertEquals(expResult, result);
    }
    
    @Test(expected=NullPointerException.class) //tests null date
    public void testHasSameDate2() {
        System.out.println("hasSameDate");
        Date date = null;
        boolean expResult = false;
        boolean result = order.hasSameDate(date);
        assertEquals(expResult, result);
    }

 

    @Test
    public void testSetOrderStatus() {
        System.out.println("setOrderStatus");
        String orderStatus = "";
        Order instance = new Order();
        instance.setOrderStatus(orderStatus);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }


    @Test
    public void testGetOrderDate() {
        System.out.println("getOrderDate");
        Order instance = new Order();
        Date expResult =null;
        Date result = instance.getOrderDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addSpecialInstructions method, of class Order.
     */
    @Test
    public void testAddSpecialInstructions() {
        System.out.println("addSpecialInstructions");
        String instructions = "";
        Order instance = new Order();
        instance.addSpecialInstructions(instructions);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of amendOrder method, of class Order.
     */
    @Test
    public void testAmendOrder() {
        System.out.println("amendOrder");
        Order instance = new Order();
        instance.amendOrder();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderStatus method, of class Order.
     */
    @Test
    public void testGetOrderStatus() {
        System.out.println("getOrderStatus");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getOrderStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAuditTrail method, of class Order.
     */
    @Test
    public void testGetAuditTrail() {
        System.out.println("getAuditTrail");
        Order instance = new Order();
        instance.getAuditTrail();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  //ULL
    @Test
    public void testSetOrderDate() {
        System.out.println("setOrderDate");
        Date orderDate = null;
        Order instance = new Order();
        instance.setOrderDate(orderDate);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printInvoice method, of class Order.
     */
    @Test
    public void testPrintInvoice() {
        System.out.println("printInvoice");
        Order instance = new Order();
        instance.printInvoice();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderLines method, of class Order.
     */
    @Test
    public void testGetOrderLines() {
        System.out.println("getOrderLines");
        Order instance = new Order();
        ArrayList<OrderLine> expResult = null;
        ArrayList<OrderLine> result = instance.getOrderLines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialInstructions method, of class Order.
     */
    @Test
    public void testGetSpecialInstructions() {
        System.out.println("getSpecialInstructions");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getSpecialInstructions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSite method, of class Order.
     */
    @Test
    public void testGetSite() {
        System.out.println("getSite");
        Order instance = new Order();
        String expResult = "";
        String result = instance.getSite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class Order.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item item = null;
        int quantity = 0;
        Order instance = new Order();
        instance.addItem(item, quantity);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test(expected=NullPointerException.class)
    public void testToString() {
        System.out.println("toString");
        Order instance = new Order();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
    
}