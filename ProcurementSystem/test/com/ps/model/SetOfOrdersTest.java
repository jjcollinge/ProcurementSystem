
package com.ps.model;

import com.ps.app.ObjectMapper;
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
    //setofOrders
    public static String filename = "setOfTestOrders.ser";
    public static Order order;
    public static SetOfOrders setOfOrders;
    public static ArrayList<Order> orders;
    
    public SetOfOrdersTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        //get test orders
        orders = (ArrayList<Order>)ObjectMapper.Deserialize(filename);
        if(orders == null) {
            System.out.println("Couldn't load orders file, creating a new set");
            orders = new ArrayList<Order>();
        }
        //get instance of setOfOrders
        setOfOrders = SetOfOrders.getInstance();
        //add test orders to setOfOrders
        for (Order o : orders)
        {
            setOfOrders.addOrder(order);
        } 
    }
    
    @AfterClass
    public static void tearDownClass() {
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
            System.out.println(order);
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
    @Test // method not implemented
    public void testFilterBySite1() {
        System.out.println("filterBySite");
        String site = "testSite";
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.filterBySite(site);
        assertNotNull(expResult);
        }
    
    @Test (expected = NullPointerException.class)// method not implemented
    public void testFilterBySite2() {
        System.out.println("filterBySite");
        String site = null;
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = instance.filterBySite(site);
        assertNull(expResult);
        }
    
    @Test (expected = NullPointerException.class)// method not implemented
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
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.filterBySupplier(supplier);
        assertEquals(expResult, result);
    }
    
    @Test (expected = NullPointerException.class)//method not implemented
    public void testFilterBySupplier2() {
        System.out.println("filterBySupplier");
        String supplier = null;
        SetOfOrders instance = setOfOrders;
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.filterBySupplier(supplier);
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrder method, of class SetOfOrders.
     */
    @Test
    public void testAddOrder1() {
        System.out.println("addOrder");
        order = new Order();
        setOfOrders.addOrder(order);
        boolean expectedAdd = true;
        boolean actuallyAdd = setOfOrders.getAllOrders().contains(order);
        assertEquals(expectedAdd, actuallyAdd);
    }
    
    @Test //test add null order
    public void testAddOrder2() {
        System.out.println("addOrder");
        order = null;
        setOfOrders.addOrder(order);
        boolean expResult = setOfOrders.getAllOrders().contains(order);
        assertFalse(expResult); //shouldn't be able to add null order?
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
    
}
