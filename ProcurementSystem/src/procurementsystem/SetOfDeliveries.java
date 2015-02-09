package procurementsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class SetOfDeliveries {
    private ArrayList<Delivery> listOdDeliveries;   //changed this to an array list of deliveries
    private static SetOfDeliveries singleton;
    private final String filename = "deliveries.ser";
    
    private SetOfDeliveries() {
        listOdDeliveries = (ArrayList<Delivery>) DataAccessObject.Deserialize(filename);
        if(listOdDeliveries == null) {
            System.out.println("Couldn't load deliveries file, creating a new set");
            listOdDeliveries = new ArrayList<Delivery>();
        }
    }
    
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

    public ArrayList<Delivery> getListOdDeliveries() {
        return listOdDeliveries;
    }
   
}
