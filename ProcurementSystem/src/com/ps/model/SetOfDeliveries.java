package com.ps.model;

import java.io.Serializable;
import java.util.ArrayList;
import com.ps.app.ObjectMapper;

/**
 * A collection of deliveries. Holds all deliveries 
 * currently stored in the system.
 * @author JCollinge
 */
public class SetOfDeliveries {
    private ArrayList<Delivery> listOdDeliveries;   //changed this to an array list of deliveries
    private static SetOfDeliveries singleton;
    private final String filename = "deliveries.ser";
    
    /**
     * private Ctor
     */
    private SetOfDeliveries() {
        listOdDeliveries = (ArrayList<Delivery>) ObjectMapper.Deserialize(filename);
        if(listOdDeliveries == null) {
            System.out.println("Couldn't load deliveries file, creating a new set");
            listOdDeliveries = new ArrayList<Delivery>();
        }
    }
    
    /**
     * Lazy load and get the singleton instance
     * @return 
     */
    public static SetOfDeliveries getInstance() {
        if(singleton == null) {
            singleton = new SetOfDeliveries();
        }
        return singleton;
    }
    
    /**
     * Add Delivery to listOfDeliveries
     * @param delivery 
     */
    public void addDelivery(Delivery delivery) {
        listOdDeliveries.add(delivery);
    }

    /**
     * Get the list od deliveries
     * @return 
     */
    public ArrayList<Delivery> getListOdDeliveries() {
        return listOdDeliveries;
    }
   
}
