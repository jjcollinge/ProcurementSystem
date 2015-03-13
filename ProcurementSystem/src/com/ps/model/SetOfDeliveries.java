package com.ps.model;

import java.util.ArrayList;
import com.ps.app.ObjectMapper;

/**
 * A collection of deliveries. Holds all deliveries 
 * currently stored in the system.
 * @author Group B
 */
public class SetOfDeliveries {
    
    private ArrayList<Delivery> listOdDeliveries;
    private static SetOfDeliveries singleton;
    private static String filename = "deliveries.ser";
    
    /**
     * private Constructor
     */
    private SetOfDeliveries() {
        listOdDeliveries = (ArrayList<Delivery>) ObjectMapper.Deserialize(filename);
        System.out.println("Attemping to load");
        if(listOdDeliveries == null) {
            System.out.println("Couldn't load deliveries file, creating a new set");
            listOdDeliveries = new ArrayList<Delivery>();
        }
        System.out.println("Size: " + listOdDeliveries);
    }
    
    /**
     * Lazy load and get the singleton instance
     * @return instance of SetOfDeliveries
     */
    public static SetOfDeliveries getInstance() {
        if(singleton == null) {
            singleton = new SetOfDeliveries();
        }
        return singleton;
    }
    
    /**
     * Set the serialization output so it can be changed during unit testing
     * @param fname a new filename
     */
    public static void setOutput(String fname) {
        filename = fname;
    }
    
    /**
     * Add Delivery to listOfDeliveries
     * @param delivery a new delivery
     */
    public void addDelivery(Delivery delivery) {
        listOdDeliveries.add(delivery);
        ObjectMapper.Serialize(listOdDeliveries, filename);
        System.out.println("Serializing deliveries");
    }

    /**
     * Get the list of deliveries
     * @return ArrayList a list of deliveries
     */
    public ArrayList<Delivery> getListOdDeliveries() {
        return listOdDeliveries;
    }
    
    /**
     * EXTRA METHOD
     * Get individual delivery by order
     * @param order
     * @return instance of delivery class
     */
    public Delivery getDeliveryByOrder(Order order) {
        for(Delivery delivery : listOdDeliveries) {
            if(delivery.getOrder() == order) {
                return delivery;
            }
        }
        return null;
    }
    
}
