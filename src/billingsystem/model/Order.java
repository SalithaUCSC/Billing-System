/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem.model;

import java.util.ArrayList;

/**
 *
 * @author Sudarshi
 */
public class Order {
    
    private String orderId;
    private String orderQty;
    private String orderTotal;
    private String orderDate;
    private String orderCustomer;
    private ArrayList<OrderDetails> orderDetailsList;
    /**
     * @return the orderId
     */
    public Order() {
        
    }
    
    public Order(String orderId, String orderQty, String orderTotal, String orderDate, String orderCustomer, ArrayList<OrderDetails> orderDetailsList){
        this.orderId = orderId;
        this.orderQty = orderQty;
        this.orderTotal = orderTotal;
        this.orderDate = orderDate;
        this.orderCustomer = orderCustomer;
        this.orderDetailsList = orderDetailsList;
    }
    
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the orderQty
     */
    public String getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the orderTotal
     */
    public String getOrderTotal() {
        return orderTotal;
    }

    /**
     * @param orderTotal the orderTotal to set
     */
    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the orderCustomer
     */
    public String getOrderCustomer() {
        return orderCustomer;
    }

    /**
     * @param orderCustomer the orderCustomer to set
     */
    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer;
    }
        /**
     * @return the OrderDetailsList
     */
    public ArrayList<OrderDetails> getItemDetailList() {
        return orderDetailsList;
    }

    /**
     * @param itemDetailList the OrderDetailsList to set
     */
    public void setItemDetailList(ArrayList<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }
}
