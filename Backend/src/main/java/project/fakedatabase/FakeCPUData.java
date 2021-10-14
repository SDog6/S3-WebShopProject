package project.fakedatabase;

import project.classes.product_class.CPU;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeCPUData implements IProductData {
    private final List<CPU> CPUList = new ArrayList<>();

    @Override
    public void AddProduct(Object a) {

    }

    @Override
    public void RemoveProduct(Object a) {

    }

    @Override
    public List<Object> GetAllProductsProduct() {
        return null;
    }

    @Override
    public Object GetProductByName() {
        return null;
    }
}
