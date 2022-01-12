package project.repositoryInterfaces;

import project.Models.product_class.CPU;
import project.Models.product_class.GPU;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.List;

public interface IBasicProductRepo {

    public boolean AddCPU(CPU product);
    public boolean RemoveCPU(CPU product);

    public CPU GetSingleCPU(String Name);
    public boolean AddGPU(GPU product);
    public boolean RemoveGPU(GPU product);

    public GPU GetSingleGPU(String Name);

    List<BasicProduct> getAll();

}
