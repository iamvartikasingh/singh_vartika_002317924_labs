/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vartika
 */
/**
 * @author archil
 */
public class Feature {

    private Product owner;

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    private String name;
    private Object value;

    public Feature(Product owner) {
        this.owner = owner;
    }

    public Feature(Product owner, String name, Object value) {
        this.owner = owner;
        this.name = name;
        this.value = value;
    }

    
}