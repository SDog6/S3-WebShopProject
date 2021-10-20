package project.fakedatabase;

import project.classes.product_class.Powersupply;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakePowersupplyData implements IProductData {

    private final List<Powersupply> PowerSupplyList;

    public FakePowersupplyData() {
        PowerSupplyList =  new ArrayList<>();


        Powersupply SuperS = new Powersupply("650W V2.3 Super Silent Series Power Supply","LC-Power",63,2,650);

        PowerSupplyList.add(SuperS);


    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            PowerSupplyList.add((Powersupply)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            PowerSupplyList.remove((Powersupply)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Powersupply power:this.PowerSupplyList) {
            temp.add(power);
        }
        return temp;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (Powersupply power: PowerSupplyList) {
            if (power.getName().equals(name)) {
                return power;
            }
        }
        return null;
    }
}
