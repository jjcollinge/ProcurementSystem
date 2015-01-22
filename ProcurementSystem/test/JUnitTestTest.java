/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Mahmud
 */
public class JUnitTestTest extends TestCase {
    
    public JUnitTestTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Test
    public void testOrderProcess()
    {
        fail("Order not processed");
        
    }
    
    @Test
    public void testViewCatalog()
    {
        fail("View not available");
        
    }
    
    @Test
    public void testAddItemsToOrder()
    {
        fail("Unable to add item");
        
    }
    
    @Test
    public void testViewExistingOrders()
    {
        fail("View not available");
    }
    
    @Test
    public void testPlaceOrder()
    {
        fail("Unable to place order");
        
    }
    
    @Test
    public void testAmendOrder()
    {
        fail("Unable to amend order");
        
    }
    
    @Test
    public void testRecordDeliveries()
    {
        fail("Not available");
        
    }
    
    @Test
    public void testOrderStatus()
    {
        fail("Order status unavailable");
    }
    
    @Test
    public void testApproveDelivery()
    {
        fail("unsucclessful");
    }
    

    /**
     * Test of main method, of class JUnitTest.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JUnitTest.main(args);
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("Order not processed");
    }
    
}
