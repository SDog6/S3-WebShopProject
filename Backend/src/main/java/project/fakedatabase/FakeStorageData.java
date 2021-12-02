package project.fakedatabase;

import project.DTO.product_class.Storage;
import project.DTO.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

public class FakeStorageData{

    private final List<Storage> StorageList;

    public FakeStorageData() {
        StorageList = new ArrayList<>();

        Storage S = new Storage("Samsung 870 EVO - 2.5 Internal SSD - 500GB","Samsung",70,5,"s","SSD",500,560);

        StorageList.add(S);

    }

    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            StorageList.add((Storage)Product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            StorageList.remove((Storage)Product);
            return true;
        }
        return false;
    }

    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Storage storage:this.StorageList) {
            temp.add(storage);
        }
        return temp;
    }

    public BasicProduct GetProductByName(String name) {
        for (Storage storage: StorageList) {
            if (storage.getName().equals(name)) {
                return storage;
            }
        }
        return null;
    }
}
