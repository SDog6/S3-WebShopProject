package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.DTO.product_class.CPU;
import project.repositoryInterfaces.ICPUData;
import project.serviceInterfaces.ICPUService;

import java.util.List;

@Service
public class CPUManager implements ICPUService {

    ICPUData data;

    @Autowired
    public CPUManager(ICPUData data){
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
    public List<CPU> GetAllCPUs() {
        return data.GetAllCPUs();
    }

    @Override
    public CPU GetCPUByName(String name) {
        return data.GetCPUByName(name);
    }
}
