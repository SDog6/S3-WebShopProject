package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;

public class Storage extends BasicProduct {

    private String type;
    private int amount;
    private int writespeed;

    public Storage(String name,String brand,double price,int warranty,String url, String type, int amount, int writespeed) {
        super(name,brand,price,warranty,url);
        this.type = type;
        this.amount = amount;
        this.writespeed = writespeed;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public int getWritespeed() {
        return writespeed;
    }
}
