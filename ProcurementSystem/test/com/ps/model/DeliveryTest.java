
package com.ps.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b0015911
 */
public class DeliveryTest {
    
    public DeliveryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of approveDelivery method, of class Delivery.
     */
    @Test
    public void testApproveDelivery() {
        System.out.println("approveDelivery");
        Delivery instance = new Delivery();
        instance.setApproval(Boolean.FALSE); //set to false
        instance.approveDelivery(); //sets to true within approveDelivery
        boolean approvalSet = instance.getApproval(); //get approval
        boolean expectedResult = true; 
        assertEquals(expectedResult, approvalSet);
    }
    
      @Test //tests true bool
    public void testApproveDelivery2() {
        System.out.println("approveDelivery");
        Delivery instance = new Delivery();
        instance.setApproval(Boolean.TRUE); //set to true
        instance.approveDelivery(); //sets to true within approveDelivery
        boolean approvalSet = instance.getApproval(); //get approval
        boolean expectedResult = true; 
        assertEquals(expectedResult, approvalSet);
    }
    
      
   
    
    
}
