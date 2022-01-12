package project.Models.product_class;

import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "motherboard")
@NoArgsConstructor
public class Motherboard extends BasicProduct {

    private String chipset;
    private boolean wifi;

    public Motherboard(String name,String brand,double price,int warranty,String url,int count  ,String chipset, boolean wifi) {
        super(name,brand,price,warranty,url,count);
        this.chipset = chipset;
        this.wifi = wifi;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
