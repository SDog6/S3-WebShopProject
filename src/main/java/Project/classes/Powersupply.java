package Project.classes;

import Project.classes.SupportClasses.ProductInfo;

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
