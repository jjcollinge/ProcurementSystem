package com.ps.model;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ItemTest  {
    private static Item concrete;
    private static Item bolts;
    private static final String concreteName = "Concrete";
    private static final String boltsName = "Bolts";
    private static final double concretePrice = 3.0;
    private static final double boltsPrice = 4.50;
    private static final String bag = "Bag";
    private static final String sack = "Sack";
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void beforeTest() {
        concrete = new Item(concreteName, concretePrice, bag);
        bolts = new Item(boltsName, boltsPrice, sack); 
    }
    
    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Carboard cutouts of Barry Manilow";
        concrete.setName(newName);
        assertTrue(concrete.getName().equals(newName));        
    }
    
    @Test
    public void testSetNameIsNull() {
        System.out.println("setNameIsNull");
        String nullName = null;
        concrete.setName(nullName);
        assertTrue(concrete.getName().equals(concreteName));          
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("setPrice");
        assertTrue(bolts.getPrice() == boltsPrice);
    }
    
    @Test 
    public void testSetPriceMinusValue () {
        System.out.println("setPriceMinusValue");
        double value = -10.00;
        bolts.setPrice(value);
        assertTrue(bolts.getPrice() == boltsPrice);
    }

    /**
     * Test of getType method, of class Item.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String newType = "Pallet";
        concrete.setType(newType);
        assertTrue(concrete.getType().equals(newType));        
    }
    
    @Test
    public void testSetTypeIsNull() {
        System.out.println("setTypeIsNull");
        String nullType = null;
        concrete.setType(nullType);
        assertTrue(concrete.getType().equals(bag));          
    }

    /**
     * Test of compareTo method, of class Item.
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