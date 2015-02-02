
package procurementsystem;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author JC
 */
public class PlaceOrderUI extends UserInterface {

    private Order newOrder;
    private CatalogUI catalogUI;
    
    private DefaultListModel items;
    private DefaultListModel quantities;
    
    private static PlaceOrderUI singleton;
    
    /**
     * Creates new form PlaceOrderUI
     */
    private PlaceOrderUI() {
        
        items = new DefaultListModel();
        quantities = new DefaultListModel();
        newOrder = new Order();
        
        initComponents();
        
        //Settings
        this.setSize(400, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static PlaceOrderUI getInstance() {
        if(singleton == null) {
            singleton = new PlaceOrderUI();
        }
        return singleton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsInOrder = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        quantityOfItemsInOrder = new javax.swing.JList();
        deleteSelectedItemBtn = new javax.swing.JButton();
        returnToCatalogBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemsInOrder.setModel(items);
        jScrollPane1.setViewportView(itemsInOrder);

        quantityOfItemsInOrder.setModel(quantities);
        jScrollPane2.setViewportView(quantityOfItemsInOrder);

        deleteSelectedItemBtn.setText("Delete Selected Item");
        deleteSelectedItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedItemBtnActionPerformed(evt);
            }
        });

        returnToCatalogBtn.setText("Return to Catalog");

        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteSelectedItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(returnToCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placeOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSelectedItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnToCatalogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(placeOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteSelectedItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSelectedItemBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        if(catalogUI != null) {
            catalogUI.closeCatalog();
            SetOfOrders orders = null;
            try {
                //deserialise
                orders = (SetOfOrders)Deserialize(SetOfOrdersFile);
                System.out.println("Loaded set of orders succesfully");
            } catch (IOException ex) {
                Logger.getLogger(PlaceOrderUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PlaceOrderUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(orders == null) {
                // file doesn't exist yet so create the object
                orders = new SetOfOrders();
            }
            orders.addOrder();
            try {
                Serialize(orders, SetOfOrdersFile);
                System.out.println("Serialized set of orders succesfully");
            } catch (IOException ex) {
                Logger.getLogger(PlaceOrderUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        System.out.println("catalogUI is null and cannot be closed");
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    /**
     * Main execution method for UserInterface
     */
    public void Run() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        PlaceOrderUI that = this;
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //that.setVisible(true);
                newOrder = new Order();
                
                catalogUI = CatalogUI.getInstance();
                catalogUI.setPosition(that.getX(), that.getY());
                catalogUI.Run();
            }
        });
    }
    
    /**
     * Complete the current order
     */
    public void completeOrder() {
        //TODO
    }
    
    /**
     * Returns the option
     */
    public Order getOption() {
        return null;
    }
    
    public void addItem(Item item, int quantity) {
        newOrder.addItem(item, quantity);
    }
    
    /**
     * Returns the currently selected item
     */
    /* public Item getSelectedItem() {
        return selectedItem;
    }*/
    
    /**
     * n.b. I have changed the name from Checkout in the design doc
     */
    public void checkout() {
        
        ArrayList<OrderLine> orderLines = newOrder.getOrderLines();
        
        for(int i = 0; i < orderLines.size(); i++) {
            OrderLine orderLine = orderLines.get(i);
            items.addElement(orderLine.getItem());
            quantities.addElement(orderLine.getQuantity());
        }
        
        this.setVisible(true);
    }
     
    @Override
    public void setPosition(int x, int y) {
        this.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteSelectedItemBtn;
    private javax.swing.JList itemsInOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JList quantityOfItemsInOrder;
    private javax.swing.JButton returnToCatalogBtn;
    // End of variables declaration//GEN-END:variables

}
