package project.classes.product_class;

import project.classes.product_class.parent_class.ProductInfo;

public class Motherboard {

    private ProductInfo basicinfo;
    private String chipset;
    private boolean wifi;

    public Motherboard(ProductInfo basicinfo, String chipset, boolean wifi) {
        this.basicinfo = basicinfo;
        this.chipset = chipset;
        this.wifi = wifi;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public String getChipset() {
        return chipset;
    }

    public boolean isWifi() {
        return wifi;
    }

}
