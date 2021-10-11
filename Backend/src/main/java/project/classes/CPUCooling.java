package project.classes;

import project.classes.SupportClasses.ProductInfo;

public class CPUCooling {

    private ProductInfo basicinfo;
    private int voltage;

    public CPUCooling(ProductInfo basicinfo, int voltage) {
        this.basicinfo = basicinfo;
        this.voltage = voltage;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public int getVoltage() {
        return voltage;
    }
}