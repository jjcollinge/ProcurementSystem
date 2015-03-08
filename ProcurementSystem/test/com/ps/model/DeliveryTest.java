
package com.ps.model;

import static org.hamcrest.CoreMatchers.not;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

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
        String status = "Delivered";
     
        Delivery instance = new Delivery();
        instance.updateDeliveryStatus(status);
        assertEquals(instance.getDeliveryStatus(), "Delivered");
    }
    
      @Test
    public void testUpdateDeliveryStatus2() {
         System.out.println("updateDeliveryStatus");
        String deliveryStatus = "fgfgf";
        String status = "dgdgdg";
     
        Delivery instance = new Delivery();
        instance.updateDeliveryStatus(status);
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
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

  //SHOULD IT ACCEPT NULL?
    @Test
    public void testGetApproval() {
        System.out.println("getApproval");
        Delivery instance = new Delivery();
        Boolean expResult = false;
        Boolean result = instance.getApproval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetApproval2() {
        System.out.println("getApproval");
        Delivery instance = new Delivery();
        Boolean expResult = true;
        Boolean result = instance.getApproval();
        assertThat(expResult, not(result));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     
    @Test
    public void testGetApproval3() {
        System.out.println("getApproval");
        Delivery instance = new Delivery();
        Boolean expResult = false;
        Boolean result = instance.getApproval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testSetApproval() {
        System.out.println("setApproval");
        Boolean approval = null;
        Delivery instance = new Delivery();
        instance.setApproval(approval);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testSetApproval2() {
        System.out.println("setApproval");
        Boolean approval = true;
        Delivery instance = new Delivery();
        instance.setApproval(approval);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
         @Test
    public void testSetApproval3() {
        System.out.println("setApproval");
        Boolean approval = false;
        Delivery instance = new Delivery();
        instance.setApproval(approval);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
    
      
   
    
    

