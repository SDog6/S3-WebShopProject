package project.logic;

import project.classes.product_class.CPUCooling;
import project.classes.product_class.Storage;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class StorageManager {

    IProductData data;

    public StorageManager(IProductData data){
        this.data = data;
    }

    public boolean AddProduct(Storage product){
        if(product!=null){
            data.AddProduct(product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(Storage product){
        if (product!=null){
            data.RemoveProduct(product);
            return true;
        }
        return false;
    }

    public List<Storage> GetAllStorages(){
        List<Storage> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            temp.add((Storage)a);
        }
        return temp;
    }

    public List<Storage> GetAllStoragesByName(String name){
        List<Storage> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                temp.add((Storage)a);
            }
        }
        return temp;
    }


    public List<Storage> GetAllStoragesByBrand(String brand){
        List<Storage> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getBrand().equals(brand)){
                temp.add((Storage)a);
            }
        }
        return temp;
    }


    public Storage GetSingleStorageByName(String name){
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                return (Storage)a;
            }
        }
        return null;
    }

}
