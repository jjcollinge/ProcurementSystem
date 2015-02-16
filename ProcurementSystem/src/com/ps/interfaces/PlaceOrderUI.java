
package com.ps.interfaces;

import com.ps.model.Item;
import com.ps.model.Order;
import com.ps.model.OrderLine;
import com.ps.model.SetOfOrders;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author JC
 */
public class PlaceOrderUI extends UserInterface {

    private Order currentOrder;
    private CatalogUI catalogUI;
    
    private DefaultListModel<Item> items;
    private DefaultListModel<Integer> quantities;
    
    private static PlaceOrderUI singleton;
    
    private boolean ascending = true;
    
    /**
     * Creates new form PlaceOrderUI
     */
    private PlaceOrderUI() {
        
        // initialise models
        items = new DefaultListModel();
        quantities = new DefaultListModel();
        
        currentOrder = new Order();    
        initComponents();
        
        //Settings
        this.setSize(400, 540);
        getContentPane().setBackground(new Color(64, 64, 64));
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
        inputValueField = new javax.swing.JTextField();
        ascendBtn = new javax.swing.JToggleButton();
        descendBtn = new javax.swing.JToggleButton();
        tapItemToModifyLabel = new javax.swing.JLabel();
        placeOrderTitleSeparator = new javax.swing.JSeparator();
        placeOrderTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 540));
        setMinimumSize(new java.awt.Dimension(400, 540));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 540));

        itemsInOrder.setBackground(new java.awt.Color(51, 51, 51));
        itemsInOrder.setForeground(new java.awt.Color(255, 255, 255));
        itemsInOrder.setModel(items);
        jScrollPane1.setViewportView(itemsInOrder);

        quantityOfItemsInOrder.setBackground(new java.awt.Color(51, 51, 51));
        quantityOfItemsInOrder.setForeground(new java.awt.Color(255, 255, 255));
        quantityOfItemsInOrder.setModel(quantities);
        jScrollPane2.setViewportView(quantityOfItemsInOrder);

        deleteSelectedItemBtn.setBackground(new java.awt.Color(102, 102, 102));
        deleteSelectedItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteSelectedItemBtn.setText("Delete Selected Item");
        deleteSelectedItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedItemBtnActionPerformed(evt);
            }
        });

        returnToCatalogBtn.setBackground(new java.awt.Color(102, 102, 102));
        returnToCatalogBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnToCatalogBtn.setText("Return to Catalog");
        returnToCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToCatalogBtnActionPerformed(evt);
            }
        });

        placeOrderBtn.setBackground(new java.awt.Color(102, 102, 102));
        placeOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        inputValueField.setForeground(new java.awt.Color(153, 153, 153));
        inputValueField.setText("Input value");
        inputValueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputValueFieldKeyReleased(evt);
            }
        });

        ascendBtn.setBackground(new java.awt.Color(51, 51, 51));
        ascendBtn.setForeground(new java.awt.Color(255, 255, 255));
        ascendBtn.setText("Ascend");
        ascendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendBtnActionPerformed(evt);
            }
        });

        descendBtn.setBackground(new java.awt.Color(51, 51, 51));
        descendBtn.setForeground(new java.awt.Color(255, 255, 255));
        descendBtn.setText("Descend");
        descendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendBtnActionPerformed(evt);
            }
        });

        tapItemToModifyLabel.setBackground(new java.awt.Color(51, 51, 51));
        tapItemToModifyLabel.setForeground(new java.awt.Color(255, 255, 255));
        tapItemToModifyLabel.setText("Tap item to modify");

        placeOrderTitle.setBackground(new java.awt.Color(51, 51, 51));
        placeOrderTitle.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderTitle.setText("Order Review - Checkout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeOrderTitleSeparator)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteSelectedItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputValueField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(returnToCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placeOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ascendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(descendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tapItemToModifyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(placeOrderTitle))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(placeOrderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeOrderTitleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ascendBtn)
                    .addComponent(descendBtn)
                    .addComponent(tapItemToModifyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteSelectedItemBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputValueField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnToCatalogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(placeOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteSelectedItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedItemBtnActionPerformed
        // get selected item
        int selectedItemIndex = itemsInOrder.getSelectedIndex();
        
        // remove from items
        items.remove(selectedItemIndex);
        quantities.remove(selectedItemIndex);
    }//GEN-LAST:event_deleteSelectedItemBtnActionPerformed
 
    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        if(catalogUI != null) {
            catalogUI.closeCatalog();
            SetOfOrders orders = SetOfOrders.getInstance();
            currentOrder.setOrderDate(new Date());
            currentOrder.addSpecialInstructions("These are special instructions");
            orders.addOrder(currentOrder);
            this.setVisible(false);
            items.clear();
            currentOrder = null;
            MainInterface.getInstance().Run();
        } else {
            System.out.println("catalogUI is null and cannot be closed");
        }
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void ascendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendBtnActionPerformed
        if(!ascending) {
            reverseList();
            descendBtn.setSelected(false);
            ascendBtn.setSelected(true);
            ascending = true;
        }
    }//GEN-LAST:event_ascendBtnActionPerformed

    private void descendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendBtnActionPerformed
        if(ascending) {
            reverseList();
            ascendBtn.setSelected(false);
            descendBtn.setSelected(true);
            ascending = false;
        }
    }//GEN-LAST:event_descendBtnActionPerformed

    private void inputValueFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputValueFieldKeyReleased
         // get selected item
        int selectedItemIndex = quantityOfItemsInOrder.getSelectedIndex();
        
        // get selected value
        String txt = inputValueField.getText();
        
        // parse input value
        int value;
        try {
            value = Integer.valueOf(txt);
        } catch(NumberFormatException e) {
            System.out.println("Couldn't convert input value to Integer");
            return;
        }
        
        // alter item quantity
        if(selectedItemIndex >= 0 && selectedItemIndex < quantities.size())
            quantities.set(selectedItemIndex, value);
        
    }//GEN-LAST:event_inputValueFieldKeyReleased

    private void returnToCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToCatalogBtnActionPerformed

        items.clear();
        quantities.clear();
        itemsInOrder.removeAll();
        quantityOfItemsInOrder.removeAll();
        currentOrder = new Order();
        
        CatalogUI ui = catalogUI.getInstance();
        ui.closeCatalog();
        
        catalogUI.setPosition(this.getX(), this.getY());
        catalogUI.Run();
        
        this.setVisible(false);
    }//GEN-LAST:event_returnToCatalogBtnActionPerformed

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
                currentOrder = new Order();
                
                catalogUI = CatalogUI.getInstance();
                catalogUI.setMode("order");
                catalogUI.setPosition(that.getX(), that.getY());
                catalogUI.Run();
            }
        });
    }
    
    public void clear() {
        items.clear();
        quantities.clear();
        currentOrder = new Order();
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
    
    /**
     * add an item to the current order
     * @param item
     * @param quantity 
     */
    public void addItem(Item item, int quantity) {
        currentOrder.addItem(item, quantity);
    }
    
    /**
     * Returns the currently selected item
     */
    /* public Item getSelectedItem() {
        return selectedItem;
    }*/
    
    public boolean orderInProcess() {
        if(currentOrder == null) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * n.b. I have changed the name from Checkout in the design doc
     */
    public void checkout() {
        
        ArrayList<OrderLine> orderLines = currentOrder.getOrderLines();
        
        // for each orderline from the order and add them to the model
        for(int i = 0; i < orderLines.size(); i++) {
            OrderLine orderLine = orderLines.get(i);
            items.addElement(orderLine.getItem());
            quantities.addElement(orderLine.getQuantity());
        }
        // make visible
        this.setVisible(true);
    }
    
    private void reverseList() {
        ArrayList<Item> reversedList = new ArrayList<>();
        ArrayList<Integer> reversedQuantities = new ArrayList<>();
        // reverse the item list and quantity list
        for(int i = items.size() - 1; i >= 0; i--) {
            reversedList.add(items.get(i));
            reversedQuantities.add(quantities.get(i));
        }
        items.clear();
        reversedList.stream().forEach((item) -> {
            items.addElement(item);
        });
        quantities.clear();
        for(Integer quantity : reversedQuantities) {
            quantities.addElement(quantity);
        }
    }
    
    /**
     * set the current orders site field
     * @param site 
     */
    public void setSite(String site) {
        currentOrder.setSite(site);
    }
     
    @Override
    public void setPosition(int x, int y) {
        this.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ascendBtn;
    private javax.swing.JButton deleteSelectedItemBtn;
    private javax.swing.JToggleButton descendBtn;
    private javax.swing.JTextField inputValueField;
    private javax.swing.JList itemsInOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JLabel placeOrderTitle;
    private javax.swing.JSeparator placeOrderTitleSeparator;
    private javax.swing.JList quantityOfItemsInOrder;
    private javax.swing.JButton returnToCatalogBtn;
    private javax.swing.JLabel tapItemToModifyLabel;
    // End of variables declaration//GEN-END:variables

}
