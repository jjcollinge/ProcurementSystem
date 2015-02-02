package procurementsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Catalog implements Serializable {
    
    private ArrayList<Item> listOfItems;    //included <Item>
    private static Catalog singleton;
    private final String filename = "catalog.ser";
    
    private Catalog() {
        
        listOfItems = (ArrayList<Item>)DataAccessObject.Deserialize(filename);
        if(listOfItems == null) {
            initCatalog();
        }
    }
    
    /**
     * Return Catalog
     * n.b. should this be here, if its just returning the current instance? is it a singleton?
     * @return 
     */
    public static Catalog getCatalog() {
        if(singleton == null) {
            singleton = new Catalog();
        }
        return singleton;
    }
    
    public void initCatalog() {
        listOfItems = new ArrayList<>();
        
        listOfItems.add(new Item("Architraves standard, pine", 10.0, "2m"));
        listOfItems.add(new Item("Bolts 5mm, length 25mm", 15.0, "box of 200"));
        listOfItems.add(new Item("Door brass handles", 5.0, "single"));
        listOfItems.add(new Item("Concrete mixed by truck", 50.0, "500kg"));
       
        DataAccessObject.Serialize(listOfItems, filename);
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

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }
    
}
