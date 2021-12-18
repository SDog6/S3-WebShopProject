package project.serviceInterfaces;

import project.Models.product_class.GPU;

import java.util.List;

public interface IGPUService {
    public boolean AddGPU(GPU product);
    public boolean RemoveGPU(GPU product);
    public List<GPU> GetAllGPUs();
    public GPU GetGPUByName(String name);
}
