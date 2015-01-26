package procurementsystem;

/**
 *
 * @author Simon
 */
public class ProcurementSystem {
  
    public static class Application implements Runnable {

        /**
         * Main application sequence
         */
        @Override
        public void run() {
            // Application logic goes here...
            // final MainInterface UI = new MainInterface();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Parse any command line arguments here
        
        // Start application thread
        new Thread(new Application()).start();
    }
     
}
