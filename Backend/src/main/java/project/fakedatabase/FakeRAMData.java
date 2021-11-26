package project.fakedatabase;

import project.DTO.product_class.RAM;
import project.DTO.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeRAMData implements IProductData {

    private final List<RAM> RAMList;

    public FakeRAMData() {

        RAMList = new ArrayList<>();


        RAM Corsair = new RAM("Corsair 32GB, DDR4, 3200MHz 32GB DDR4 3200MHz Memory Module","Corsair",749,999,"s",32,3200);

        RAMList.add(Corsair);
    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            RAMList.add((RAM)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            RAMList.remove((RAM)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (RAM ram:this.RAMList) {
            temp.add(ram);
        }
        return temp;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (RAM ram: RAMList) {
            if (ram.getName().equals(name)) {
                return ram;
            }
        }
        return null;
    }
}
