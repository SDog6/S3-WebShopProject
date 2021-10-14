package project.classes.product_class;

import project.classes.product_class.parent_class.ProductInfo;

public class Powersupply {

    private ProductInfo basicinfo;
    private int capacity;

    public Powersupply(ProductInfo basicinfo, int capacity) {
        this.basicinfo = basicinfo;
        this.capacity = capacity;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public int getCapacity() {
        return capacity;
    }
}
