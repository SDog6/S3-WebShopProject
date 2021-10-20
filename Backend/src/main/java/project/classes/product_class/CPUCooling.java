package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;


public class CPUCooling extends BasicProduct {

    private int voltage;

    public CPUCooling(String name,String brand,double price,int warranty, int voltage) {
        super(name,brand,price,warranty);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }
}