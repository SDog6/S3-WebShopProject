package project.logic;

import project.classes.product_class.CPUCooling;
import project.classes.product_class.GPU;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class GPUManager {

    IProductData data;

    public GPUManager(IProductData data){
        this.data = data;
    }

    public boolean AddProduct(GPU product){
        if(product!=null){
            data.AddProduct(product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(GPU product){
        if (product!=null){
            data.RemoveProduct(product);
            return true;
        }
        return false;
    }

    public List<GPU> GetAllGPUs(){
        List<GPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            temp.add((GPU)a);
        }
        return temp;
    }

    public List<GPU> GetAllGPUsByName(String name){
        List<GPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                temp.add((GPU)a);
            }
        }
        return temp;
    }


    public List<GPU> GetAllGPUsByBrand(String brand){
        List<GPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getBrand().equals(brand)){
                temp.add((GPU)a);
            }
        }
        return temp;
    }


    public GPU GetSingleGPUByName(String name){
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                return (GPU)a;
            }
        }
        return null;
    }

}
