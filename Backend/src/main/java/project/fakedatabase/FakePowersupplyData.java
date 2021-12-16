package project.fakedatabase;

import project.Models.product_class.Powersupply;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

public class FakePowersupplyData {

    private final List<Powersupply> PowerSupplyList;

    public FakePowersupplyData() {
        PowerSupplyList =  new ArrayList<>();


        Powersupply SuperS = new Powersupply("650W V2.3 Super Silent Series Power Supply","LC-Power",63,2,"s",0,650);

        PowerSupplyList.add(SuperS);


    }

    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            PowerSupplyList.add((Powersupply)Product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            PowerSupplyList.remove((Powersupply)Product);
            return true;
        }
        return false;
    }


    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Powersupply power:this.PowerSupplyList) {
            temp.add(power);
        }
        return temp;
    }


    public BasicProduct GetProductByName(String name) {
        for (Powersupply power: PowerSupplyList) {
            if (power.getName().equals(name)) {
                return power;
            }
        }
        return null;
    }
}
