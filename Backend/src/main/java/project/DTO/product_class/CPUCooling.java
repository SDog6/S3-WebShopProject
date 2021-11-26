package project.DTO.product_class;

import project.DTO.product_class.parent_class.BasicProduct;


public class CPUCooling extends BasicProduct {

    private int voltage;

    public CPUCooling(String name,String brand,double price,int warranty,String url, int voltage) {
        super(name,brand,price,warranty,url);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }
}