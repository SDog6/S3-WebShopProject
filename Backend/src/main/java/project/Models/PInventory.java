package project.Models;


import lombok.NoArgsConstructor;
import project.Models.product_class.parent_class.BasicProduct;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
@NoArgsConstructor
public class PInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "basic_id", nullable = false)
    private BasicProduct product;
    @Column(name = "amount")
    private int amount;


    public PInventory(BasicProduct product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    public PInventory(Long id, BasicProduct product, int amount) {
        this.id = id;
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
