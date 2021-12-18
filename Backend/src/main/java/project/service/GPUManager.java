package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.Models.product_class.GPU;
import project.repositoryInterfaces.IGPUData;
import project.serviceInterfaces.IGPUService;

import java.util.List;

@Service
public class GPUManager implements IGPUService {

    IGPUData data;

    @Autowired
    public GPUManager(IGPUData data){
        this.data = data;
    }


    @Override
    public boolean AddGPU(GPU product) {
        data.AddGPU(product);
        return true;
    }

    @Override
    public boolean RemoveGPU(GPU product) {
        data.RemoveGPU(product);
        return true;
    }

    @Override
    public List<GPU> GetAllGPUs() {
        return data.GetAllGPUs();
    }

    @Override
    public GPU GetGPUByName(String name) {
        return data.GetGPUByName(name);
    }
}
