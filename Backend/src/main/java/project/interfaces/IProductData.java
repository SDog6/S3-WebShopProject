package project.interfaces;

import project.DTO.product_class.parent_class.BasicProduct;

import java.util.List;

public interface IProductData {

    public boolean AddProduct(BasicProduct product);
    public boolean RemoveProduct(BasicProduct product);
    public List<BasicProduct> GetAllProducts();
    public BasicProduct GetProductByName(String name);

}
