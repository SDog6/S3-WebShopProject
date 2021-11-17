package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;

public class RAM extends BasicProduct {

    int amount;
    int voltage;

    public RAM(String name,String brand,double price,int warranty,String url, int amount, int voltage) {
        super(name,brand,price,warranty,url);
        this.amount = amount;
        this.voltage = voltage;
    }



    public int getAmount() {
        return amount;
    }

    public int getVoltage() {
        return voltage;
    }
}
