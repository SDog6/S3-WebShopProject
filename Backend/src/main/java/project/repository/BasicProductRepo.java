package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.DBAccessInterfaces.IBasicProduct;
import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IBasicProductRepo;

import java.util.List;

@Repository
public class BasicProductRepo implements IBasicProductRepo {

    @Autowired
    IBasicProduct basicrepo;

    @Override
    public BasicProduct getBasicProductByName(String name) {
        return basicrepo.getBasicProductByName(name);
    }

    @Override
    public boolean AddBasicProduct(BasicProduct product) {
        basicrepo.save(product);
        return true;    }

    @Override
    public boolean RemoveBasicProduct(BasicProduct product) {
        basicrepo.delete(product);
        return true;
    }


    @Override
    public List<BasicProduct> getAll() {
        return basicrepo.findAll();
    }


}
