package project.fakedatabase;

import project.Models.Order;
import project.Models.PInventory;
import project.Models.ProductCounter;
import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IOrderRepo;

import java.util.ArrayList;
import java.util.List;

public class FakeOrderData implements IOrderRepo {

    private List<Order> OrderList;

    public FakeOrderData() {
        OrderList =  new ArrayList<>();
    }

    @Override
    public List<Order> getOrdersByUsername(String username) {
         List<Order> OrderListTemp = new ArrayList<>();
        for (Order r:OrderList) {
            if (r.getUsername().equals(username)){
                OrderListTemp.add(r);
            }
        }
        return OrderListTemp;
    }

    @Override
    public boolean CreateOrder(Order r) {
        List<ProductCounter>ItemNrs = new ArrayList<>();

        for (BasicProduct product:r.getProducts()) {
            PInventory check =  new PInventory(product,10);

            if (check.getAmount() < product.getCount() && check.getAmount() >= 1){
                product.setCount(check.getAmount());
            }
            if (check.getAmount() >= product.getCount() && check.getAmount() >= 1 ){
                ItemNrs.add(new ProductCounter(product,product.getCount()));
            }
        }
        if (ItemNrs.size()>0){
            OrderList.add(r);
            return true;
        }
        return false;
    }

    @Override
    public List<Order> getAllOrders() {
        return OrderList;
    }
}
