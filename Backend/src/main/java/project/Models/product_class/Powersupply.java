package project.Models.product_class;

import project.Models.product_class.parent_class.BasicProduct;

public class Powersupply extends BasicProduct {

    private int capacity;

    public Powersupply(String name,String brand,double price,int warranty,String url,int count ,int capacity) {
        super(name,brand,price,warranty,url,count);
        this.capacity = capacity;
    }



    public int getCapacity() {
        return capacity;
    }
}
