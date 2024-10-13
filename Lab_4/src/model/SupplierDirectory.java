/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vartika
 */




public class SupplierDirectory {

    // Declare the supplier list
    private ArrayList<Supplier> supplierList;

    // Constructor to initialize the supplier list
    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }

    // Method to get the list of suppliers
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    // Method to add a supplier to the list
    public Supplier addSupplier() {
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }

    // Method to remove a supplier from the list
    public void removeSupplier(Supplier s) {
        supplierList.remove(s);
    }

    // Method to search for a supplier by name
    public Supplier searchSupplier(String keyWord) {
        for (Supplier s : supplierList) {
            if (keyWord.equals(s.getSupplyName())) {
                return s;
            }
        }
        return null;  // Return null if no supplier is found
    }
}