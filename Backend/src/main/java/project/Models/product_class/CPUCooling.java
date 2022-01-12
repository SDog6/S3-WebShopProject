package project.Models.product_class;

import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "cpucooling")
@NoArgsConstructor
public class CPUCooling extends BasicProduct {

    private int voltage;

    public CPUCooling(String name,String brand,double price,int warranty,String url,int count ,int voltage) {
        super(name,brand,price,warranty,url,count);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}