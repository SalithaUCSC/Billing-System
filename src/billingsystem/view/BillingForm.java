/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem.view;

import billingsystem.controller.LoginController;
import billingsystem.controller.ProductController;
import billingsystem.model.Order;
import billingsystem.model.OrderDetails;
import billingsystem.model.Product;
import billingsystem.model.User;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudarshi
 */
public class BillingForm extends javax.swing.JFrame {

    /**
     * Creates new form BillingForm
     */
    public BillingForm() {
        initComponents();
        setLocationRelativeTo(null);
        LocalDate date = LocalDate.now(); 
        dateTxt.setText(date.toString());

        // Generating order id
        generateOrderId();
        generateCustomerId();
        prodCodeTxt.requestFocus();
        calculateTotalValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        customerIdLbl = new javax.swing.JLabel();
        codeLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        qtyHandLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        qtyLbl = new javax.swing.JLabel();
        prodCodeTxt = new javax.swing.JTextField();
        prodNameTxt = new javax.swing.JTextField();
        prodPriceTxt = new javax.swing.JTextField();
        prodQtyHandTxt = new javax.swing.JLabel();
        prodQtyTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        dateTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        totalTxt = new javax.swing.JTextField();
        cashTxt = new javax.swing.JTextField();
        totalLbl = new javax.swing.JLabel();
        cashLbl = new javax.swing.JLabel();
        orderIdLbl = new javax.swing.JLabel();
        orderTxt = new javax.swing.JTextField();
        customerIdTxt = new javax.swing.JTextField();
        balanceBtn = new javax.swing.JButton();
        balanceTxt = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILLING SYSTEM");

        customerIdLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customerIdLbl.setText("CUSTOMER ID : ");

        codeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codeLbl.setText("CODE");

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLbl.setText("NAME");

        qtyHandLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qtyHandLbl.setText("QTY HAND");

        priceLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLbl.setText("PRICE");

        qtyLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qtyLbl.setText("QTY");

        prodCodeTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prodCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCodeTxtActionPerformed(evt);
            }
        });

        prodNameTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prodNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameTxtActionPerformed(evt);
            }
        });

        prodPriceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prodPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPriceTxtActionPerformed(evt);
            }
        });

        prodQtyHandTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prodQtyHandTxt.setText("0");

        prodQtyTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prodQtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQtyTxtActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        dateTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLbl.setText("DATE :");

        prodTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Unit Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(prodTable);

        totalTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        cashTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cashTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashTxtActionPerformed(evt);
            }
        });

        totalLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalLbl.setText("TOTAL");

        cashLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cashLbl.setText("CASH");

        orderIdLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderIdLbl.setText("ORDER");

        orderTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTxtActionPerformed(evt);
            }
        });

        customerIdTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        balanceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceBtn.setText("BALANCE");
        balanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceBtnActionPerformed(evt);
            }
        });

        balanceTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveBtn.setText("SAVE ORDER");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchBtn)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyHandLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codeLbl)
                            .addComponent(orderIdLbl)
                            .addComponent(qtyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prodQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prodQtyHandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(prodCodeTxt)
                            .addComponent(prodPriceTxt)
                            .addComponent(orderTxt))))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(customerIdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(dateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(balanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cashLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cashTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIdLbl)
                    .addComponent(customerIdLbl)
                    .addComponent(customerIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLbl)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prodCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtyHandLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prodQtyHandTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prodPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prodNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(141, 141, 141)))
                        .addGap(234, 234, 234))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cashLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cashTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prodQtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtyLbl))
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(balanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashTxtActionPerformed
        balanceBtn.doClick();
    }//GEN-LAST:event_cashTxtActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        prodCodeTxt.setText("");
        prodNameTxt.setText("");
        prodPriceTxt.setText("");
        prodQtyTxt.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) prodTable.getModel();

        int qty = Integer.parseInt(prodQtyTxt.getText());

        if (qty > Integer.parseInt(prodQtyHandTxt.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Qty");
            return;
        }

        double unitPrice = Double.parseDouble(prodPriceTxt.getText());
        double total = qty * unitPrice;

        int rowIndex = isAlreadyExists(prodCodeTxt.getText());

        if (rowIndex == -1) {
            Object[] rowData = {
                prodCodeTxt.getText(),
                prodNameTxt.getText(),
                unitPrice,
                qty,
                total
            };
            model.addRow(rowData);
        } else {
            qty += (int) model.getValueAt(rowIndex, 3);
            total = qty * unitPrice;

            if (qty > Integer.parseInt(prodQtyHandTxt.getText())) {
                JOptionPane.showMessageDialog(this, "Insufficent Quantity");
                return;
            }

            prodTable.setValueAt(qty, rowIndex, 3);
            prodTable.setValueAt(total, rowIndex, 4);
        }

        calculateTotalValue();
        cashTxt.requestFocus();
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String prodCode = prodCodeTxt.getText();
        //        int qtyOnHand = Integer.parseInt(prodQtyHandTxt.getText());

        Product foundProduct = null;

        try {
            foundProduct = ProductController.getProduct(prodCode);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (foundProduct != null){
            prodPriceTxt.setText(foundProduct.getprodPrice()+"");
            prodNameTxt.setText(foundProduct.getprodName());
            prodQtyHandTxt.setText(foundProduct.getprodQtyHand()+"");
            prodQtyTxt.requestFocus();

        }else{
            JOptionPane.showMessageDialog(this, "Invalid Code");
            prodNameTxt.setText("");
            prodPriceTxt.setText("");
            prodQtyHandTxt.setText("");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void prodQtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQtyTxtActionPerformed
        addBtn.doClick();
    }//GEN-LAST:event_prodQtyTxtActionPerformed

    private void prodPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPriceTxtActionPerformed

    private void prodNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameTxtActionPerformed

    private void prodCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCodeTxtActionPerformed
        searchBtn.doClick();
    }//GEN-LAST:event_prodCodeTxtActionPerformed

    private void orderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderTxtActionPerformed

    private void balanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceBtnActionPerformed
        double totalPrice = Double.parseDouble(totalTxt.getText());
        double cash = Double.parseDouble(cashTxt.getText());
        
        double balance = cash - totalPrice;
        
        String bal = Double.toString(balance);
        
        if (totalPrice > cash) {
            JOptionPane.showMessageDialog(this, "Not enough to pay the bill");
        }
        else {
            balanceTxt.setText(bal);
        }
        
        
    }//GEN-LAST:event_balanceBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String orderId = orderTxt.getText();
        String orderQty = prodQtyTxt.getText();
        String orderTotal = totalTxt.getText();
        String orderDate = dateTxt.getText();
        String orderCustomer = customerIdTxt.getText();
        ArrayList<OrderDetails> itemDetailList = new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) prodTable.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String prodCode = (String) dtm.getValueAt(i, 0);
            String prodName = (String) dtm.getValueAt(i, 1);
            double unitPrice = (double) dtm.getValueAt(i, 2);
            int prodQty = (int) dtm.getValueAt(i, 3);
            OrderDetails itemDetails = new OrderDetails(orderId, prodCode, prodName, prodQty, unitPrice);
            itemDetailList.add(itemDetails);
        }
        Order order = new Order(orderId, orderQty, orderTotal, orderDate, orderCustomer, itemDetailList);
        
        try {
            boolean isAdded = ProductController.placeOrder(order);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Order Successfully saved");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int selectedRow = prodTable.getSelectedRow();

        if (selectedRow == -1) {
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) prodTable.getModel();
        dtm.removeRow(selectedRow);

        calculateTotalValue();
        prodQtyTxt.requestFocus();
    }//GEN-LAST:event_removeBtnActionPerformed
    
    private void generateOrderId() {
        try {
            String orderId = ProductController.generateOrderId();
            orderTxt.setText(orderId);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void generateCustomerId() {
        try {
            String customerId = ProductController.generateCustomerId();
            customerIdTxt.setText(customerId);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BillingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    
    private void calculateTotalValue() {

        DefaultTableModel dtm = (DefaultTableModel) prodTable.getModel();

        double total = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (double) dtm.getValueAt(i, 4);
        }

        totalTxt.setText(total + "");
    }

    private int isAlreadyExists(String prodCode) {

        DefaultTableModel dtm = (DefaultTableModel) prodTable.getModel();

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 0);
            if (code.equals(prodCode)) {
                return i;
            }
        }

        return -1;

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BillingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton balanceBtn;
    private javax.swing.JLabel balanceTxt;
    private javax.swing.JLabel cashLbl;
    private javax.swing.JTextField cashTxt;
    private javax.swing.JLabel codeLbl;
    private javax.swing.JLabel customerIdLbl;
    private javax.swing.JTextField customerIdTxt;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel orderIdLbl;
    private javax.swing.JTextField orderTxt;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField prodCodeTxt;
    private javax.swing.JTextField prodNameTxt;
    private javax.swing.JTextField prodPriceTxt;
    private javax.swing.JLabel prodQtyHandTxt;
    private javax.swing.JTextField prodQtyTxt;
    private javax.swing.JTable prodTable;
    private javax.swing.JLabel qtyHandLbl;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JTextField totalTxt;
    // End of variables declaration//GEN-END:variables
}
