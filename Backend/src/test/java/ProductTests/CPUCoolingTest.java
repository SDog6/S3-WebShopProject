package ProductTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import project.DTO.product_class.CPUCooling;
import project.fakedatabase.FakeCPUCoolingData;
import project.service.CPUCoolingManager;

@ContextConfiguration
public class CPUCoolingTest {


    @Test
    public void AddTest()
    {
        FakeCPUCoolingData fake = new FakeCPUCoolingData();
        CPUCoolingManager manager = new CPUCoolingManager(fake);

        CPUCooling test1 = new CPUCooling("test","test",43.99,2,"s",12);

        manager.AddProduct(test1);

        CPUCooling test = manager.GetSingleCPUCoolingByName("test");

        Assertions.assertEquals(test.getBrand(),"test");

    }

    @Test
    public void RemoveTest()
    {

        FakeCPUCoolingData fake = new FakeCPUCoolingData();
        CPUCoolingManager manager = new CPUCoolingManager(fake);

        CPUCooling test1 = new CPUCooling("test","test",43.99,2,"s",12);

        manager.AddProduct(test1);

        manager.RemoveProduct(test1);

        CPUCooling test = manager.GetSingleCPUCoolingByName("test");

        Assertions.assertEquals(test,null);

    }

}
