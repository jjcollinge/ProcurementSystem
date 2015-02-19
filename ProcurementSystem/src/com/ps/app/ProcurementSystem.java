package com.ps.app;

import com.ps.interfaces.MainInterface;

/**
 * Main method class. Responsible for parsing any execution
 * options and configuration prior to running the application.
 * @author JCollinge
 */
public class ProcurementSystem {
  
    /**
     * Separate the application from the main method to 
     * allow main method overloading
     */
    public static class Application implements Runnable {

        /**
         * Main application sequence
         */
        @Override
        public void run() {
            // Application logic goes here...
            final MainInterface UI = MainInterface.getInstance();
            UI.Run();
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
