/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem.model;

/**
 *
 * @author Sudarshi
 */
public class Product {
    private String prodCode;
    private String prodName;
    private double prodPrice;
    private int prodQtyHand;
    
    public Product(){
        
    }
    
    public Product(String prodCode,String prodName, double prodPrice,int prodQty){
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodQtyHand = prodQtyHand;
    }
    
    public void setProdCode(String prodCode){
        this.prodCode = prodCode;
    }
    
    public String getProdCode() {
        return prodCode;
    }
    
    public void setprodName(String prodName){
        this.prodName = prodName;
    }
    
    public String getprodName() {
        return prodName;
    }
    
    public void setprodPrice(double prodPrice){
        this.prodPrice = prodPrice;
    }
    
    public double getprodPrice() {
        return prodPrice;
    }
    
    public void setprodQtyHand(int prodQtyHand){
        this.prodQtyHand = prodQtyHand;
    }
    
    public int getprodQtyHand() {
        return prodQtyHand;
    }
}