package project.repositoryInterfaces;

import project.Models.product_class.GPU;

import java.util.List;

public interface IGPUData {
    public boolean AddGPU(GPU product);
    public boolean RemoveGPU(GPU product);
    public List<GPU> GetAllGPUs();
    public GPU GetGPUByName(String name);
}
