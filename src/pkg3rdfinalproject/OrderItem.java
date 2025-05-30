/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3rdfinalproject;

/**
 *
 * @author Lynch
 */
public class OrderItem {
    private String productName;
    private int quantity;
    private String sizeOrVariation;
    private double unitPrice;

    public OrderItem(String productName, int quantity, String sizeOrVariation, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.sizeOrVariation = sizeOrVariation;
        this.unitPrice = unitPrice;
    }

    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public String getSizeOrVariation() { return sizeOrVariation; }
    public double getUnitPrice() { return unitPrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setSizeOrVariation(String sizeOrVariation) { this.sizeOrVariation = sizeOrVariation; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public double getSubtotal() { return quantity * unitPrice; }
}
    
