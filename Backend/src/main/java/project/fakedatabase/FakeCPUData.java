package project.fakedatabase;

import project.classes.product_class.CPU;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeCPUData implements IProductData {

    private final List<CPU> CPUList;

    public FakeCPUData() {
        CPUList =  new ArrayList<>();

        CPU Ryzen5600 = new CPU("AMD Ryzen 5 5600X", "AMD", 289, 2, 3.7, 65, "AM4", 8, 12);
        CPU Intel5 = new CPU("Intel Core i5-10600KF", "Intel", 300, 3, 4.1, 125, "Socket 1200", 6, 12);

        CPUList.add(Ryzen5600);
        CPUList.add(Intel5);
    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            CPUList.add((CPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            CPUList.remove((CPU)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (CPU cpu:this.CPUList) {
            temp.add(cpu);
        }
        return temp;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (CPU cpu: CPUList) {
            if (cpu.getName().equals(name)) {
                return cpu;
            }
        }
        return null;
    }
}
