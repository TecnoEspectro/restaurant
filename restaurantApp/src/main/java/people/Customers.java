
package people;

import values.CustomerRule;

 

public class Customers {
    CustomerRule role;
    String id;
    String fullname;

    public Customers(CustomerRule role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
    
    void sayMenu() {
    
    }
    
    void buyFood() {
    
    }
    
    void cancelBuy() {
    
    }
    
    public void sellFood() {
        if (this.role != CustomerRule.ADMINISTRATIVE){
            System.out.println("Usted no tiene permiso para vender!!!");
            return;
        }
        System.out.println("Ya lo atiendo mijo");
    }
}
