package procurementsystem;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class Catalog {
    private ArrayList<Item> listofItems;    //included <Item>
    
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
     * Return Catalog
     * n.b. should this be here, if its just returning the current instance? is it a singleton?
     * @return 
     */
    public Catalog getCatalog() {
        return this;
    }
    
}
