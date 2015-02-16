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

    /**
     * Test of cancelOrder method, of class Order.
     */
//    @Test
//    public void testCancelOrder() {
//        System.out.println("cancelOrder");
//        Order instance = new Order();
//        instance.cancelOrder();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of addSpecialInstructions method, of class Order.
//     */
//    @Test
//    public void testAddSpecialInstructions() {
//        System.out.println("addSpecialInstructions");
//        String instructions = "";
//        Order instance = new Order();
//        instance.addSpecialInstructions(instructions);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of amendOrder method, of class Order.
//     */
//    @Test
//    public void testAmendOrder() {
//        System.out.println("amendOrder");
//        Order instance = new Order();
//        instance.amendOrder();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of printInvoice method, of class Order.
//     */
//    @Test
//    public void testPrintInvoice() {
//        System.out.println("printInvoice");
//        Order instance = new Order();
//        instance.printInvoice();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//
//    /**
//     * Test of addItem method, of class Order.
//     */
//    @Test
//    public void testAddItem() {
//        System.out.println("addItem");
//        Item item = null;
//        int quantity = 0;
//        Order instance = new Order();
//        instance.addItem(item, quantity);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of hasSameDate method, of class Order.
     */
    @Test
    public void testHasSameDate1() {
        System.out.println("hasSameDate");
        Date date = new Date();
        boolean expResult = true;
        boolean result = order.hasSameDate(date);
        assertEquals(expResult, result);
    }
    
    @Test //tests null date
    public void testHasSameDate2() {
        System.out.println("hasSameDate");
        Date date = null;
        boolean expResult = false;
        boolean result = order.hasSameDate(date);
        assertEquals(expResult, result);
    }
    
}