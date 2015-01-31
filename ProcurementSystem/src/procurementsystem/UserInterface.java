package procurementsystem;

/**
 * Super type for UI component. 
 * @author JC
 */
public abstract class UserInterface extends javax.swing.JFrame {

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
}
