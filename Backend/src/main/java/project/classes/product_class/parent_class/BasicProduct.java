package project.classes.product_class.parent_class;

import javax.persistence.*;

@MappedSuperclass
public abstract class BasicProduct {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "price")
    private double price;
    @Column(name = "warranty")
    private int warranty;

    public BasicProduct(){}

    public BasicProduct(String name,String brand,double price,int warranty)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString()
    {
        return " Name:" + this.name +
                " Brand:" + this.brand +
                " Price" + this.price +
                " Warranty" + this.warranty;
    }


}
