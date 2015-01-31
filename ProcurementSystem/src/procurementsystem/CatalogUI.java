package procurementsystem;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;

/**
 *
 * @author JC
 */
public class CatalogUI extends UserInterface {

    private Catalog catalog;
    private ArrayList<Item> selectedItems;
    private DefaultListModel allItems;
    //private ArrayList<Integer> selectedItemsQuantities;
    private DefaultListModel itemQuantities;
    //private ArrayList<Boolean> selectedItemsIcons;
    private DefaultListModel itemIcons;

    /**
     * Creates new form CatalogUI
     */
    public CatalogUI() {

        // Member data
        selectedItems = new ArrayList<>();
        allItems = new DefaultListModel();
        
        //selectedItemsQuantities = new ArrayList<>();
        itemQuantities = new DefaultListModel();
        
        //selectedItemsIcons = new ArrayList<>();
        itemIcons = new DefaultListModel();
        
        // Interface Settings
        this.setSize(400, 540);

        initComponents(); 
        
        listOfItems.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        quantityPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfSelectedItemNames = new javax.swing.JList();
        cancelOrderBtn = new javax.swing.JButton();
        proceedToOrderReviewBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listOfSelectedItemQuantities = new javax.swing.JList();
        catalogPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfItems = new javax.swing.JList();
        proceedToQuantityReviewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        quantityPanel.setVisible(false);

        listOfSelectedItemNames.setModel(allItems);
        jScrollPane2.setViewportView(listOfSelectedItemNames);

        cancelOrderBtn.setText("Cancel Order");

        proceedToOrderReviewBtn.setText("Proceed to Order Review");
        proceedToOrderReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedToOrderReviewBtnActionPerformed(evt);
            }
        });

        listOfSelectedItemQuantities.setModel(itemQuantities);
        jScrollPane4.setViewportView(listOfSelectedItemQuantities);

        javax.swing.GroupLayout quantityPanelLayout = new javax.swing.GroupLayout(quantityPanel);
        quantityPanel.setLayout(quantityPanelLayout);
        quantityPanelLayout.setHorizontalGroup(
            quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(quantityPanelLayout.createSequentialGroup()
                .addComponent(cancelOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceedToOrderReviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
            .addGroup(quantityPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        quantityPanelLayout.setVerticalGroup(
            quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quantityPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(proceedToOrderReviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        catalogPanel.setVisible(true);

        listOfItems.setModel(allItems);
        jScrollPane1.setViewportView(listOfItems);

        proceedToQuantityReviewBtn.setText("Proceed to Quantity Review");
        proceedToQuantityReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedToQuantityReviewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout catalogPanelLayout = new javax.swing.GroupLayout(catalogPanel);
        catalogPanel.setLayout(catalogPanelLayout);
        catalogPanelLayout.setHorizontalGroup(
            catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, catalogPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(proceedToQuantityReviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        catalogPanelLayout.setVerticalGroup(
            catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proceedToQuantityReviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catalogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(quantityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(catalogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(quantityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1.setLayer(quantityPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(catalogPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedToQuantityReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedToQuantityReviewBtnActionPerformed
        setSelectedItem();
        
        for(int i = 0; i < allItems.size(); i++) {
            
            Item item = (Item)allItems.get(i);
            if(selectedItems.contains(item)) {
                itemQuantities.addElement(1);
                JCheckBox checkBox = new JCheckBox(); 
                checkBox.setSelected(true);
                checkBox.setVisible(true);
                checkBox.setEnabled(false);
                quantityPanel.add(checkBox);
                checkBox.setBounds(280, 102 + (i * 22), 40, 40);
            } else {
                itemQuantities.addElement(0);
            }
        }
        
        catalogPanel.setVisible(false);
        quantityPanel.setVisible(true);
        quantityPanel.revalidate();
    }//GEN-LAST:event_proceedToQuantityReviewBtnActionPerformed

    private void proceedToOrderReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedToOrderReviewBtnActionPerformed
//       for(Item item : selectedItems) {
//           PlaceOrderUI.addItem(item, 1);
//       }   
    }//GEN-LAST:event_proceedToOrderReviewBtnActionPerformed

    
    /**
     * Main execution method for UserInterface
     */
    @Override
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
            java.util.logging.Logger.getLogger(CatalogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        CatalogUI that = this;

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                that.setVisible(true);

                catalog = Catalog.getCatalog();
                displayCatalog();
            }
        });
    }

    /*Item getSelectedItem() {
     return someItem;
     }*/
    /**
     * Display the Catalog
     */
    public void displayCatalog() {
        ArrayList<Item> itemList = catalog.getListOfItems();
        System.out.println("catalog items: " + itemList);
        allItems.clear();
        itemList.stream().forEach((item) -> {
            allItems.addElement(item);
        });
    }

    /**
     * Close the Catalog
     */
    public void closeCatalog() {
       
    }

    /**
     * Set selected item
     */
    public void setSelectedItem() {
        int[] indices = listOfItems.getSelectedIndices();
        for (int i = 0; i < indices.length; i++) {
            System.out.println("Selected index: " + indices[i]);
            selectedItems.add((Item)allItems.get(indices[i]));
        }
    }

    public DefaultListModel getModel() {
        return allItems;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrderBtn;
    private javax.swing.JPanel catalogPanel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listOfItems;
    private javax.swing.JList listOfSelectedItemNames;
    private javax.swing.JList listOfSelectedItemQuantities;
    private javax.swing.JButton proceedToOrderReviewBtn;
    private javax.swing.JButton proceedToQuantityReviewBtn;
    private javax.swing.JPanel quantityPanel;
    // End of variables declaration//GEN-END:variables
}
