package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;

public class Motherboard extends BasicProduct {

    private String chipset;
    private boolean wifi;

    public Motherboard(String name,String brand,double price,int warranty,String url, String chipset, boolean wifi) {
        super(name,brand,price,warranty,url);
        this.chipset = chipset;
        this.wifi = wifi;
    }



    public String getChipset() {
        return chipset;
    }

    public boolean isWifi() {
        return wifi;
    }

}
