package project.Models;

import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.*;


@Entity
@Table(name = "ProductNr")
@NoArgsConstructor
public class ProductCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @Column(name = "product")
    BasicProduct product;
    @Column(name = "amount")
    private int amount;

    public ProductCounter(BasicProduct product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BasicProduct getProduct() {
        return product;
    }

    public void setProduct(BasicProduct product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
