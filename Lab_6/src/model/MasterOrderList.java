/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dwaraka Deepika vadd
 */
public class MasterOrderList {

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    ArrayList<Order> orderList;
    
    public MasterOrderList(){
        orderList=new ArrayList<Order>();
    }
    public void addNewOrder(Order order){
        this.orderList.add(order);
    }
    
}
