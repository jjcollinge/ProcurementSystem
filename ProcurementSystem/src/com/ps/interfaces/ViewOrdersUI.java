package com.ps.interfaces;

import com.ps.model.Order;
import com.ps.model.OrderLine;
import com.ps.model.Item;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import com.ps.model.SetOfOrders;
import java.awt.Dimension;

/**
 *
 * @author JC
 */
public class ViewOrdersUI extends UserInterface {

    private static ViewOrdersUI singleton;
    private SetOfOrders orders;
    private DefaultListModel<Order> ordersModel;
    private DefaultListModel<Item> orderModel;
    private DefaultListModel<Integer> orderQuantityModel;
    
    private boolean siteFiltered = false;
    private boolean dateFiltered = false;
    private boolean supplierFiltered = false;
    private boolean ascending = true;
    
    /**
     * Creates new form ViewOrderUI
     */
    private ViewOrdersUI() {
        
        ordersModel =  new DefaultListModel();
        orderModel = new DefaultListModel();
        orderQuantityModel = new DefaultListModel();
        
        displayCurrentOrders();
        initComponents();
        
        activeOrdersOnlyBtn.setSelected(true);
        
        //Settings
        jLayeredPane1.setPreferredSize(new Dimension(400, 540));
        getContentPane().setBackground(new Color(64, 64, 64));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        orderPanel.setVisible(false);
        ordersPanel.setVisible(true);
    }

