package project.logic;

import project.classes.product_class.CPU;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class CPUManager {

    IProductData data;

    public CPUManager(IProductData data){
        this.data = data;
    }

    public boolean AddProduct(CPU cpu){
        if(cpu!=null){
            data.AddProduct(cpu);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(CPU cpu){
        if (cpu!=null){
            data.RemoveProduct(cpu);
            return true;
        }
        return false;
    }

    public List<CPU> GetAllCPUs(){

        List<CPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            temp.add((CPU)a);
        }
        return temp;
    }

    public List<CPU> GetAllCPUsByName(String name){
        List<CPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                temp.add((CPU)a);
            }
        }
        return temp;
    }


    public List<CPU> GetAllCPUsByBrand(String brand){
        List<CPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getBrand().equals(brand)){
                temp.add((CPU)a);
            }
        }
        return temp;
    }


    public CPU GetSingleCPUByName(String name){
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                return (CPU)a;
            }
        }
        return null;
    }

}
