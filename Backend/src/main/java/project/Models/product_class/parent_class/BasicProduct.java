package project.Models.product_class.parent_class;

import javax.persistence.*;

@Entity
@Table(name = "basic")
@Inheritance(strategy=InheritanceType.JOINED)
public class BasicProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "ConfirmationCodeGenerator")
    @TableGenerator(table = "SEQUENCES", name = "ConfirmationCodeGenerator")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "price")
    private double price;
    @Column(name = "warranty")
    private int warranty;
    @Column(name = "img")
    private String url;
    @Column(name = "count")
    private int count;

    public BasicProduct(){}

    public BasicProduct(String name,String brand,double price,int warranty,String url,int count)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
        this.url = url;
        this.count = count;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
