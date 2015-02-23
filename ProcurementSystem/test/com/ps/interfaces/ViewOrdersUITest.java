
package com.ps.interfaces;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class ViewOrdersUITest {
    
    public ViewOrdersUITest() {
    }
    
    public static ViewOrdersUI viewOrdersUI;
    
    @BeforeClass
    public static void setUpClass() {
        viewOrdersUI = ViewOrdersUI.getInstance(); //can't run because SetOfOrders.getOpenOrders doesn't accept null and toString is messing it up
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
//(expected = NullPointerException.class)
    /**
     * Test of getInstance method, of class ViewOrdersUI.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ViewOrdersUI expResult = ViewOrdersUI.getInstance();
        assertNotNull(expResult);
    }

    /**
     * Test of Run method, of class ViewOrdersUI.
     */
//    @Test
//    public void testRun() {
//        System.out.println("Run");
//        ViewOrdersUI instance = viewOrdersUI;
//        instance.Run();
//    }

    /**
     * Test of displayCurrentOrders method, of class ViewOrdersUI.
     */
    @Test
    public void testDisplayCurrentOrders() {
        System.out.println("displayCurrentOrders");
        ViewOrdersUI instance = viewOrdersUI;
        instance.displayCurrentOrders();
    }

    /**
     * Test of loadOrders method, of class ViewOrdersUI.
     */
    @Test
    public void testLoadOrders() {
        System.out.println("loadOrders");
        ViewOrdersUI instance = viewOrdersUI;
        instance.loadOrders();
    }

    /**
     * Test of requestFilter method, of class ViewOrdersUI.
     */
    @Test
    public void testRequestFilter1() {
        System.out.println("requestFilter");
        String filter = "";
        Object param = null;
        ViewOrdersUI instance = viewOrdersUI;
        instance.requestFilter(filter, param);
    }
    
    @Test
    public void testRequestFilter2() {
        System.out.println("requestFilter");
        String filter = null;
        Object param = null;
        ViewOrdersUI instance = viewOrdersUI;
        instance.requestFilter(filter, param);
    }

    /**
     * Test of setPosition method, of class ViewOrdersUI.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x = 0;
        int y = 0;
        ViewOrdersUI instance = viewOrdersUI;
        instance.setPosition(x, y);
        
        int expX = instance.getPositionX();
        int expY = instance.getPositionY();
        
        assertTrue((x == expX) && (y == expY));
    }

    
}
