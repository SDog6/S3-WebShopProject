package project.fakedatabase;

import project.classes.product_class.Motherboard;
import project.classes.product_class.parent_class.BasicProduct;
import project.interfaces.IProductData;

import java.util.ArrayList;
import java.util.List;

public class FakeMotherboardData implements IProductData {

    private final List<Motherboard> MotherbList;

    public FakeMotherboardData() {
        MotherbList = new ArrayList<>();

        Motherboard MPGB550 = new Motherboard("MSI MPG B550 GAMING PLUS - Motherboard - ATX - Socket AM4 ","MSI",139,5,"s","AMD B550",false);

        MotherbList.add(MPGB550);

    }

    @Override
    public boolean AddProduct(BasicProduct Product) {
        if (Product!=null){
            MotherbList.add((Motherboard)Product);
            return true;
        }
        return false;
    }

    @Override
    public boolean RemoveProduct(BasicProduct Product) {
        if (Product!=null){
            MotherbList.remove((Motherboard)Product);
            return true;
        }
        return false;
    }

    @Override
    public List<BasicProduct> GetAllProducts() {
        List<BasicProduct> temp = new ArrayList<>();
        for (Motherboard motherb:this.MotherbList) {
            temp.add(motherb);
        }
        return temp;
    }

    @Override
    public BasicProduct GetProductByName(String name) {
        for (Motherboard motherb: MotherbList) {
            if (motherb.getName().equals(name)) {
                return motherb;
            }
        }
        return null;
    }
}
