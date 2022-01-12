package project.repositoryInterfaces;

import project.Models.product_class.parent_class.BasicProduct;

import java.util.List;

public interface IBasicProductRepo {
    public BasicProduct getBasicProductByName(String name);

    public boolean AddBasicProduct(BasicProduct product);

    public boolean RemoveBasicProduct(BasicProduct product);

    List<BasicProduct> getAll();

}
