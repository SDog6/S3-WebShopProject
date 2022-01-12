package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.DBAccessInterfaces.productAccess.IBasicProduct;
import project.DBAccessInterfaces.productAccess.ICPU;
import project.Models.product_class.CPU;
import project.Models.product_class.GPU;
import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IBasicProductRepo;

import java.util.List;

@Repository
public class BasicProductRepo implements IBasicProductRepo {

    @Autowired
    IBasicProduct basicrepo;

    @Override
    public boolean AddCPU(CPU product) {
        basicrepo.save(product);
        return true;
    }

    @Override
    public boolean RemoveCPU(CPU product) {
        basicrepo.delete(product);
        return true;
    }

    @Override
    public CPU GetSingleCPU(String Name) {
       CPU temp = (CPU)basicrepo.getBasicProductByName(Name);
       return temp;
    }


    @Override
    public boolean AddGPU(GPU product) {
        basicrepo.save(product);
        return true;
    }

    @Override
    public boolean RemoveGPU(GPU product) {
        basicrepo.delete(product);
        return true;
    }

    @Override
    public GPU GetSingleGPU(String Name) {
        return null;
    }

    @Override
    public List<BasicProduct> getAll() {
        return basicrepo.findAll();
    }


}
