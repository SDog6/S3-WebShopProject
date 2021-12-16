package project.Models.product_class;

import project.Models.product_class.parent_class.BasicProduct;

public class RAM extends BasicProduct {

    int amount;
    int voltage;

    public RAM(String name,String brand,double price,int warranty,String url, int count,int amount, int voltage) {
        super(name,brand,price,warranty,url,count);
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
