package project.Models;


import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Transient
    private List<BasicProduct> products;
    @Column(name = "username")
    private String username;
    @Column(name = "price")
    private int price;
    @Column(name = "address")
    private String address;


    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "productnr_id", nullable = false)
    private List<ProductCounter> productsnr;

    public Order(List<ProductCounter> productsnr, String username, int price,String address) {
        this.productsnr = productsnr;
        this.username = username;
        this.price = price;
        this.address = address;
    }

    public Order(Long id, List<BasicProduct> products, String username, int price,String address) {
        this.id = id;
        this.products = products;
        this.username = username;
        this.price = price;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BasicProduct> getProducts() {
        return products;
    }

    public void setProducts(List<BasicProduct> products) {
        this.products = products;
    }

    public List<ProductCounter> getProductsnr() {
        return productsnr;
    }

    public void setProductsnr(List<ProductCounter> productsnr) {
        this.productsnr = productsnr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
