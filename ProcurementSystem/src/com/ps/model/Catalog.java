package com.ps.model;

import java.io.Serializable;
import java.util.ArrayList;
import com.ps.app.ObjectMapper;

/**
 * A catalog stores a list of all available items.
 * Should be persistent between runs.
 * @author JCollinge
 */
public class Catalog implements Serializable {
    
    private ArrayList<Item> listOfItems;    //included <Item>
    private static Catalog singleton;
    private final String filename = "catalog.ser";
    
    /**
     * Ctor
     */
    private Catalog() {
        
        listOfItems = (ArrayList<Item>)ObjectMapper.Deserialize(filename);
        if(listOfItems == null) {
            initCatalog();
        }
    }
    
    /**
     * Return Catalog
     * n.b. should this be here, if its just returning the current instance? is it a singleton?
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
     * Update listOfItems
     */
    public void updateCatalog() {
        
    }
    
    /**
     * Find Item by name
     */
    public void findItemByName() {
        
    }
    
    /**
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
