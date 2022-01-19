package OrderTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import project.Models.Order;
import project.Models.product_class.CPUCooling;
import project.Models.product_class.parent_class.BasicProduct;
import project.fakedatabase.FakeOrderData;
import project.service.OrderService;

import java.util.ArrayList;
import java.util.List;

@ContextConfiguration
public class OrderCreationTest {
    @Test
    public void AddTest()
    {
        FakeOrderData fake = new FakeOrderData();
        OrderService manager = new OrderService(fake);

        List<BasicProduct> products = new ArrayList<>();
        products.add(new CPUCooling("cooler","brand",43,43,"url",3 ,3));
        products.add(new CPUCooling("asd","asd",33,43,"dasd",12 ,3));

        List<BasicProduct> products2 = new ArrayList<>();
        products.add(new CPUCooling("asd","asd",33,43,"dasd",12 ,3));

        manager.CreateOrder(new Order(143L,products,"testUser",40,"test"));
        manager.CreateOrder(new Order(1433L,products2,"testUser",400,"test"));


        Assertions.assertEquals(manager.getAllOrders().size(),1);


    }
}
