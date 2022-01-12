package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Models.product_class.CPU;
import project.Models.product_class.GPU;
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
    public boolean AddCPU(CPU product) {
        data.AddCPU(product);
        return true;
    }

    @Override
    public boolean RemoveCPU(CPU product) {
        data.RemoveCPU(product);
        return true;
    }

    @Override
    public CPU GetSingleCPU(String Name) {
        return null;
    }

    @Override
    public boolean AddGPU(GPU product) {
        return data.AddGPU(product);
    }

    @Override
    public boolean RemoveGPU(GPU product) {
        return false;
    }

    @Override
    public GPU GetSingleGPU(String Name) {
        return data.GetSingleGPU(Name);
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
}
