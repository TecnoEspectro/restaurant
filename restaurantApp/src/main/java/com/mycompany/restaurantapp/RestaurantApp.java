
package com.mycompany.restaurantapp;

import people.Customers;
import values.CustomerRule;

public class RestaurantApp {
    
    public static void main(String[] args){
        Customers student = new Customers(CustomerRule.STUNDENT, "asd", "Fulanito de tal");
        student.sellFood();
        
        Customers administrative = new Customers(CustomerRule.ADMINISTRATIVE, "xdd", "Jairo de tal");
        administrative.sellFood();
    }
    
}
