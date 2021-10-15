package project.fakedatabase;

import project.classes.product_class.GPU;
import project.classes.product_class.GPU;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeGPUData implements IProductData {

    private final List<GPU> GPUList;

    public FakeGPUData() {
        GPUList = new ArrayList<>();

        GPU RTX3070 = new GPU("NVIDIA GeForce RTX 3070 Ti","NVIDIA",699,2,1800,8,316,121,56,1,3,3);

        GPUList.add(RTX3070);

    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            GPUList.add((GPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            GPUList.remove((GPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (GPU cpu:this.GPUList) {
            temp.add(cpu);
        }
        return null;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (GPU gpu: GPUList) {
            if (gpu.getName().equals(name)) {
                return gpu;
            }
        }
        return null;
    }
}
