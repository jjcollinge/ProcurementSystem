package procurementsystem;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Catalog {
    
    private ArrayList<Item> listOfItems;    //included <Item>
    private static Catalog singleton;
    
    private Catalog() {
        Item itemA = new Item("A", 30.4, "Item");
        Item itemB = new Item("B", 23.45, "Item");
        listOfItems = new ArrayList<Item>();
        listOfItems.add(itemA);
        listOfItems.add(itemB);
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
