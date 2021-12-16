package project.fakedatabase;

import project.Models.product_class.Motherboard;
import project.Models.product_class.parent_class.BasicProduct;

import java.util.ArrayList;
import java.util.List;

public class FakeMotherboardData {

    private final List<Motherboard> MotherbList;

    public FakeMotherboardData() {
        MotherbList = new ArrayList<>();

        Motherboard MPGB550 = new Motherboard("MSI MPG B550 GAMING PLUS - Motherboard - ATX - Socket AM4 ","MSI",139,5,"s",0,"AMD B550",false);

        MotherbList.add(MPGB550);

    }

    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            MotherbList.add((Motherboard)Product);
            return true;
        }
        return false;
    }

    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            MotherbList.remove((Motherboard)Product);
            return true;
        }
        return false;
    }

    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Motherboard motherb:this.MotherbList) {
            temp.add(motherb);
        }
        return temp;
    }


    public BasicProduct GetProductByName(String name) {
        for (Motherboard motherb: MotherbList) {
            if (motherb.getName().equals(name)) {
                return motherb;
            }
        }
        return null;
    }
}
