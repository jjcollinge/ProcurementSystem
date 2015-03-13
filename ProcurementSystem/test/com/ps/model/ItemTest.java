package com.ps.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test suite to test the methods in the item class
 * @author Group B
 */
public class ItemTest  {
    private static Item concrete;
    private static Item bolts;
    private static final String concreteName = "Concrete";
    private static final String boltsName = "Bolts";
    private static final double concretePrice = 3.0;
    private static final double boltsPrice = 4.50;
    private static final String bag = "Bag";
    private static final String sack = "Sack";
    
    /**
     * Set up objects needed for each test.
     */
    @Before
    public void beforeTest() {
        concrete = new Item(concreteName, concretePrice, bag);
        bolts = new Item(boltsName, boltsPrice, sack); 
    }
    
    /**
     * Test the set name method with a string that fits criteria.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Carboard cutouts of Barry Manilow";
        concrete.setName(newName);
        assertTrue(concrete.getName().equals(newName));        
    }
    
    /**
     * Test the set name method with a string that is null.
     */
    @Test
    public void testSetNameIsNull() {
        System.out.println("setNameIsNull");
        String nullName = null;
        concrete.setName(nullName);
        assertTrue(concrete.getName().equals(concreteName));          
    }

    /**
     * Test the get price method to check if it is set in constructor.
     */
    @Test
    public void testGetPrice() {
        System.out.println("setPrice");
        assertTrue(bolts.getPrice() == boltsPrice);
    }
    
    /**
     * Test the set price method can handle a minus price.
     */
    @Test 
    public void testSetPriceMinusValue () {
        System.out.println("setPriceMinusValue");
        double value = -10.00;
        bolts.setPrice(value);
        assertTrue(bolts.getPrice() == boltsPrice);
    }

    /**
     * Test the set type method can handle a new type that fits the criteria.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String newType = "Pallet";
        concrete.setType(newType);
        assertTrue(concrete.getType().equals(newType));        
    }
    
    /**
     * Test the set type method can handle a type that is null.
     */
    @Test
    public void testSetTypeIsNull() {
        System.out.println("setTypeIsNull");
        String nullType = null;
        concrete.setType(nullType);
        assertTrue(concrete.getType().equals(bag));          
    }

    /**
     * Test the compare to of item with two instances of the same item.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Item otherItem = concrete;
        Item instance = concrete;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);
    }
    
    /**
     * Test the compare to of item can handle a null item.
     */
    @Test
    public void testCompareToNull() {
        System.out.println("compareToNull");
        Item otherItem = null;
        Item instance = concrete;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);
    }
}