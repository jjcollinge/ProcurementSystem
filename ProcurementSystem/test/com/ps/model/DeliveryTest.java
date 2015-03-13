package com.ps.model;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test suite to test the methods in the delivery class
 * @author Group B
 */
public class DeliveryTest {
    
    private static Delivery delivery;
    private final String deliveryStatus = "Delivered";
    
    /**
     * Set up objects needed for test suite to run.
     */
    @BeforeClass
    public static void setUpClass() {
        delivery = new Delivery();
    }
    
    /**
     * Set up objects needed for each test.
     */
    @Before
    public void beforeTest() {
        delivery.updateDeliveryStatus(deliveryStatus);
    }
    
    /**
     * Clean up objects needed for each test.
     */
    @After
    public void afterTest() {
        delivery.resetDelivery();
    }
    
    /**
     * Test setting a standard delivery status which fits all criteria.
     */
    @Test
    public void testUpdateDeliveryStatus() {
        System.out.println("updateDeliveryStatus");
        String newStatus = "Confirmed";
        delivery.updateDeliveryStatus(newStatus);
        assertTrue(delivery.getDeliveryStatus().equals(newStatus));
    }
    
    /**
     * Test setting the delivery status to null.
     */
    @Test
    public void testUpdateDeliveryStatusNull() {
        System.out.println("updateDeliveryStatusNull");
        String nullStatus = null;
        delivery.updateDeliveryStatus(nullStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    /**
     * Test setting the delivery status to a string with a space in.
     */
    @Test
    public void testUpdateDeliveryStatusSpace() {
        System.out.println("updateDeliveryStatusTest");
        String spaceStatus = " ";
        delivery.updateDeliveryStatus(spaceStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    /**
     * Test setting the delivery status to a string of over 
     * max character length (33 characters).
     */
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
    
    /**
     * Testing setting the delivery status to max (32) character
     * length string.
     */
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
    
    /**
     * Test setting the delivery status to a string of under 
     * min character length (1 character).
     */
    @Test
    public void testUpdateDeliveryStatusUnderMinString() {
        System.out.println("updateDeliveryStatusUnderMinString");
        String minString = "a";
        delivery.updateDeliveryStatus(minString);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }
    
    /**
     * Test setting the deliverys status to a string including 
     * alphanumeric characters.
     */
    @Test
    public void testUpdateDeliveryStatusWithAlphaNumerical() {
        System.out.println("updateDeliveryStatusUnderMaxString");
        String alphaNumStatus = "t357st4tus";
        delivery.updateDeliveryStatus(alphaNumStatus);
        assertTrue(delivery.getDeliveryStatus().equals(deliveryStatus));
    }

    /**
     * Test the default approval of a delivery.
     */
    @Test
    public void testGetDefaultApproval() {
        System.out.println("getDefaultApproval");
        assertFalse(delivery.getApproval());
    }

    /**
     * Test the set and get delivery approval methods.
     */
    @Test
    public void testGetApprovedDelivery() {
        System.out.println("getApprovedDelivery");
        delivery.approveDelivery();
        assertTrue(delivery.getApproval());
    }
    
    /**
     * Test resetting the delivery.
     */
    @Test
    public void testResetDelivery() {
        System.out.println("resetDelivery");
        delivery.approveDelivery();
        assertTrue(delivery.getApproval());
        delivery.resetDelivery();
        assertFalse(delivery.getApproval());
    }
    
}
    
      
   
    
    

