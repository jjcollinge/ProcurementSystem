/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procurementsystem;

/**
 *
 * @author Simon
 */
public class ProcurementSystem {
  
    public static class Application implements Runnable {
        public void run() {
            // Application logic goes here...
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
