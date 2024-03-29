package com.ps.app;

import com.ps.interfaces.CatalogUI;
import com.ps.interfaces.DeliveryUI;
import com.ps.interfaces.MainInterface;
import com.ps.interfaces.PlaceOrderUI;
import com.ps.interfaces.ViewOrdersUI;

/**
 * Main method class. Responsible for parsing any execution
 * options and configuration prior to running the application.
 * @author Group B
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
            // Initialise starting interface
            final MainInterface mainInterfaceUI = MainInterface.getInstance();
            
            // Forcing these to initialise here as theme doesn't work without it
            final CatalogUI catalogUI = CatalogUI.getInstance();
            final DeliveryUI deliveryUI = DeliveryUI.getInstance();
            final ViewOrdersUI viewOrdersUI = ViewOrdersUI.getInstance();
            final PlaceOrderUI placeOrdersUI = PlaceOrderUI.getInstance();
            mainInterfaceUI.Run();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start application thread
        new Thread(new Application()).start();
    }
     
}
