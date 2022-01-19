package project.serviceInterfaces;

import project.Models.product_class.*;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.List;

public interface IBasicProductService {

    public boolean AddBasicProduct(BasicProduct product);
    public BasicProduct GetSingleBasicProduct(String Name);
    List<BasicProduct> getAllProucts();
    List<CPU> getAllCPU();
    List<GPU> getAllGPU();
    List<CPUCooling> getAllGPUCooling();
    List<Motherboard> getAllMotherboards();
    List<Powersupply> getAllPowersupplies();
    List<RAM> getAllRAM();
    List<Storage> getAllStorage();



}
