package project.logic;

import project.classes.product_class.CPU;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.ICPUData;

import java.util.ArrayList;
import java.util.List;

public class CPUManager {

    ICPUData data;

    public CPUManager(ICPUData data){
        this.data = data;
    }

    public boolean AddProduct(CPU cpu){
        if(cpu!=null){
            data.AddCPU(cpu);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(CPU cpu){
        if (cpu!=null){
            data.RemoveCPU(cpu);
            return true;
        }
        return false;
    }

    public List<CPU> GetAllCPUs(){

        List<CPU> temp = new ArrayList<>();
        for (BasicProduct a: data.GetAllCPUs()) {
            temp.add((CPU)a);
        }
        return temp;
    }
//
//    public List<CPU> GetAllCPUsByName(String name){
//        return data.GetCPUByName(name);
//    }


//    public List<CPU> GetAllCPUsByBrand(String brand){
//        List<CPU> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getBrand().equals(brand)){
//                temp.add((CPU)a);
//            }
//        }
//        return temp;
//    }


    public CPU GetSingleCPUByName(String name){
        return data.GetCPUByName(name);
    }

}
