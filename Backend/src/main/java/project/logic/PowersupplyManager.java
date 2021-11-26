package project.logic;

import project.DTO.product_class.Powersupply;
import project.DTO.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class PowersupplyManager {

    IProductData data;

    public PowersupplyManager(IProductData data){
        this.data = data;
    }

    public boolean AddProduct(Powersupply product){
        if(product!=null){
            data.AddProduct(product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(Powersupply product){
        if (product!=null){
            data.RemoveProduct(product);
            return true;
        }
        return false;
    }

    public List<Powersupply> GetAllPowersupplys(){
        List<Powersupply> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            temp.add((Powersupply)a);
        }
        return temp;
    }

    public List<Powersupply> GetAllPowersupplysByName(String name){
        List<Powersupply> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                temp.add((Powersupply)a);
            }
        }
        return temp;
    }


    public List<Powersupply> GetAllPowersupplysByBrand(String brand){
        List<Powersupply> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getBrand().equals(brand)){
                temp.add((Powersupply)a);
            }
        }
        return temp;
    }


    public Powersupply GetSinglePowersupplyByName(String name){
        for (BasicProduct a: data.GetAllProducts()) {
            if(a.getName().equals(name)){
                return (Powersupply)a;
            }
        }
        return null;
    }

}
