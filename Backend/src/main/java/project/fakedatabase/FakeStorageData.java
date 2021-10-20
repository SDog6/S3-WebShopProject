package project.fakedatabase;

import project.classes.product_class.Storage;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeStorageData implements IProductData {

    private final List<Storage> StorageList;

    public FakeStorageData() {
        StorageList = new ArrayList<>();

        Storage S = new Storage("Samsung 870 EVO - 2.5 Internal SSD - 500GB","Samsung",70,5,"SSD",500,560);

        StorageList.add(S);

    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            StorageList.add((Storage)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            StorageList.remove((Storage)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Storage storage:this.StorageList) {
            temp.add(storage);
        }
        return temp;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (Storage storage: StorageList) {
            if (storage.getName().equals(name)) {
                return storage;
            }
        }
        return null;
    }
}
