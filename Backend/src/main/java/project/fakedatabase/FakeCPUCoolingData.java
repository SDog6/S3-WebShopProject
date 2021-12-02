package project.fakedatabase;

import project.DTO.product_class.CPUCooling;
import project.DTO.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

public class FakeCPUCoolingData {

    private final List<CPUCooling> CPUCList;

    public FakeCPUCoolingData() {
        CPUCList = new ArrayList<>();

        CPUCooling Cooler = new CPUCooling("CoolerMaster Hyper 212 Black Edition","Cooler Master",43.99,2,"s",12);

        CPUCList.add(Cooler);

    }

    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            CPUCList.add((CPUCooling)Product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            CPUCList.remove((CPUCooling)Product);
            return true;
        }
        return false;
    }

    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (CPUCooling cpuc:this.CPUCList) {
            temp.add(cpuc);
        }
        return temp;
    }

    public BasicProduct GetProductByName(String name) {
        for (CPUCooling cpuc: CPUCList) {
            if (cpuc.getName().equals(name)) {
                return cpuc;
            }
        }
        return null;
    }
}
