package procurementsystem;

/**
 *
 * @author Simon
 */
public class OrderLine {
    private Item item;
    private int quantity;
    
    /**
     * Default constructor
     */
    public OrderLine(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    /**
     * Delete Item from OrderLine
     */
    public void deleteItem() {
        
    }
    
    /**
     * Update the quantity
     */
    public void changeQuantity() {
        
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
