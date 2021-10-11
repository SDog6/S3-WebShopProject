package project.classes;

import project.classes.SupportClasses.ProductInfo;

public class RAM {


    ProductInfo basicinfo;
    int amount;
    int voltage;

    public RAM(ProductInfo basicinfo, int amount, int voltage) {
        this.basicinfo = basicinfo;
        this.amount = amount;
        this.voltage = voltage;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public int getAmount() {
        return amount;
    }

    public int getVoltage() {
        return voltage;
    }
}
