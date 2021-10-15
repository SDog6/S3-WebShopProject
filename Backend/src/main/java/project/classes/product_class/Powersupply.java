package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;

public class Powersupply extends BasicProduct {

    private int capacity;

    public Powersupply(String name,String brand,double price,int warranty, int capacity) {
        super(name,brand,price,warranty);
        this.capacity = capacity;
    }



    public int getCapacity() {
        return capacity;
    }
}
