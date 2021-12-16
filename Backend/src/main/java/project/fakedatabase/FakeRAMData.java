package project.fakedatabase;

import project.Models.product_class.RAM;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

public class FakeRAMData  {

    private final List<RAM> RAMList;

    public FakeRAMData() {

        RAMList = new ArrayList<>();


        RAM Corsair = new RAM("Corsair 32GB, DDR4, 3200MHz 32GB DDR4 3200MHz Memory Module","Corsair",749,999,"s",0,32,3200);

        RAMList.add(Corsair);
    }

    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            RAMList.add((RAM)Product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            RAMList.remove((RAM)Product);
            return true;
        }
        return false;
    }

    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (RAM ram:this.RAMList) {
            temp.add(ram);
        }
        return temp;
    }

    public BasicProduct GetProductByName(String name) {
        for (RAM ram: RAMList) {
            if (ram.getName().equals(name)) {
                return ram;
            }
        }
        return null;
    }
}
