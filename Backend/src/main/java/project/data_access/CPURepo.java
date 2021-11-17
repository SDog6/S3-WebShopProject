package project.data_access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.classes.product_class.CPU;
import project.interfaces.ICPUData;
import project.interfaces.ICPURepo;

import java.util.List;

@Repository
public class CPURepo implements ICPUData {

        @Autowired
        ICPURepo repo;

    @Override
    public boolean AddCPU(CPU product) {
        repo.save(product);
        return true;
    }

    @Override
    public boolean RemoveCPU(CPU product) {
        repo.delete(product);
        return true;
    }

    @Override
    public List<CPU> GetAllCPUs() {
        return repo.findAll();
    }

    @Override
    public CPU GetCPUByName(String name) {
        return repo.GetCPUByName(name);
    }
}


