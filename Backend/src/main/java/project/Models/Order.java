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
    @ManyToMany
    @JoinColumn(name = "basic_id", nullable = false)
    private List<BasicProduct> products;
    @Column(name = "username")
    private String username;
    @Column(name = "price")
    private int price;

    public Order(List<BasicProduct> products, String username, int price) {
        this.products = products;
        this.username = username;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
