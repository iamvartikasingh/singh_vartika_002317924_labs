/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author vartika
 */
import javax.swing.ImageIcon;

public class Supplier {

    private String supplyName; // Correct name variable
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    // Constructor
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    // Getter and Setter for logoImage
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    // Getter for supplyName
    public String getSupplyName() {
        return supplyName;
    }

    // Setter for supplyName, properly assigning the value
    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }
     public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    

    // Override toString to display supplyName in JComboBox
    @Override
    public String toString() {
        return supplyName;  // Display supplier name in JComboBox
    }

}