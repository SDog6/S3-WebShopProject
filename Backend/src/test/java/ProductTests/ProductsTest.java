package ProductTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import project.Models.product_class.*;
import project.Models.product_class.parent_class.BasicProduct;
import project.fakedatabase.FakeProductData;
import project.service.BasicProductService;

@ContextConfiguration
public class ProductsTest {


    @Test
    public void AddTest()
    {
        FakeProductData fake = new FakeProductData();
        BasicProductService manager = new BasicProductService(fake);

        manager.AddBasicProduct(new CPU("test", "test", 289, 2, "s",3,3.7, 65, "AM4", 8, 12));

        BasicProduct test = fake.getBasicProductByName("test");

        Assertions.assertEquals(test.getBrand(),"test");

        Assertions.assertEquals(((CPU) test).getCores(),8);

    }

    @Test
    public void GettingTest()
    {
        FakeProductData fake = new FakeProductData();
        BasicProductService manager = new BasicProductService(fake);

        manager.AddBasicProduct(new CPU("test", "test", 289, 2, "s",3,3.7, 65, "AM4", 8, 12));
        manager.AddBasicProduct(new GPU("test", "test", 289, 2, "test",2,3,3,3,3,3,3,3,3));
        manager.AddBasicProduct(new CPUCooling("cooler","brand",43,43,"url",3 ,3));
        manager.AddBasicProduct(new Motherboard("cooler","brand",43,43,"url",3 ,"daasd",false));
        manager.AddBasicProduct(new Storage("cooler","brand",43,43,"url",3 ,"s",3,3));
        manager.AddBasicProduct(new RAM("cooler","brand",43,43,"url",3 ,3,3));
        manager.AddBasicProduct(new Powersupply("cooler","brand",43,43,"url",3 ,3));

        Assertions.assertEquals(manager.getAllCPU().size(),1);
        Assertions.assertEquals(manager.getAllGPU().size(),1);
        Assertions.assertEquals(manager.getAllGPUCooling().size(),1);
        Assertions.assertEquals(manager.getAllMotherboards().size(),1);
        Assertions.assertEquals(manager.getAllStorage().size(),1);
        Assertions.assertEquals(manager.getAllRAM().size(),1);
        Assertions.assertEquals(manager.getAllPowersupplies().size(),1);



    }


}
