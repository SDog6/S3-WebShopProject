//package project.service;
//
//import project.DTO.product_class.RAM;
//import project.DTO.product_class.parent_class.BasicProduct;
//import project.serviceInterfaces.IProductData;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RAMManager {
//
//    IProductData data;
//
//    public RAMManager(IProductData data){
//        this.data = data;
//    }
//
//    public boolean AddProduct(RAM product){
//        if(product!=null){
//            data.AddProduct(product);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean RemoveProduct(RAM product){
//        if (product!=null){
//            data.RemoveProduct(product);
//            return true;
//        }
//        return false;
//    }
//
//    public List<RAM> GetAllRAMs(){
//        List<RAM> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            temp.add((RAM)a);
//        }
//        return temp;
//    }
//
//    public List<RAM> GetAllRAMsByName(String name){
//        List<RAM> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getName().equals(name)){
//                temp.add((RAM)a);
//            }
//        }
//        return temp;
//    }
//
//
//    public List<RAM> GetAllRAMsByBrand(String brand){
//        List<RAM> temp = new ArrayList<>();
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getBrand().equals(brand)){
//                temp.add((RAM)a);
//            }
//        }
//        return temp;
//    }
//
//
//    public RAM GetSingleRAMByName(String name){
//        for (BasicProduct a: data.GetAllProducts()) {
//            if(a.getName().equals(name)){
//                return (RAM)a;
//            }
//        }
//        return null;
//    }
//
//}
