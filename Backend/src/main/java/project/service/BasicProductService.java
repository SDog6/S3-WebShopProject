package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Models.product_class.*;
import project.Models.product_class.parent_class.BasicProduct;
import project.repositoryInterfaces.IBasicProductRepo;
import project.serviceInterfaces.IBasicProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicProductService implements IBasicProductService {

    IBasicProductRepo data;

    @Autowired
    public BasicProductService(IBasicProductRepo data){
        this.data = data;
    }


    @Override
    public boolean AddBasicProduct(BasicProduct product) {
        data.AddBasicProduct(product);
        return true;
    }

    @Override
    public boolean RemoveBasicProduct(CPU product) {
        return false;
    }

    @Override
    public BasicProduct GetSingleBasicProduct(String Name) {
        return data.getBasicProductByName(Name);
    }

    @Override
    public List<BasicProduct> getAllProucts() {
        return data.getAll();
    }

    @Override
    public List<CPU> getAllCPU() {
        List<CPU> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof CPU){
                temp.add((CPU)p);
            }
        }
        return temp;
    }

    @Override
    public List<GPU> getAllGPU() {
        List<GPU> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof GPU){
                temp.add((GPU)p);
            }
        }
        return temp;    }

    @Override
    public List<CPUCooling> getAllGPUCooling() {
        List<CPUCooling> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof CPUCooling){
                temp.add((CPUCooling)p);
            }
        }
        return temp;    }

    @Override
    public List<Motherboard> getAllMotherboards() {
        List<Motherboard> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof Motherboard){
                temp.add((Motherboard)p);
            }
        }
        return temp;    }

    @Override
    public List<Powersupply> getAllPowersupplies() {
        List<Powersupply> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof Powersupply){
                temp.add((Powersupply)p);
            }
        }
        return temp;    }

    @Override
    public List<RAM> getAllRAM() {
        List<RAM> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof RAM){
                temp.add((RAM)p);
            }
        }
        return temp;    }

    @Override
    public List<Storage> getAllStorage() {
        List<Storage> temp = new ArrayList<>();
        for (BasicProduct p:data.getAll()) {
            if (p instanceof Storage){
                temp.add((Storage)p);
            }
        }
        return temp;    }
}
