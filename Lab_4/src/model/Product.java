/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author vartika
 */
public class Product {

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
  

    private String name;
    private int price;
    private int id;
    private ImageIcon pImage;

    public ImageIcon getpImage() {
        return pImage;
    }

    public void setpImage(ImageIcon pImage) {
        this.pImage = pImage;
    }
    private ArrayList<Feature> features;



    private static int count = 0;

    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }
  public void setName(String name) {
        this.name = name;
    }
    // Additional getters and setters can be added as needed
  
  
     // Method to add a new feature to the product
    public Feature addNewFeature() {
        // Create a new Feature object for this product
        Feature newFeature = new Feature(this);

        // Add the new feature to the product's list of features
        features.add(newFeature);

        // Return the newly added feature
        return newFeature;
    }
    
     @Override
    public String toString() {
        return name;
    }
}

