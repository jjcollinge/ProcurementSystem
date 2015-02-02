package procurementsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Super type for UI component. 
 * @author JC
 */
public abstract class UserInterface extends javax.swing.JFrame {
    protected static final String SetOfOrdersFile = "setOfOrders.ser";
    
    /**
     * In the design document this is here, but this
     * this should be overridden in each UI specialisation.
     * This could be an interface class which extends
     * Runnable.
     */
    
    /**
     * Wrapper method to invoke the JFrame thread
     */
    public abstract void Run();
    
    public abstract void setPosition(int x, int y);
}
