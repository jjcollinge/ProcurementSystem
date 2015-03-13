package com.ps.model;

import java.io.Serializable;
import java.util.ArrayList;
import com.ps.app.ObjectMapper;

/**
 * A catalog stores a list of all available items.
 * Persistent between runs.
 * @author Group B
 */
public class Catalog implements Serializable {
    
    private ArrayList<Item> listOfItems;
    private static Catalog singleton;
    private final String filename = "catalog.ser";
    
    /**
     * Constructor
     */
    private Catalog() {
        // deserialize catalog if possible
        listOfItems = (ArrayList<Item>)ObjectMapper.Deserialize(filename);
        if(listOfItems == null) {
            initCatalog();
        }
    }
    
    /**
     * Return the catalog instance
     * @return Catalog current catalog
     */
    public static Catalog getCatalog() {
        if(singleton == null) {
            singleton = new Catalog();
        }
        return singleton;
    }
    
    /**
     * If no data can be deserialized this will set some initial data.
     */
    public void initCatalog() {
        listOfItems = new ArrayList<>();
        
        listOfItems.add(new Item("Architraves standard, pine", 10.0, "2m"));
        listOfItems.add(new Item("Bolts 5mm, length 25mm", 15.0, "box of 200"));
        listOfItems.add(new Item("Door brass handles", 5.0, "single"));
        listOfItems.add(new Item("Concrete mixed by truck", 50.0, "500kg"));
       
        ObjectMapper.Serialize(listOfItems, filename);
    }
    
    /**
     * WARNING: In Class diagram but use not clear.
     * Update listOfItems
     */
    public void updateCatalog() {
        
    }
    
    /**
     * WARNING: In Class diagram but no search filter for catalog in UI.
     * Find Item by name
     */
    public void findItemByName() {
        
    }
    
    /**
     * WARNING: In Class diagram but no search filter for catalog in UI.
     * Filter Items by type
     */
    public void filterByType() {
        
    }

    /**
     * Get list of items
     * @return ArrayList current item list
     */
    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }
    
}
