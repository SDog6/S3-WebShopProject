//package ProductTests;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.context.ContextConfiguration;
//import project.Models.product_class.CPU;
//import project.fakedatabase.FakeCPUData;
//
//@ContextConfiguration
//public class CPUTest {
//
//
//    @Test
//    public void AddTest()
//    {
//        FakeCPUData fake = new FakeCPUData();
//        CPUManager manager = new CPUManager(fake);
//
//        manager.AddCPU(new CPU("test", "test", 289, 2, "s",3,3.7, 65, "AM4", 8, 12));
//
//        CPU test = fake.GetCPUByName("test");
//
//        Assertions.assertEquals(test.getBrand(),"test");
//
//    }
//
//    @Test
//    public void RemoveTest()
//    {
//        FakeCPUData fake = new FakeCPUData();
//        CPUManager manager = new CPUManager(fake);
//
//        CPU test1 = new CPU("test", "test", 289, 2, "s",3,3.7, 65, "AM4", 8, 12);
//
//        manager.AddCPU(test1);
//
//        manager.RemoveCPU(test1);
//
//        CPU test = manager.GetCPUByName("test");
//
//        Assertions.assertEquals(test,null);
//
//    }
//
//}
