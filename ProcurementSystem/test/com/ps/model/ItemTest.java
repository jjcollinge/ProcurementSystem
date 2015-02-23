package com.ps.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ItemTest  {
    public static Item i, i2;
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        i = new Item("TestItem", 0.0, "TestType");
        i2 = new Item("SecondTestItem", 0.0, "TestType");
    }
    
    @AfterClass
    public static void tearDownClass() {
        // get rid of i and i2?
    }
    
    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Item instance = i;
        String expResult = "TestItem";
        String result = instance.getName();
        assertEquals(expResult, result);        
    }
    
     @Test(expected=NullPointerException.class)
    public void testGetName2() {
        System.out.println("getName");
        Item instance = null;
        String expResult = "";
        String result = instance.getName();
        //assertEquals(expResult, result);        
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Item instance = i;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }
    
    
      @Test //testing i2
    public void testGetPrice2 () {
        System.out.println("getPrice");
        Item instance = i2;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }
    
      @Test(expected=NullPointerException.class) //testing for null
    public void testGetPrice3() {
        System.out.println("getPrice");
        Item instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        //assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getType method, of class Item.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Item instance = i;
        String expResult = "TestType";
        String result = instance.getType();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetType2() {
        System.out.println("getType");
        Item instance = i2;
        String expResult = "TestType";
        String result = instance.getType();
        assertEquals(expResult, result);
    }
    
    //testing for null
      @Test(expected=NullPointerException.class)
    public void testGetType3() {
        System.out.println("getType");
        Item instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item instance = i;
        String expResult = "TestItem : TestType";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testToString2() {
        System.out.println("toString");
        String instance = "g";
        String expResult = "TestItem : TestType";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Item.
     */
    @Test(expected=NullPointerException.class)
    public void testCompareTo1() {
        System.out.println("compareTo");
        Item otherItem = null;
        Item instance = null;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);        
    }
    
    @Test(expected=NullPointerException.class)
    public void testCompareTo2() {
        System.out.println("compareTo");
        Item otherItem = null;
        Item instance = i;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareTo3() {
        System.out.println("compareTo");
        Item otherItem = i;
        Item instance = i;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCompareTo4() {
        System.out.println("compareTo");
        Item otherItem = i2;
        Item instance = i2;
        int expResult = 0;
        int result = instance.compareTo(otherItem);
        assertEquals(expResult, result);
        
    }
    
      @Test(expected=NullPointerException.class) //testing for null 
    public void testCompareTo5() {
        System.out.println("compareTo");
        Item otherItem = i;
        Item instance = null;
      //  int expResult = 0;
        int result = instance.compareTo(otherItem);
        //assertEquals(expResult, result);
        
    }
    
        @Test(expected=IllegalArgumentException.class) //testing for string 
     public void testCompareTo6() {
         
        System.out.println("compareTo");
        String otherItem = "agfg";
        String instance = "3";
       
        int result = instance.compareTo(otherItem);
        
        //assertEquals(expResult, result);
    }
    

    
    
    
}