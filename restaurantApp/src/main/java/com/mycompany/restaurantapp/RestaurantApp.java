
package com.mycompany.restaurantapp;

import food.Dish;
import food.DishType;
import food.Menu;
import people.Customers;
import values.CustomerRule;

public class RestaurantApp {
    
    public static void main(String[] args){
        Customers student = new Customers(CustomerRule.STUNDENT, "asd", "Fulanito de tal");
        student.sellFood();
        
        Customers administrative = new Customers(CustomerRule.ADMINISTRATIVE, "xdd", "Jairo de tal");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos","Huevos, sal y pimienta", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo","Carne, papa, ajo", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa","Pastas, salsas", 2400, 20);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        
        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
    }
    
}
