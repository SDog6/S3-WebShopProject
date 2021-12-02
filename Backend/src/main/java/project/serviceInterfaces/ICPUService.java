package project.serviceInterfaces;

import project.DTO.product_class.CPU;

import java.util.List;

public interface ICPUService {
    public boolean AddCPU(CPU product);
    public boolean RemoveCPU(CPU product);
    public List<CPU> GetAllCPUs();
    public CPU GetCPUByName(String name);
}
