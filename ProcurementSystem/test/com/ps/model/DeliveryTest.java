
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
    


    @Test
    public void testUpdateDeliveryStatus() {
        System.out.println("updateDeliveryStatus");
        String deliveryStatus = "";
        String status = "";
     
        Delivery instance = new Delivery();
        instance.updateDeliveryStatus(status);
        instance.setDeliveryStatus(deliveryStatus);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testUpdateDeliveryStatus2() {
         System.out.println("updateDeliveryStatus");
        String deliveryStatus = "fgfgf";
        String status = "dgdgdg";
     
        Delivery instance = new Delivery();
        instance.updateDeliveryStatus(status);
        instance.setDeliveryStatus(deliveryStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
  
    /**
     * Test of setDeliveryStatus method, of class Delivery.
     */
    @Test
    public void testSetDeliveryStatus() {
        System.out.println("setDeliveryStatus");
        String deliveryStatus = "";
        Delivery instance = new Delivery();
        instance.setDeliveryStatus(deliveryStatus);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

  //SHOULD IT ACCEPT NULL?
    @Test
    public void testGetApproval() {
        System.out.println("getApproval");
        Delivery instance = new Delivery();
        Boolean expResult = null;
        Boolean result = instance.getApproval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setApproval method, of class Delivery.
     */
    @Test
    public void testSetApproval() {
        System.out.println("setApproval");
        Boolean approval = null;
        Delivery instance = new Delivery();
        instance.setApproval(approval);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
        
    }
    
      
   
    
    

