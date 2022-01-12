package project.Models.product_class;

import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "powersupply")
@NoArgsConstructor
public class Powersupply extends BasicProduct {

    private int capacity;

    public Powersupply(String name,String brand,double price,int warranty,String url,int count ,int capacity) {
        super(name,brand,price,warranty,url,count);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
