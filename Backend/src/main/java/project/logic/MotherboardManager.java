package project.logic;

import project.DTO.product_class.Motherboard;
import project.DTO.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class MotherboardManager {

    IProductData data;

    public MotherboardManager(IProductData data){
        this.data = data;
    }

    public boolean AddProduct(Motherboard product){
        if(product!=null){
            data.AddProduct(product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(Motherboard product){
        if (product!=null){
            data.RemoveProduct(product);
            return true;
        }
        return false;
    }

    public List<Motherboard> GetAllMotherboards(){
        List<Motherboard> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            temp.add((Motherboard)a);
        }
        return temp;
    }

    public List<Motherboard> GetAllMotherboardsByName(String name){
        List<Motherboard> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                temp.add((Motherboard)a);
            }
        }
        return temp;
    }


    public List<Motherboard> GetAllMotherboardsByBrand(String brand){
        List<Motherboard> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getBrand().equals(brand)){
                temp.add((Motherboard)a);
            }
        }
        return temp;
    }


    public Motherboard GetSingleMotherboardCoolingByName(String name){
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                return (Motherboard)a;
            }
        }
        return null;
    }

}
