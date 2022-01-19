package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.DBAccessInterfaces.IInventoryRepo;
import project.DBAccessInterfaces.IOrder;
import project.Models.Order;
import project.Models.PInventory;
import project.Models.ProductCounter;
import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IOrderRepo;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepo implements IOrderRepo {

    @Autowired
    IOrder repo;

    @Autowired
    IInventoryRepo inventory;

    @Override
    public List<Order> getOrdersByUsername(String username) {
        return repo.getOrdersByUsername(username);
    }

    @Override
    public boolean CreateOrder(Order r) {
        List<ProductCounter>ItemNrs = new ArrayList<>();

        for (BasicProduct product:r.getProducts()) {
            PInventory check =  inventory.getByProduct_Id(product.getId());

            if (check.getAmount() < product.getCount() && check.getAmount() >= 1){
                product.setCount(check.getAmount());
            }
            if (check.getAmount() >= product.getCount() && check.getAmount() >= 1 ){
                int newamount = check.getAmount() - product.getCount();
                check.setAmount(newamount);
                inventory.save(check);
                ItemNrs.add(new ProductCounter(product,product.getCount()));
            }
        }
        if (ItemNrs.size()>0){
            repo.save(new Order(ItemNrs,r.getUsername(),r.getPrice(),r.getAddress()));
            return true;
        }
        return false;
    }

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}