    public static ViewOrdersUI getInstance() {
        if (singleton == null) {
            singleton = new ViewOrdersUI();
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        orderPanel = new javax.swing.JPanel();
        orderPanelTitle = new javax.swing.JLabel();
        OrderPanelTitleSeparator = new javax.swing.JSeparator();
        orderDateLabel = new javax.swing.JLabel();
        orderDateValue = new javax.swing.JLabel();
        itemsOrderedLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsOrderedList = new javax.swing.JList();
        deliverDateLabel = new javax.swing.JLabel();
        deliveryDateValue = new javax.swing.JLabel();
        signedForByLabel = new javax.swing.JLabel();
        signedForByValue = new javax.swing.JLabel();
        deliveryStatusLabel = new javax.swing.JLabel();
        deliveryStatusValue = new javax.swing.JLabel();
        printAuditTrailBtn = new javax.swing.JButton();
        returnToExistingOrdersBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemsOrderedQuantities = new javax.swing.JList();
        ordersPanel = new javax.swing.JPanel();
        locationTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        supplierTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        matchingExistingOrders = new javax.swing.JList();
        returnToMainMenuBtn = new javax.swing.JButton();
        filterBySiteBtn = new javax.swing.JToggleButton();
        filterByDateBtn = new javax.swing.JToggleButton();
        filterBySupplierBtn = new javax.swing.JToggleButton();
        ascendBtn = new javax.swing.JToggleButton();
        descendBtn = new javax.swing.JToggleButton();
        activeOrdersOnlyBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(400, 540));

        orderPanel.setPreferredSize(new java.awt.Dimension(400, 540));

        orderPanelTitle.setText("Audit - Order Id: 00127653");

        orderDateLabel.setText("Order Date:");

        orderDateValue.setText("12/10/2013");

        itemsOrderedLabel.setText("Items Ordered");

        itemsOrderedList.setModel(orderModel);
        jScrollPane2.setViewportView(itemsOrderedList);

        deliverDateLabel.setText("Delivery Date:");

        deliveryDateValue.setText("19/10/2013");

        signedForByLabel.setText("Signed For By:");

        signedForByValue.setText("Kumar Kalla");

        deliveryStatusLabel.setText("Delivery Status:");

        deliveryStatusValue.setText("Accepted");

        printAuditTrailBtn.setText("Print Audit Trail");
        printAuditTrailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printAuditTrailBtnActionPerformed(evt);
            }
        });

        returnToExistingOrdersBtn.setText("Return to Existing Orders");
        returnToExistingOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToExistingOrdersBtnActionPerformed(evt);
            }
        });

        itemsOrderedQuantities.setBackground(new java.awt.Color(51, 51, 51));
        itemsOrderedQuantities.setForeground(new java.awt.Color(255, 255, 255));
        itemsOrderedQuantities.setModel(orderQuantityModel);
        jScrollPane3.setViewportView(itemsOrderedQuantities);

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrderPanelTitleSeparator)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(orderDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderDateValue))
                            .addComponent(itemsOrderedLabel)))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(printAuditTrailBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnToExistingOrdersBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(deliveryStatusLabel)
                                .addGap(18, 18, 18)
                                .addComponent(deliveryStatusValue))
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(signedForByLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signedForByValue))
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(deliverDateLabel)
                                .addGap(18, 18, 18)
                                .addComponent(deliveryDateValue))))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(orderPanelTitle))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPanelTitle)
                .addGap(12, 12, 12)
                .addComponent(OrderPanelTitleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderDateLabel)
                    .addComponent(orderDateValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemsOrderedLabel)
                .addGap(18, 18, 18)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliverDateLabel)
                    .addComponent(deliveryDateValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signedForByLabel)
                    .addComponent(signedForByValue))
                .addGap(37, 37, 37)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryStatusLabel)
                    .addComponent(deliveryStatusValue))
                .addGap(18, 18, 18)
                .addComponent(printAuditTrailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToExistingOrdersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        ordersPanel.setBackground(new java.awt.Color(51, 51, 51));
        ordersPanel.setForeground(new java.awt.Color(255, 255, 255));

        locationTextField.setText("Sheffield S1");

        dateTextField.setText(new SimpleDateFormat("dd/M/yyyy").format(new Date()));

        supplierTextField.setText("Type here");

        matchingExistingOrders.setBackground(new java.awt.Color(51, 51, 51));
        matchingExistingOrders.setForeground(new java.awt.Color(255, 255, 255));
        matchingExistingOrders.setModel(ordersModel);
        matchingExistingOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                matchingExistingOrdersMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(matchingExistingOrders);

        returnToMainMenuBtn.setBackground(new java.awt.Color(102, 102, 102));
        returnToMainMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnToMainMenuBtn.setText("Return to Main Menu");
        returnToMainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainMenuBtnActionPerformed(evt);
            }
        });

        filterBySiteBtn.setBackground(new java.awt.Color(102, 102, 102));
        filterBySiteBtn.setForeground(new java.awt.Color(255, 255, 255));
        filterBySiteBtn.setText("Site Filtered");
        filterBySiteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBySiteBtnActionPerformed(evt);
            }
        });

        filterByDateBtn.setBackground(new java.awt.Color(102, 102, 102));
        filterByDateBtn.setForeground(new java.awt.Color(255, 255, 255));
        filterByDateBtn.setText("Filter by Date");
        filterByDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterByDateBtnActionPerformed(evt);
            }
        });

        filterBySupplierBtn.setBackground(new java.awt.Color(102, 102, 102));
        filterBySupplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        filterBySupplierBtn.setText("Filter by Supplier");
        filterBySupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBySupplierBtnActionPerformed(evt);
            }
        });

        ascendBtn.setBackground(new java.awt.Color(102, 102, 102));
        ascendBtn.setForeground(new java.awt.Color(255, 255, 255));
        ascendBtn.setText("Ascend");
        ascendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendBtnActionPerformed(evt);
            }
        });

        descendBtn.setBackground(new java.awt.Color(102, 102, 102));
        descendBtn.setForeground(new java.awt.Color(255, 255, 255));
        descendBtn.setText("Descend");
        descendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendBtnActionPerformed(evt);
            }
        });

        activeOrdersOnlyBtn.setBackground(new java.awt.Color(102, 102, 102));
        activeOrdersOnlyBtn.setForeground(new java.awt.Color(255, 255, 255));
        activeOrdersOnlyBtn.setText("Active Orders Only");
        activeOrdersOnlyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeOrdersOnlyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ordersPanelLayout = new javax.swing.GroupLayout(ordersPanel);
        ordersPanel.setLayout(ordersPanelLayout);
        ordersPanelLayout.setHorizontalGroup(
            ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersPanelLayout.createSequentialGroup()
                .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordersPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ordersPanelLayout.createSequentialGroup()
                                .addComponent(ascendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterBySupplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filterBySiteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filterByDateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activeOrdersOnlyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ordersPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnToMainMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ordersPanelLayout.setVerticalGroup(
            ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBySiteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterByDateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBySupplierBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ascendBtn)
                    .addComponent(descendBtn)
                    .addComponent(activeOrdersOnlyBtn))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToMainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(orderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ordersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1.setLayer(orderPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ordersPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnToExistingOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToExistingOrdersBtnActionPerformed
        orderPanel.setVisible(false);
        ordersPanel.setVisible(true);
    }//GEN-LAST:event_returnToExistingOrdersBtnActionPerformed

    private void printAuditTrailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printAuditTrailBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printAuditTrailBtnActionPerformed

    private void activeOrdersOnlyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeOrdersOnlyBtnActionPerformed

    }//GEN-LAST:event_activeOrdersOnlyBtnActionPerformed

    private void descendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendBtnActionPerformed
        if(ascending) {
            reverseList();
            descendBtn.setSelected(true);
            ascendBtn.setSelected(false);
            ascending = false;
        }
    }//GEN-LAST:event_descendBtnActionPerformed

    private void ascendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendBtnActionPerformed
        if(!ascending) {
            reverseList();
            descendBtn.setSelected(false);
            ascendBtn.setSelected(true);
            ascending = true;
        }
    }//GEN-LAST:event_ascendBtnActionPerformed

    private void filterBySupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBySupplierBtnActionPerformed
        if(supplierFiltered) {
            displayCurrentOrders();
            supplierFiltered = false;
        } else {
            // set flags
            supplierFiltered = true;
            dateFiltered = false;
            siteFiltered = false;
            // turn off site && date
            filterBySiteBtn.setSelected(false);
            filterByDateBtn.setSelected(false);

            String param = supplierTextField.getText();
            requestFilter("supplier", param);
        }
    }//GEN-LAST:event_filterBySupplierBtnActionPerformed

    private void filterByDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterByDateBtnActionPerformed
        if(dateFiltered) {
            displayCurrentOrders();
            dateFiltered = false;
        } else {
            // set flags
            dateFiltered = true;
            siteFiltered = false;
            supplierFiltered = false;
            // turn off site & supplier
            filterBySiteBtn.setSelected(false);
            filterBySupplierBtn.setSelected(false);

            String txt = dateTextField.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
            Date date = null;
            try {
                date = sdf.parse(txt);
            } catch (ParseException ex) {
                Logger.getLogger(ViewOrdersUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            requestFilter("date", date);

        }
    }//GEN-LAST:event_filterByDateBtnActionPerformed

    private void filterBySiteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBySiteBtnActionPerformed
        if(siteFiltered) {
            displayCurrentOrders();
            siteFiltered = false;
        } else {
            // set flags
            siteFiltered = true;
            dateFiltered = false;
            supplierFiltered = false;
            // turn off data & supplier
            filterByDateBtn.setSelected(false);
            filterBySupplierBtn.setSelected(false);

            String param = locationTextField.getText();
            requestFilter("site", param);
        }
    }//GEN-LAST:event_filterBySiteBtnActionPerformed

    private void returnToMainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainMenuBtnActionPerformed

        MainInterface ui = MainInterface.getInstance();
        ui.setPosition(this.getX(), this.getY());

        this.setVisible(false);
        ui.Run();
    }//GEN-LAST:event_returnToMainMenuBtnActionPerformed

    private void matchingExistingOrdersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matchingExistingOrdersMouseReleased
        // User has selected an order
        Order selectedOrder = (Order)matchingExistingOrders.getSelectedValue();
        initialiseOrderPanel(selectedOrder);
    }//GEN-LAST:event_matchingExistingOrdersMouseReleased

    private void initialiseOrderPanel(Order order) {
  
        orderModel.clear();
        orderQuantityModel.clear();
        
        orderDateValue.setText(new SimpleDateFormat("dd/MM/yyyy").format(order.getOrderDate()));
        deliveryDateValue.setText("This doesn't exist");
        signedForByValue.setText("Not implemented yet");
        deliveryStatusValue.setText("Not implemented yet");
        
        ArrayList<OrderLine> orderLines = order.getOrderLines();
        for(OrderLine orderLine : orderLines) {
            orderModel.addElement(orderLine.getItem());
            orderQuantityModel.addElement(orderLine.getQuantity());
        }
        
        ordersPanel.setVisible(false);
        orderPanel.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(ViewOrdersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrdersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        ViewOrdersUI that = this;

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                that.displayCurrentOrders();
                that.setVisible(true);
            }
        });
    }
    
    private void reverseList() {
        ArrayList<Order> reversedList = new ArrayList<>();
        for(int i = ordersModel.size() - 1; i >= 0; i--) {
            reversedList.add(ordersModel.get(i));
        }
        ordersModel.clear();
        reversedList.stream().forEach((item) -> {
            ordersModel.addElement(item);
        });
    }

     //private SetOfOrders orderList;
    /**
     * Displays all of the current orders
     */
    public void displayCurrentOrders() {
        orders = SetOfOrders.getInstance();
        
        ordersModel.clear();
        for(Order order : orders.getOpenOrders()) {
            ordersModel.addElement(order);
        }
    }

    /**
     * Load all current orders
     */
    public void loadOrders() {
        //TODO
    }

    /**
     * Filter order list
     */
    public void requestFilter(String filter, Object param) {

        ArrayList<Order> matching = null;
        if(filter.equalsIgnoreCase("site")) {
            matching = orders.filterBySite((String)param);
        } else if(filter.equalsIgnoreCase("date")) {
            matching = orders.filterByDate((Date)param);
        } else if(filter.equalsIgnoreCase("supplier")) {
            matching = orders.filterBySupplier((String)param);
        }
        
        ordersModel.clear();
        for(Order order : matching) {
            ordersModel.addElement(order);
        }
    }

    @Override
    public void setPosition(int x, int y) {
        this.setLocation(x, y);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator OrderPanelTitleSeparator;
    private javax.swing.JToggleButton activeOrdersOnlyBtn;
    private javax.swing.JToggleButton ascendBtn;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel deliverDateLabel;
    private javax.swing.JLabel deliveryDateValue;
    private javax.swing.JLabel deliveryStatusLabel;
    private javax.swing.JLabel deliveryStatusValue;
    private javax.swing.JToggleButton descendBtn;
    private javax.swing.JToggleButton filterByDateBtn;
    private javax.swing.JToggleButton filterBySiteBtn;
    private javax.swing.JToggleButton filterBySupplierBtn;
    private javax.swing.JLabel itemsOrderedLabel;
    private javax.swing.JList itemsOrderedList;
    private javax.swing.JList itemsOrderedQuantities;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JList matchingExistingOrders;
    private javax.swing.JLabel orderDateLabel;
    private javax.swing.JLabel orderDateValue;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel orderPanelTitle;
    private javax.swing.JPanel ordersPanel;
    private javax.swing.JButton printAuditTrailBtn;
    private javax.swing.JButton returnToExistingOrdersBtn;
    private javax.swing.JButton returnToMainMenuBtn;
    private javax.swing.JLabel signedForByLabel;
    private javax.swing.JLabel signedForByValue;
    private javax.swing.JTextField supplierTextField;
    // End of variables declaration//GEN-END:variables

}
