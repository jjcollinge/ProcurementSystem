
package com.ps.model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author b0015911
 */
public class DeliveryTest {
    private static Delivery delivery;
    private final String deliveryStatus = "Delivered";
    
    public DeliveryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        delivery = new Delivery();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void beforeTest() {
        delivery.updateDeliveryStatus(deliveryStatus);
    }
    
    @After
    public void afterTest() {
        delivery.resetDelivery();
    }
    
    @Test
    public void testUpdateDeliveryStatus() {
        System.out.println("updateDeliveryStatus");
        String newStatus = "Confirmed";
        delivery.updateDeliveryStatus(newStatus);
        assertTrue(delivery.getDeliveryStatus().equals(newStatus));
    }
    
    @Test
    public void testUpdateDeliveryStatusNull() {
        System.out.println("updateDeliveryStatusNull");
        String nullStatus = null;
        delivery.updateDeliveryStatus(nullStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    @Test
    public void testUpdateDeliveryStatusSpace() {
        System.out.println("updateDeliveryStatusTest");
        String spaceStatus = " ";
        delivery.updateDeliveryStatus(spaceStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    @Test
    public void testUpdateDeliveryStatusOverMaxString() {
        System.out.println("updateDeliveryStatusOverMaxString");
        String maxString = "";
        int size = 33;
        for(int i = 0; i < size; i++) {
            maxString += "w";
        }
        delivery.updateDeliveryStatus(maxString);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    @Test
    public void testUpdateDeliveryStatusUnderMaxString() {
        System.out.println("updateDeliveryStatusUnderMaxString");
        String maxString = "";
        int size = 32;
        for(int i = 0; i < size; i++) {
            maxString += "w";
        }
        delivery.updateDeliveryStatus(maxString);
        assertTrue(delivery.getDeliveryStatus().equals(maxString));
    }
    
    @Test
    public void testUpdateDeliveryStatusUnderMinString() {
        System.out.println("updateDeliveryStatusUnderMinString");
        String minString = "a";
        delivery.updateDeliveryStatus(minString);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    @Test
    public void testUpdateDeliveryStatusWithAlphaNumerical() {
        System.out.println("updateDeliveryStatusUnderMaxString");
        String alphaNumStatus = "t357st4tus";
        delivery.updateDeliveryStatus(alphaNumStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }

    @Test
    public void testGetDefaultApproval() {
        System.out.println("getDefaultApproval");
        assertFalse(delivery.getApproval());
    }

    @Test
    public void testGetApprovedDelivery() {
        System.out.println("getApprovedDelivery");
        delivery.approveDelivery();
        assertTrue(delivery.getApproval());
    }
    
    @Test
    public void testResetDelivery() {
        System.out.println("resetDelivery");
        delivery.approveDelivery();
        assertTrue(delivery.getApproval());
        delivery.resetDelivery();
        assertFalse(delivery.getApproval());
    }
}
    
      
   
    
    

