package project.fakedatabase;

import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IBasicProductRepo;

import java.util.ArrayList;
import java.util.List;

public class FakeProductData implements IBasicProductRepo {

    private List<BasicProduct> BasicProductList;

    public FakeProductData() {
        BasicProductList =  new ArrayList<>();
    }


    @Override
    public BasicProduct getBasicProductByName(String name) {
        for (BasicProduct p: BasicProductList) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean AddBasicProduct(BasicProduct product) {
        if (product != null){
            BasicProductList.add(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveBasicProduct(BasicProduct product) {
        if (product != null){
            BasicProductList.remove(product);
            return true;
        }
        return false;    }

    @Override
    public List<BasicProduct> getAll() {
        return BasicProductList;
    }
}
