package project.fakedatabase;

import project.Models.product_class.GPU;
import project.repositoryInterfaces.IGPUData;

import java.util.ArrayList;
import java.util.List;

public class FakeGPUData implements IGPUData {

    private final List<GPU> GPUList;

    public FakeGPUData() {
        GPUList = new ArrayList<>();

        GPU RTX3070 = new GPU("NVIDIA GeForce RTX 3070 Ti","NVIDIA",699,2,"s",0,1800,8,316,121,56,1,3,3);

        GPUList.add(RTX3070);

    }

    @Override
    public boolean AddGPU(GPU product) {
        if(product != null){
            GPUList.add(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveGPU(GPU product) {
        if(product != null){
            GPUList.remove(product);
            return true;
        }
        return false;
    }

    @Override
    public List<GPU> GetAllGPUs() {
        return GPUList;
    }

    @Override
    public GPU GetGPUByName(String name) {
        for (GPU gpu: GPUList) {
            if (gpu.getName().equals(name)) {
                return gpu;
            }
        }
        return null;
    }

}
