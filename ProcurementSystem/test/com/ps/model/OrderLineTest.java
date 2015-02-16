
package com.ps.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class OrderLineTest {
    
    public static OrderLine instance;
    public static Item item;
    
    public OrderLineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        item = new Item("Name", 0.0, "Type");
        instance = new OrderLine(item, 1);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deleteItem method, of class OrderLine.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        OrderLine instance = null;
        instance.deleteItem();
    }

    /**
     * Test of changeQuantity method, of class OrderLine.
     */
    @Test
    public void testChangeQuantity() {
        System.out.println("changeQuantity");
        instance.changeQuantity();
        //use setter and getter to check quantity
    }

    /**
     * Test of getItem method, of class OrderLine.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Item expResult = item;
        Item result = instance.getItem();
        assertEquals(expResult, result);
            }

    /**
     * Test of getQuantity method, of class OrderLine.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    
}
