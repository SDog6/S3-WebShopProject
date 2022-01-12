package project.Models.product_class;

import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Storage")
@NoArgsConstructor
public class Storage extends BasicProduct {

    private String type;
    private int amount;
    private int writespeed;

    public Storage(String name,String brand,double price,int warranty,String url,int count, String type, int amount, int writespeed) {
        super(name,brand,price,warranty,url,count);
        this.type = type;
        this.amount = amount;
        this.writespeed = writespeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWritespeed() {
        return writespeed;
    }

    public void setWritespeed(int writespeed) {
        this.writespeed = writespeed;
    }
}
