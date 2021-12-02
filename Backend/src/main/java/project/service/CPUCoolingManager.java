//package project.service;
//import project.DTO.product_class.CPUCooling;
//import project.DTO.product_class.parent_class.BasicProduct;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CPUCoolingManager {
//
//    IProductData data;
//
//    public CPUCoolingManager(IProductData data){
//        this.data = data;
//    }
//
//    public boolean AddProduct(CPUCooling product){
//        if(product!=null){
//            data.AddProduct(product);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean RemoveProduct(CPUCooling product){
//        if (product!=null){
//            data.RemoveProduct(product);
//            return true;
//        }
//        return false;
//    }
//
//    public List<CPUCooling> GetAllCPUCoolings(){
//        List<CPUCooling> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            temp.add((CPUCooling)a);
//        }
//        return temp;
//    }
//
//    public List<CPUCooling> GetAllCPUCoolingsByName(String name){
//        List<CPUCooling> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getName().equals(name)){
//                temp.add((CPUCooling)a);
//            }
//        }
//        return temp;
//    }
//
//
//    public List<CPUCooling> GetAllCPUCoolingsByBrand(String brand){
//        List<CPUCooling> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getBrand().equals(brand)){
//                temp.add((CPUCooling)a);
//            }
//        }
//        return temp;
//    }
//
//
//    public CPUCooling GetSingleCPUCoolingByName(String name){
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getName().equals(name)){
//                return (CPUCooling)a;
//            }
//        }
//        return null;
//    }
//
//}
