/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem.controller;

import billingsystem.db.DBConnection;
import billingsystem.model.Order;
import billingsystem.model.OrderDetails;
import billingsystem.model.Product;
import billingsystem.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sudarshi
 */

public class ProductController {
    public static Product getProduct(String prodCode) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst;
            rst = stm.executeQuery("SELECT * FROM products WHERE prod_code='" + prodCode + "'");
        if (rst.next()) {
            Product product = new Product();
            product.setprodName(rst.getString(2));
            product.setprodPrice(rst.getDouble(3)); 
            product.setprodQtyHand(rst.getInt(4));
            return product;  
        }else {
            return null;
        }    
    }
    
    public static String generateOrderId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT order_id FROM orders ORDER BY order_id DESC LIMIT 1");

        if (rst.next()) {
            String orderID = rst.getString(1);
            orderID = orderID.split("[A-Z]")[1];
            orderID = (Integer.parseInt(orderID) + 1) + "";
            return "D" + orderID;
        } else {
            return "D1";
        }

    }
    
    public static String generateCustomerId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT customer_id FROM orders ORDER BY customer_id DESC LIMIT 1");

        if (rst.next()) {
            String orderID = rst.getString(1);
            orderID = orderID.split("[A-Z]")[1];
            orderID = (Integer.parseInt(orderID) + 1) + "";
            return "C" + orderID;
        } else {
            return "C1";
        }

    }
    
        public static boolean placeOrder(Order order) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            PreparedStatement stm = connection.prepareStatement("Insert into orders values(?,?,?,?)");
            stm.setObject(1, order.getOrderId());
            stm.setObject(2, order.getOrderTotal());           
            stm.setObject(3, order.getOrderDate());
            stm.setObject(4, order.getOrderCustomer());
            boolean isAddedOrder = stm.executeUpdate() > 0;
            if (isAddedOrder) {
                boolean isAddedItems = ProductController.addItemDetail(order.getItemDetailList());
                if (isAddedItems) {
                    boolean isUpdate = ProductController.updateStockDec(order.getItemDetailList());
                    if (isUpdate) {
                        connection.commit();
                        return true;
                    }
                }
            }
            return true;
        } finally {
            connection.setAutoCommit(true);
        }
    }
        
    public static boolean addItemDetail(ArrayList<OrderDetails> orderDetailsList) throws ClassNotFoundException, SQLException{
        for (OrderDetails itemDetails : orderDetailsList) {
            if(!addItemDetail(itemDetails)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean addItemDetail(OrderDetails itemDetails) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("insert into order_details values(?,?,?,?,?)");
        stm.setObject(1, itemDetails.getOrderId());
        stm.setObject(2, itemDetails.getProdCode());
        stm.setObject(3, itemDetails.getProdName());
        stm.setObject(4, itemDetails.getQty());
        stm.setObject(5, itemDetails.getUnitPrice());
        return stm.executeUpdate()>0;
    }

    public static boolean updateStockDec(ArrayList<OrderDetails> orderDetailsList) throws ClassNotFoundException, SQLException {
        for (OrderDetails itemDetail : orderDetailsList) {
            if(!updateStockDec(itemDetail)){
                return false;
            }
        }
        return true;
    }
    public static boolean updateStockDec(OrderDetails itemDetail) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL="Update products set qty_onhand=qty_onhand-"+itemDetail.getQty()+" where prod_code='"+itemDetail.getProdCode()+"'";
        return stm.executeUpdate(SQL)>0;
    }
}
