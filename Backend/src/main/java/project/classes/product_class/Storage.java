package project.classes.product_class;

import project.classes.product_class.parent_class.ProductInfo;

public class Storage {

    private ProductInfo basicinfo;
    private String type;
    private int amount;
    private int writespeed;

    public Storage(ProductInfo basicinfo, String type, int amount, int writespeed) {
        this.basicinfo = basicinfo;
        this.type = type;
        this.amount = amount;
        this.writespeed = writespeed;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
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
